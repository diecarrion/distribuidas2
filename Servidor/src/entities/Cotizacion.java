package entities;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dto.*;


@Entity
@Table(name="Cotizaciones")
public class Cotizacion {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	private float precioTotal;
	@ManyToOne
	@JoinColumn(name="id_Oficina", referencedColumnName="id")
	private OficinaVenta oficina;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<RodamientoCotizado> rodamientos = new ArrayList<RodamientoCotizado>();
	
	public Cotizacion() {

	}

	public Cotizacion(Date fecha, OficinaVenta oficina){
		this.fecha = fecha;
		this.oficina = oficina;
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
