package dto;

import java.util.ArrayList;

public class RodamientoCotizadoVO {
	private int id;
	private RodamientoVO rodamiento;
	private float precioUnit;
	private int cantidad;
	private ProveedorVO proveedor;
	public RodamientoCotizadoVO() {

	}
	
	public RodamientoCotizadoVO(RodamientoVO rodamiento, float precioUnit, ProveedorVO proveedor, int cantidad){
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
