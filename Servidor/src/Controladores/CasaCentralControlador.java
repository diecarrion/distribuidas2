package Controladores;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import bean.dao.ClienteDAO;
import bean.srv.ClienteSRV;
import bean.srv.ListaPrecioSRV;
import bean.srv.OficinaVentaSRV;
import bean.srv.ProveedorSRV;
import bean.srv.RodamientoSRV;
import bean.srv.StockSRV;
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
	
	public void altaCliente(String identificacion, String telefono, String cuit, String direccion, String provincia, int idOficinaVenta) throws RemoteException
	{
		Cliente c = new Cliente(identificacion,cuit,telefono, direccion, provincia, OficinaVentaSRV.getOficinaVenta(idOficinaVenta));
		ClienteSRV.altaCliente(c);
	}
	
	public void modificarCliente(int idCliente, String identificacion, String telefono, String direccion) throws RemoteException
	{
		Cliente c = ClienteSRV.buscarCliente(idCliente);
		if(c != null)
		{
			c.setIdentificacion(identificacion);
			c.setTelefono(telefono);
			c.setDireccion(direccion);
			ClienteSRV.modificarCliente(c);
		}
	}

	public void bajaCliente(int idCliente) throws RemoteException
	{
			ClienteSRV.bajaCliente(idCliente);
	}
	
	public ClienteVO buscarCliente(int idCliente) throws RemoteException
	{
		Cliente c = ClienteSRV.buscarCliente(idCliente);
		if(c != null)
		{
			return c.toVO();
		}
		
		return null;
	}
	
	public void altaProveedor(String identificacion, String telefono, String cuit, String direccion, String provincia) throws RemoteException
	{
		Proveedor p = new Proveedor(identificacion,cuit,telefono, direccion,provincia);
		ProveedorSRV.altaProveedor(p);
	}
	
	public void modificarProveedor(int idProveedor, String identificacion, String telefono, String direccion, String provincia) throws RemoteException
	{
		Proveedor p = ProveedorSRV.buscarProveedor(idProveedor);
		if(p != null)
		{
			p.setIdentificacion(identificacion);
			p.setTelefono(telefono);
			p.setDireccion(direccion);
			p.setProvincia(provincia);
			ProveedorSRV.modificarProveedor(p);
		}
	}
	
	public void bajaProveedor(int idProveedor) throws RemoteException
	{
		ProveedorSRV.bajaProveedor(idProveedor);
	}
	
	public ProveedorVO buscarProveedor(int idProveedor) throws RemoteException
	{
		Proveedor p = ProveedorSRV.buscarProveedor(idProveedor);
		if(p != null)
		{
			return p.toVO();
		}
		
		return null;
	}
	
	
	
	
	public List<OrdenCompraProveedorVO> comprarRodamientos(List<OrdenCompraClienteVO> ordenesCompraCliente) throws RemoteException
	{
		return null;
	}
	
	public List<BultoCCVO> generarEntrega(List<RodamientoVO> listaRodamientos, List<RemitoProveedorVO> remitosProveedor) throws RemoteException
	{
		return null;
	}
	

}
