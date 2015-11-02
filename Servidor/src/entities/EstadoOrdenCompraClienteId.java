package entities;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EstadoOrdenCompraClienteId implements Serializable {

	private int id_ordenCompraCliente;
	private int id_ordenCompraProveedor;
	
	public EstadoOrdenCompraClienteId()
	{
		
		
	}
	
	public int getId_ordenCompraCliente() {
		return id_ordenCompraCliente;
	}
	public void setId_ordenCompraCliente(int id_ordenCompraCliente) {
		this.id_ordenCompraCliente = id_ordenCompraCliente;
	}
	public int getId_ordenCompraProveedor() {
		return id_ordenCompraProveedor;
	}
	public void setId_ordenCompraProveedor(int id_ordenCompraProveedor) {
		this.id_ordenCompraProveedor = id_ordenCompraProveedor;
	}
}
