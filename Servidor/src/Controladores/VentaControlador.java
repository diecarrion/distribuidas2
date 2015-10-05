package Controladores;
import java.rmi.RemoteException;

import dto.*;
import bean.*;
import bean.srv.ClienteSRV;
import bean.srv.CotizacionSRV;
import bean.srv.FacturaSRV;
import bean.srv.OrdenCompraSRV;
import bean.srv.PedidoSRV;
import entities .*;

import java.util.*;

public class VentaControlador {

		static VentaControlador controlador;
		
		public static VentaControlador getControlador() {
			if(controlador == null ){
				controlador=new VentaControlador();
			}
			return controlador;
		}
		
		public OrdenCompraClienteVO generarVenta(int idCliente, int idCotizacion, Date fechaVenta) throws RemoteException
		{
			Cliente cliente = ClienteSRV.buscarCliente(idCliente);
			Cotizacion cot = CotizacionSRV.buscarCotizacion(idCotizacion);
			//Creo pedido y lo enlazo con cotizacion
			Pedido pedido = new Pedido(fechaVenta,cliente.getOficinaVenta(), cliente,cot);
			PedidoSRV.grabarPedido(pedido);
			
			//calculo fecha entrega
			//hay que levantarla de un xml, luego que CC, termine compraRodamientos
			//Date fechaEntrega = CalcularFechaEntrega();
			Date fechaEntrega = new Date();
			RemitoCliente rc = new RemitoCliente(fechaEntrega,cliente);
			
			//creo orden de compra cliente
			OrdenCompraCliente occ = new OrdenCompraCliente(fechaEntrega,cliente.getOficinaVenta(),cliente,rc,pedido);
			OrdenCompraSRV.grabarOrdenCompraCliente(occ);
			
			
		
			return occ.toVO();
		
		}
}
