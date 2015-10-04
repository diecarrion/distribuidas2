package rmi;

import interfaz.ISistemaRemote;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

import Controladores.ClienteControlador;
import Controladores.CotizacionControlador;
import Controladores.ProveedorControlador;
import dto.*;


//importar controladores

public class SistemaRemote extends UnicastRemoteObject implements ISistemaRemote {

	public SistemaRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoVO> listaRodamientos, Date validez) throws RemoteException
	{
		return CotizacionControlador.getControlador().generarCotizacion(idCliente, listaRodamientos, validez);
	}
	
	public FacturaVO generarVenta(int idCliente, int idCotizacion) throws RemoteException
	{
		return new FacturaVO();
	}
	
	public List<BultoOVVO> generarEntrega (List<Integer> idsOrdenCompra, RemitoTransporteVO remitoTransporte) throws RemoteException
	{
		return null;		
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
	
	public ComparativaPrecioVO procesarListaPreciosProgramada() throws RemoteException
	{
		return new ComparativaPrecioVO();
	}
	
	public ComparativaPrecioVO publicarPreciosComparados(List<ListaPrecioVO> listaPrecios) throws RemoteException
	{
		return new ComparativaPrecioVO();
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
	
	public RemitoTransporteVO buscarRemito(int idRemito) throws RemoteException
	{
		return new RemitoTransporteVO();
	}
	
	public ProveedorVO buscarProveedor (int idProveedor) throws RemoteException
	{
		return ProveedorControlador.getControlador().buscarProveedor(idProveedor);
	}

}