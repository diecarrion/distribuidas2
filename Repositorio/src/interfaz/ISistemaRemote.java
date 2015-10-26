package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.*;

public interface ISistemaRemote extends Remote {
	
	//Oficina de ventas
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoCotizadoVO> listaRodamientos, Date validez) throws RemoteException;
	
	public OrdenCompraClienteVO generarVenta(int idCliente, int idCotizacion, Date fechaVenta) throws RemoteException;
	
	public List<BultoOVVO> generarEntrega (List<Integer> idsOrdenCompra, BultoCCVO bultoCC) throws RemoteException;
	
	public void altaCliente(String identificacion, String telefono, String cuit, String direccion, String provincia, int idOficinaVenta) throws RemoteException;
	
	public void modificarCliente(int idCliente, String identificacion, String telefono, String direccion) throws RemoteException;
	
	public void bajaCliente(int idCliente) throws RemoteException;
	
	public ClienteVO buscarCliente(int idCliente) throws RemoteException;
	
	//Casa Central
	
	public List<ComparativaPrecioVO> publicarPreciosComparados(List<ListaPrecioVO> listaPrecios) throws RemoteException;
		
	public RemitoTransporteVO buscarRemito(int idRemito) throws RemoteException;
	

}
