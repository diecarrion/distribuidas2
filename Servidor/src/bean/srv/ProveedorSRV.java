package bean.srv;

import entities.*;
import bean.dao.*;


public class ProveedorSRV {

	private static ProveedorDAO dao;
	static {
		dao = ProveedorDAO.getInstancia();
	}
	
	public static void altaProveedor(Proveedor proveedor){
		dao.grabarProveedor(proveedor);
	}
	
	public static Proveedor buscarProveedor(int idProveedor){
		return dao.getProveedor(idProveedor);
	}
	
	public static void modificarProveedor(Proveedor proveedor){
		dao.modificarProveedor(proveedor);
	}
	
	public static void bajaProveedor(int idProveedor){
		dao.eliminarProveedor(idProveedor);
	}
}
