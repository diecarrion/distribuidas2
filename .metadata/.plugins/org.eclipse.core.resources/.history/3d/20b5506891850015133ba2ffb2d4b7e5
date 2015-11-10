package Controladores;

import java.rmi.RemoteException;

import dto.*;
import entities.*;
import bean.dao.ClienteDAO;
import bean.srv.ClienteSRV;
import bean.srv.OficinaVentaSRV;

public class ClienteControlador {
	
	static ClienteControlador controlador;
	
	public static ClienteControlador getControlador() {
		if(controlador == null ){
			controlador=new ClienteControlador();
		}
		return controlador;
	}
	
	public void altaCliente(String identificacion, String telefono, String cuit, String direccion, String provincia, int idOficinaVenta) throws RemoteException
	{
		Cliente c = new Cliente(identificacion,cuit,telefono, direccion, provincia, OficinaVentaSRV.getOficinaVenta(idOficinaVenta));
		ClienteSRV.altaCliente(c);
	}
	
	public void test()
	{
		ClienteDAO test = ClienteDAO.getInstancia();
		
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

}
