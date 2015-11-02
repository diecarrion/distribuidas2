package entities;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name="RodamientoCotizados")
public class RodamientoCotizado {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private float precioUnit;
	private int cantidad;
	@OneToOne
	@JoinColumn(name="id_Rodamiento", referencedColumnName="id")
	private Rodamiento rodamiento;
	@OneToOne
	@JoinColumn(name="id_Proveedor", referencedColumnName="id")
	private Proveedor proveedor;
	
	
	public RodamientoCotizado() {
	}
	
	public RodamientoCotizado(Rodamiento rodamiento, float precioUnit, Proveedor proveedor, int cantidad){
		this.rodamiento = rodamiento;
		this.precioUnit = precioUnit;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Rodamiento getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public float getPrecioUnitario() {
		return precioUnit;
	}

	public void setPrecioUnitario(float precio) {
		this.precioUnit = precio;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
