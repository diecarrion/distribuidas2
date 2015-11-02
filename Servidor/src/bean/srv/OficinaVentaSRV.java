package bean.srv;

import entities.*;
import bean.dao.*;

public class OficinaVentaSRV {
	
	private static OficinaDAO dao;
	static {
		dao = OficinaDAO.getInstancia();
	}
	
	public static OficinaVenta getOficinaVenta(int idOficinaVenta)
	{
		return dao.getOficina(idOficinaVenta);
	}

}
