package rmi;

import interfaz.ISistemaRemote;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

import Controladores.CasaCentralControlador;
import Controladores.ClienteControlador;
import Controladores.CotizacionControlador;
import Controladores.EntregaControlador;
import Controladores.ProveedorControlador;
import Controladores.VentaControlador;
import dto.*;


//importar controladores

public class SistemaRemote extends UnicastRemoteObject implements ISistemaRemote {

	public SistemaRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoCotizadoVO> listaRodamientos, Date validez) throws RemoteException
	{
		return CotizacionControlador.getControlador().generarCotizacion(idCliente, listaRodamientos, validez);
	}
	
	public OrdenCompraClienteVO generarVenta(int idCliente, int idCotizacion, Date fechaVenta) throws RemoteException
	{
		return VentaControlador.getControlador().generarVenta(idCliente, idCotizacion, fechaVenta);
	}
	
	public List<BultoOVVO> generarEntrega (List<Integer> idsOrdenCompra, BultoCCVO bultoCC) throws RemoteException
	{
		return EntregaControlador.getControlador().generarEntrega(idsOrdenCompra, bultoCC);	
	}
	
	public void altaCliente(String identificacion, String telefono, String cuit, String direccion, String provincia, int idOficinaVenta) throws RemoteException
	{
		 ClienteControlador.getControlador().altaCliente(identificacion, telefono, cuit, direccion, provincia, idOficinaVenta);
	}
	
	public void modificarCliente(int idCliente, String identificacion, String telefono, String direccion) throws RemoteException
	{
		ClienteControlador.getControlador().modificarCliente(idCliente, identificacion, telefono, direccion); 
		
	}
	
	public void bajaCliente(int idCliente) throws RemoteException
	{
		ClienteControlador.getControlador().bajaCliente(idCliente);
	}
	
	public ClienteVO buscarCliente(int idCliente) throws RemoteException
	{
		return ClienteControlador.getControlador().buscarCliente(idCliente);
	}
	
	//Casa Central
	
	public List<ComparativaPrecioVO> publicarPreciosComparados(List<ListaPrecioVO> listaPrecios) throws RemoteException
	{
		return CasaCentralControlador.getControlador().procesarListaPreciosProgramada(listaPrecios);
	}
	public RemitoTransporteVO buscarRemito(int idRemito) throws RemoteException
	{
		return new RemitoTransporteVO();
	}

}
