package entities;
import java.util.*;

import dto.*;

public class Cotizacion {
	
	private int id;
	private Date fecha;
	private float precioTotal;
	private OficinaVenta oficina;
	private List<RodamientoCotizado> rodamientos;
	
	public Cotizacion() {

	}

	public Cotizacion(Date fecha, OficinaVenta oficina){
		this.fecha = fecha;
		this.oficina = oficina;
		this.rodamientos = new ArrayList<RodamientoCotizado>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	public List<RodamientoCotizado> getRodamientos() {
		return rodamientos;
	}
	
	public void setRodamientos(List<RodamientoCotizado> rodamientos) {
		this.rodamientos = rodamientos;
	}
	
	public CotizacionVO toVO(){
		return new CotizacionVO(this.getFecha(),this.getOficinaVenta().toVO());
}

}
