package bean.srv;

import entities.*;
import bean.dao.*;

public class ClienteSRV {
	private static ClienteDAO dao;
	static {
		dao = ClienteDAO.getInstancia();
	}
	public static void altaCliente(Cliente cliente){
		dao.grabarCliente(cliente);
	}
	
	public static Cliente buscarCliente(int idCliente){
		return dao.getCliente(idCliente);
	}
	
	public static void modificarCliente(Cliente cliente){
		dao.modificarCliente(cliente);
	}
	
	public static void bajaCliente(int idCliente){
		dao.eliminarCliente(idCliente);
	}
	
	public static float aplicarDescuentoCliente(Cliente c, float precio){
		float precioDesc = precio;
		for(DescuentoCliente dc: c.getDescuentos())
		{
			//A Implementar
			
		}
		return precioDesc;
	}
}
