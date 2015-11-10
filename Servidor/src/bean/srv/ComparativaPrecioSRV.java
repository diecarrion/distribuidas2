package bean.srv;
import dto.*;
import bean.dao.*;
import entities.*;
import java.util.*;

public class ComparativaPrecioSRV {

	private static ComparativaDAO dao;
	static {
		dao = ComparativaDAO.getInstancia();
	}
	
	public void grabarComparativa(ComparativaPrecio comp){
		dao.grabarComparativa(comp);
	}
	public List<ComparativaPrecioVO> consCompPaisOrigen(String paisOrigen) {
		// TODO Auto-generated method stub
		return dao.consCompPaisOrigen(paisOrigen);
	}

	public List<ComparativaPrecioVO> consCompMarca(String marca) {
		// TODO Auto-generated method stub
		return dao.consCompMarca(marca);
	}

	public List<ComparativaPrecioVO> consCompCodigoSFKyPaisOrigen(
			String codigoSFK, String paisOrigen) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoSFKyPaisOrigen(codigoSFK, paisOrigen);
	}

	public List<ComparativaPrecioVO> consCompCodigoSFKyMarca(String codigoSFK,
			String marca) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoSFKyMarca(codigoSFK, marca);
	}

	public List<ComparativaPrecioVO> consCompCodigoSFK(String codigoSFK) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoSFK(codigoSFK);
	}

	public List<ComparativaPrecioVO> consCompCodigoFabricanteyMarca(
			String codigoFabricante, String marca) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoFabricanteyMarca(codigoFabricante, marca);
	}

	public List<ComparativaPrecioVO> consCompCodigoFabricante(
			String codigoFabricante) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoFabricante(codigoFabricante);
	}

	public List<ComparativaPrecioVO> consCompCodigoFabricanteyPaisOrigen(
			String codigoFabricante, String paisOrigen) {
		// TODO Auto-generated method stub
		return dao.consCompCodigoFabricanteyPaisOrigen(codigoFabricante, paisOrigen);
	}
}
