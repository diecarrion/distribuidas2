package bean.srv;

import entities.*;

public class ClienteSRV {
/*	private static ClienteDAO dao;
	static {
		dao = ClienteDAO.getInstancia();
	}*/
	public static void altaCliente(Cliente cliente){
		// A IMPLEMENTAR
	}
	
	public static Cliente buscarCliente(int idCliente){
		// A IMPLEMENTAR
		return new Cliente();
	}
	
	public static void modificarCliente(Cliente cliente){
		// A IMPLEMENTAR
	}
	
	public static void bajaCliente(Cliente cliente){
		// A IMPLEMENTAR
	}
	
	//trabajar en esta logica. aplicar tipos de descuentos, herencias etc
	public static float aplicarDescuentoCliente(Cliente c, float precio){
		float mejorPrecio = precio;
		for(DescuentoCliente dc: c.getDescuentos())
		{
			//A Implementar
			if(dc.getCondEsp() == "Procentaje")
			{
				float  newPrecio = precio * (dc.getPorcentaje()/100);
				if (newPrecio < mejorPrecio)
				{
					mejorPrecio = newPrecio;
				}
			}
			
		}
		return mejorPrecio;
	}
}
