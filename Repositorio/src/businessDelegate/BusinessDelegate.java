package businessDelegate;

import interfaz.ISistemaRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import dto.*;

public class BusinessDelegate {
	
private ISistemaRemote sistemaRemote;
	
    public BusinessDelegate() {
		super();
		getStub();
	}

	public boolean getStub() {
    	try {
    		
    		sistemaRemote = (ISistemaRemote)Naming.lookup ("//localhost/Sistema");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
	
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoCotizadoVO> listaRodamientos, Date validez) throws RemoteException
	{
		return sistemaRemote.generarCotizacion(idCliente, listaRodamientos, validez);
	}
	
	public OrdenCompraClienteVO generarVenta(int idCliente, int idCotizacion, Date fechaVenta) throws RemoteException
	{
		return sistemaRemote.generarVenta(idCliente, idCotizacion, fechaVenta);
	}
	
	public List<BultoOVVO> generarEntrega (List<Integer> idsOrdenCompra, BultoCCVO bultoCC) throws RemoteException
	{
		return sistemaRemote.generarEntrega(idsOrdenCompra, bultoCC);
	}
	
	public void altaCliente(String identificacion, String telefono, String cuit, String direccion, String provincia, int idOficinaVenta) throws RemoteException
	{
		  sistemaRemote.altaCliente(identificacion, telefono, cuit, direccion, provincia, idOficinaVenta);
	}
	
	public void modificarCliente(int idCliente, String identificacion, String telefono, String direccion) throws RemoteException
	{
		 sistemaRemote.modificarCliente(idCliente, identificacion, telefono, direccion);
	}
	
	public void bajaCliente(int idCliente) throws RemoteException
	{
		sistemaRemote.bajaCliente(idCliente);
	}
	
	public ClienteVO buscarCliente(int idCliente) throws RemoteException
	{
		return sistemaRemote.buscarCliente(idCliente);
	}
	
	//Casa Central
	
	public void altaProveedor(String identificacion, String telefono, String cuit, String direccion, String provincia) throws RemoteException
	{
		sistemaRemote.altaProveedor(identificacion, telefono, cuit, direccion, provincia);
	}
	
	public void modificarProveedor(int idProveedor, String identificacion, String telefono, String direccion, String provincia) throws RemoteException
	{
		sistemaRemote.modificarProveedor(idProveedor, identificacion, telefono, direccion, provincia);
	}
	
	public void bajaProveedor(int idProveedor) throws RemoteException
	{
		sistemaRemote.bajaProveedor(idProveedor);
	}
	
	public ComparativaPrecioVO procesarListaPreciosProgramada() throws RemoteException
	{
		return null;
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
		return sistemaRemote.buscarProveedor(idProveedor);
	}


}
