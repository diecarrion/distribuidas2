package Controladores;
import java.util.*;
import java.sql.*;
import dto.*;
import bean.srv.*;
import entities.*;

public class ComparativaControlador {

static ComparativaControlador controlador;
	
	public static ComparativaControlador getControlador() {
		if(controlador == null ){
			controlador=new ComparativaControlador();
		}
		return controlador;
	}
	
	public void altaComparativa(int idProveedor, ListaPrecio lp) {
		// TODO Auto-generated method stub
		int idLista = lp.getId();
		float descuentoLista = 100;
		if (lp.getDescuentoLista()>0){
			descuentoLista = lp.getDescuentoLista();
		} 

		java.util.Date fecha = new java.util.Date();
		java.sql.Date FechaVigenciaDesde = new java.sql.Date(fecha.getTime());
		java.sql.Date FechaVigenciaHasta = lp.getFechaVigenciaHasta();
		
		ComparativaPrecio comp = new ComparativaPrecio();
		
		for(ListaPrecioDetalle itl:lp.getDetalles()){
			Rodamiento newRod = new Rodamiento();
			
			newRod.setCodigoSKF(itl.getRodamiento().getCodigoSKF());
			newRod.setMarca(itl.getRodamiento().getMarca());
			newRod.setOrigen(itl.getRodamiento().getOrigen());
			newRod.setCaracteristicas(itl.getRodamiento().getCaracteristicas());
			newRod.setCodigoFabricante(itl.getRodamiento().getCodigoFabricante());
			
			float precioUnitario = itl.getPrecio();
			int stockDisp = itl.getStockDisp();
			float descuentoItem = itl.getPorcDescuento();
		
			if (descuentoItem == 0){
				descuentoItem = 100;
			} 
			float precioCalculado = precioUnitario * ((100-descuentoItem)/100) * ((100-descuentoLista)/100);
			
			comp.setIdComparativaPrecio(newRod.getCodigoFabricante(),newRod.getCodigoSKF(),lp.getId(),idProveedor);
			comp.setPrecioCalculado(precioCalculado);
			comp.setStockDisp(stockDisp);
			
			new ComparativaPrecioSRV().grabarComparativa(comp);
		}	
	}
		
		public List<ComparativaPrecioVO> consCompPaisOrigen(String paisOrigen) {
			// TODO Auto-generated method stub
			 return new ComparativaPrecioSRV().consCompPaisOrigen(paisOrigen);
		}

		public List<ComparativaPrecioVO> consCompMarca(String marca) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompMarca(marca);
		}

		public List<ComparativaPrecioVO> consCompCodigoSFKyPaisOrigen(
				String codigoSFK, String paisOrigen) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoSFKyPaisOrigen(codigoSFK, paisOrigen);
		}

		public List<ComparativaPrecioVO> consCompCodigoSFKyMarca(String codigoSFK,
				String marca) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoSFKyMarca(codigoSFK, marca);
		}

		public List<ComparativaPrecioVO> consCompCodigoSFK(String codigoSFK) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoSFK(codigoSFK);
		}

		public List<ComparativaPrecioVO> consCompCodigoFabricanteyMarca(
				String codigoFabricante, String marca) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoFabricanteyMarca(codigoFabricante, marca);
		}

		public List<ComparativaPrecioVO> consCompCodigoFabricante(
				String codigoFabricante) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoFabricante(codigoFabricante);
		}

		public List<ComparativaPrecioVO> consCompCodigoFabricanteyPaisOrigen(
				String codigoFabricante, String paisOrigen) {
			// TODO Auto-generated method stub
			return new ComparativaPrecioSRV().consCompCodigoFabricanteyPaisOrigen(codigoFabricante, paisOrigen);
		}
		
	}

