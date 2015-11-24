package dto;

import java.io.Serializable;
import java.util.Date;

public class StockVO implements Serializable {
	private int id;
	private int cantidad;
	private float precioUnitario;
	private RodamientoVO rodamiento;
	private OrdenCompraProveedorVO ordenProveedor;
	
	public StockVO() {

	}

	public StockVO(int id, int cantidad, float precioUnitario, RodamientoVO rodamiento, OrdenCompraProveedorVO ordenProveedor){
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
	
	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public OrdenCompraProveedorVO getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedorVO ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}
}
