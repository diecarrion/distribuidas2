package dto;

import java.util.ArrayList;

public class RodamientoCotizadoVO {
	private int id;
	private RodamientoVO rodamiento;
	private float precioTotal;
	private ProveedorVO proveedor;
	public RodamientoCotizadoVO() {

	}
	
	public RodamientoCotizadoVO(RodamientoVO rodamiento, float precioTotal, ProveedorVO proveedor){
		this.rodamiento = rodamiento;
		this.precioTotal = precioTotal;
		this.proveedor = proveedor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}
	
	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precio) {
		this.precioTotal = precio;
	}

}
