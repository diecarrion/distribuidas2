package Controladores;
import entities.*;

import java.rmi.RemoteException;
import java.util.*;

import dto.*;
import entities.Factura;
import entities.ItemFactura;
import entities.OrdenCompraCliente;
import entities.RodamientoCotizado;
import bean.*;
import bean.srv.BultoOVSRV;
import bean.srv.FacturaSRV;
import bean.srv.OrdenCompraSRV;

public class EntregaControlador {
	static EntregaControlador controlador;
	
	public static EntregaControlador getControlador() {
		if(controlador == null ){
			controlador=new EntregaControlador();
		}
		return controlador;
	}
	
	public List<BultoOVVO> generarEntrega (List<Integer> idsOrdenCompra, BultoCCVO bultoCC) throws RemoteException
	{
		List<OrdenCompraCliente> ordenes = new ArrayList<OrdenCompraCliente>();
		List<BultoOV> bultosaEntregar = new ArrayList<BultoOV>();
			
			if(idsOrdenCompra.size() !=0)
			{
				//primer bulto
				OrdenCompraCliente oc = OrdenCompraSRV.buscarOrdenCompraCliente(idsOrdenCompra.get(0));
				BultoOV newBulto = new BultoOV(oc.getFecha(),oc.getOficinaVenta(), oc.getCliente(), oc.getRemitoCliente());
				newBulto.addOrdenCompraCliente(oc);
				bultosaEntregar.add(newBulto);
				BultoOVSRV.grabarBulto(newBulto);
				
				//desde la segunda OC en adelante
				for (int id = 1; id < idsOrdenCompra.size(); id++)
				{
					oc = OrdenCompraSRV.buscarOrdenCompraCliente(id);
					for(BultoOV bulto : bultosaEntregar)
					{
						//si es el mismo cliente, agrego OC al bulto, sino creo uno nuevo
						if(bulto.getCliente().getId() == oc.getCliente().getId())
						{
							bulto.addOrdenCompraCliente(oc);
							BultoOVSRV.updateBulto(bulto);
						}
						else
						{
						 newBulto = new BultoOV(oc.getFecha(),oc.getOficinaVenta(), oc.getCliente(), oc.getRemitoCliente());
						 newBulto.addOrdenCompraCliente(oc);
						 bultosaEntregar.add(newBulto);
						 BultoOVSRV.grabarBulto(newBulto);
						}
						
					}
				}
				
				//facturo por bulto 
				List<BultoOVVO> bultosVOaEntregar = new ArrayList<BultoOVVO>();
				for(BultoOV bultoFactura : bultosaEntregar)
				{
					float total = 0;
					List<ItemFactura> itemsFactura = new ArrayList<ItemFactura>();
					for(OrdenCompraCliente o : bultoFactura.getOrdenes()){
						for(RodamientoCotizado rod: o.getPedido().getCotizacion().getRodamientos())
						{
							ItemFactura item = new ItemFactura(rod.getCantidad(), rod.getPrecioUnitario(),rod.getRodamiento());
							total += total + (rod.getCantidad() * rod.getPrecioUnitario());
						}		
					}
				
					Date today = Calendar.getInstance().getTime();
					Factura factura = new Factura(today,total,oc.getOficinaVenta(),oc.getCliente(), itemsFactura);
					FacturaSRV.grabarFactura(factura);
					bultoFactura.setFactura(factura);
					BultoOVSRV.updateBulto(bultoFactura);
					bultosVOaEntregar.add(bultoFactura.toVO());
				}
				
				return bultosVOaEntregar;
				
			}
			
			return null;
	}

}
