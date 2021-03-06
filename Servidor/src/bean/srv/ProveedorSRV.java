package bean.srv;

import hbt.HibernateUtil;
import entities.*;
import bean.dao.*;


public class ProveedorSRV {

	private static ProveedorDAO dao;
	private static OrdenCompraProveedorDAO ordendao;
	private static RemitoProveedorDAO remitodao;
	static {
		dao = ProveedorDAO.getInstancia();
		ordendao = OrdenCompraProveedorDAO.getInstancia();
		remitodao = RemitoProveedorDAO.getInstancia();
	}
	

	
	public static void altaProveedor(Proveedor proveedor){
		dao.grabarProveedor(proveedor);
	}
	
	public static Proveedor buscarProveedor(int idProveedor){
		return dao.getProveedor(idProveedor);
	}
	
	public static OrdenCompraProveedor buscarOrdenCompraProveedor(int idOrdenCompra){
		return ordendao.getOrdenCompraProveedor(idOrdenCompra);
	}
	
	public static RemitoProveedor buscarRemitoProveedor(int id){
		return remitodao.getRemito(id);
	}
	
	public static void grabarRemito(RemitoProveedor remito){
		 remitodao.grabarRemitoProveedor(remito);
	}
	
	public static void modificarProveedor(Proveedor proveedor){
		dao.modificarProveedor(proveedor);
	}
	
	public static void bajaProveedor(int idProveedor){
		dao.eliminarProveedor(idProveedor);
	}
}
