package entities;

import java.util.Date;

import dto.FacturaVO;
import dto.ItemFacturaVO;

public class ItemFactura {
	private int id;
	private int cantidad;
	private float precioUnitario;
	private Rodamiento rodamiento;
	
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
