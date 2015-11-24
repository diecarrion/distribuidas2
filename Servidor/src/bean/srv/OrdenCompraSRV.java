package bean.srv;

import entities.*;
import bean.dao.*;
public class OrdenCompraSRV {
	
	private static OrdenCompraClienteDAO dao;
	static {
		dao = OrdenCompraClienteDAO.getInstancia();
	}
	
	public static OrdenCompraCliente buscarOrdenCompraCliente(int idOrdenCompra){
		return dao.getOrdenCompraCliente(idOrdenCompra);
	}
	
	public static void grabarOrdenCompraCliente(OrdenCompraCliente ordenCompra){
		dao.grabarOrdenCompraCliente(ordenCompra);
	}

}
