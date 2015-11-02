package entities;


import javax.persistence.*;

import dto.*;

@Entity
@Table(name="ItemsFactura")
public class ItemFactura {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private int cantidad;
	private float precioUnitario;
	@ManyToOne
	@JoinColumn(name="id_Rodamiento", referencedColumnName="id")
	private Rodamiento rodamiento;
	@ManyToOne
	@JoinColumn(name="id_Factura", referencedColumnName="id")
	private Factura factura;
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public ItemFactura()
	{
		
	}

	public ItemFactura(int cantidad, float precioUnitario, Rodamiento rodamiento)
	{
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.rodamiento = rodamiento;
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
	
	public ItemFacturaVO toVO(){
		return new ItemFacturaVO(this.getCantidad(),this.getPrecioUnitario(), this.getRodamiento().toVO());
	}

}
