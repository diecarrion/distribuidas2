package entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Stock {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private int cantidad;
	private float precioUnitario;
	@OneToOne
	@JoinColumn(name="id_Rodamiento", referencedColumnName="id")
	private Rodamiento rodamiento;
	@OneToOne
	@JoinColumn(name="numero_Orden", referencedColumnName="numero")
	private OrdenCompraProveedor ordenProveedor;
	
	public Stock() {

	}

	public Stock(int id, int cantidad, float precioUnitario, Rodamiento rodamiento, OrdenCompraProveedor ordenProveedor){
		this.id = id;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.rodamiento = rodamiento;
		this.ordenProveedor = ordenProveedor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public float getPrecioUnitario(){
		return precioUnitario;
	}
	
	public void setPrecioUnitario(float precioUnitario){
		this.precioUnitario = precioUnitario;
	}
	
	public Rodamiento getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public OrdenCompraProveedor getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedor ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}
}
