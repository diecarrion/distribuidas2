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
    		System.out.println("Conectado al Servidor //localhost/Sistema");
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
	
	public void alta_listaPrecio(ListaPrecioVO lp) throws RemoteException 
	{
		try
		{
		 sistemaRemote.alta_listaPrecio(lp);
		}
		catch(RemoteException rex)
		{
			rex.printStackTrace();
		}
	}
	public RemitoTransporteVO buscarRemito(int idRemito) throws RemoteException
	{
		return new RemitoTransporteVO();
	}
	



}
