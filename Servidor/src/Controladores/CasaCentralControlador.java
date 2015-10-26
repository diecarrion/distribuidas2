package Controladores;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import bean.srv.ListaPrecioSRV;
import bean.srv.RodamientoSRV;
import dto.*;
import entities.*;

public class CasaCentralControlador {
	
static CasaCentralControlador controlador;
	
	public static CasaCentralControlador getControlador() {
		if(controlador == null ){
			controlador=new CasaCentralControlador();
		}
		return controlador;
	}
	
	public void altaProveedor(String identificacion, String telefono, String cuit, String direccion, String provincia) throws RemoteException
	{
		ProveedorControlador.getControlador().altaProveedor(identificacion, telefono, cuit, direccion, provincia);
	}
	
	public void modificarProveedor(int idProveedor, String identificacion, String telefono, String direccion, String provincia) throws RemoteException
	{
		ProveedorControlador.getControlador().modificarProveedor(idProveedor, identificacion, telefono, direccion, provincia);
	}
	
	public void bajaProveedor(int idProveedor) throws RemoteException
	{
		ProveedorControlador.getControlador().bajaProveedor(idProveedor);
	}
	
	public List<ComparativaPrecioVO> procesarListaPreciosProgramada(List<ListaPrecioVO> listaPrecios) throws RemoteException
	{
		
		List<ComparativaPrecioVO> cpList = new ArrayList<ComparativaPrecioVO>();
		//Agregar todas las listas de precio de todo en un array
		//Ya tenemos todas las listas con sus rodamientos en un solo lugar y nada nos va a quedar sin comparar
		//Ahora recorremos el array comparando por rodamiento
		List<ComparativaDetalleVO> listaUnica = new ArrayList<ComparativaDetalleVO>();
		
		for(ListaPrecioVO lp : listaPrecios)
		{
			ListaPrecio l = ListaPrecioSRV.buscarListaPrecio(lp.getId());
			for(ListaPrecioDetalle lpd : l.getDetalles())
			{
				ComparativaDetalleVO cd = new ComparativaDetalleVO(l.getId(),lpd.getRodamiento().getId(), lpd.getPrecio());
				listaUnica.add(cd);
			}
		}
		
		
		for(ComparativaDetalleVO det : listaUnica)
		{
			int lista = det.getIdListaPrecio();
			float menorPrecio = det.getPrecio();
			for(ComparativaDetalleVO det2 : listaUnica)
			{
				if(det.getIdRodamiento() == det2.getIdRodamiento() &&  det.getIdListaPrecio() != det2.getIdListaPrecio())
				{
					if(det2.getPrecio()< menorPrecio)
					{
						menorPrecio = det2.getPrecio();
						lista = det2.getIdListaPrecio();
					}
					
					listaUnica.remove(det2);
				}
				
			}
			ComparativaPrecioVO cpitem = new ComparativaPrecioVO(ListaPrecioSRV.buscarListaPrecio(lista).toVO(), RodamientoSRV.buscarRodamiento(det.getIdRodamiento()).toVO());
			cpList.add(cpitem);
		}
		
		return cpList;
	}
	
	public List<OrdenCompraProveedorVO> comprarRodamientos(List<OrdenCompraClienteVO> ordenesCompraCliente) throws RemoteException
	{
		return null;
	}
	
	public List<BultoCCVO> generarEntrega(List<RodamientoVO> listaRodamientos, List<RemitoProveedorVO> remitosProveedor) throws RemoteException
	{
		return null;
	}
	
	public void altaStock(int idRodamiento, int cantidadInicial, float precioUnidad, int idOrdenCompraProveedor) throws RemoteException
	{
	}
	
	public void actualizarStock(int idRodamiento, int cantidad, float precioUnidad, int idOrdenCompraProveedor) throws RemoteException
	{
	}
	
	public ProveedorVO buscarProveedor (int idProveedor) throws RemoteException
	{
		return ProveedorControlador.getControlador().buscarProveedor(idProveedor);
	}
	

}
