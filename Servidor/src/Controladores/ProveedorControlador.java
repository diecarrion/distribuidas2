package Controladores;
import java.rmi.RemoteException;

import dto.*;
import entities.*;
import bean.*;
import bean.srv.ClienteSRV;
import bean.srv.OficinaVentaSRV;
import bean.srv.ProveedorSRV;

public class ProveedorControlador {
	
	static ProveedorControlador controlador;
	
	public static ProveedorControlador getControlador() {
		if(controlador == null ){
			controlador=new ProveedorControlador();
		}
		return controlador;
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

}
