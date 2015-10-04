package dto;

import java.util.Date;

public class ItemFacturaVO {
	private int id;
	private int cantidad;
	private float precioUnitario;
	private FacturaVO factura;
	private RodamientoVO rodamiento;
	
	public ItemFacturaVO()
	{
		
	}

	public ItemFacturaVO(int id, int cantidad, float precioUnitario, FacturaVO factura, RodamientoVO rodamiento)
	{
		this.id = id;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.factura = factura;
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
	
	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
	}
	
	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

}
