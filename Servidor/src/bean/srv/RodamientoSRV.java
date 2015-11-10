package bean.srv;

import bean.dao.*;
import entities.*;

public class RodamientoSRV {

	private static RodamientoDAO dao;
	static {
		dao = RodamientoDAO.getInstancia();
	}
	
	public static Rodamiento buscarRodamiento(String idRodamiento){
		return dao.getRodamiento(idRodamiento);
	}
}
