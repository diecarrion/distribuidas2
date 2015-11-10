package dto;

import java.io.Serializable;

public class ListaPrecioDetalleVO implements Serializable {

	private RodamientoVO rodamiento;
	private int stockDisp;
	private float precioUnit;
	private float porcDescuento;
	
	public ListaPrecioDetalleVO(RodamientoVO rodamiento, int stockDisp,
			float precioUnit, float porcDescuento) {
		super();
		this.rodamiento = rodamiento;
		this.stockDisp = stockDisp;
		this.precioUnit = precioUnit;
		this.porcDescuento = porcDescuento;
	}

	public ListaPrecioDetalleVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public int getStockDisp() {
		return stockDisp;
	}

	public void setStockDisp(int stockDisp) {
		this.stockDisp = stockDisp;
	}

	public float getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(float precioUnit) {
		this.precioUnit = precioUnit;
	}

	public float getPorcDescuento() {
		return porcDescuento;
	}

	public void setPorcDescuento(float porcDescuento) {
		this.porcDescuento = porcDescuento;
	}
}
