package dto;

import java.io.Serializable;
import java.util.Date;

public class ItemOrdenCompraOVVO implements Serializable {
	private int id;
	private int cantidad;
	private RodamientoVO rodamiento;
	private OrdenCompraClienteVO ordenCliente;
	
	public ItemOrdenCompraOVVO() {

	}

	public ItemOrdenCompraOVVO(int id, int cantidad, RodamientoVO rodamiento, OrdenCompraClienteVO ordenCliente){
		this.id = id;
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.ordenCliente = ordenCliente;
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
	
	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public OrdenCompraClienteVO getOrdenCliente() {
		return ordenCliente;
	}

	public void setOrdenCliente(OrdenCompraClienteVO ordenCliente) {
		this.ordenCliente = ordenCliente;
	}

}
