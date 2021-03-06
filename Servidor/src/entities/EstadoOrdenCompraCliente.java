package entities;

import javax.persistence.*;

@Entity
@Table(name="EstadoOrdenCompraCliente")
public class EstadoOrdenCompraCliente {
	
	@EmbeddedId 
	private EstadoOrdenCompraClienteId idEstadoOrdenCompra;
	
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_ordenCompraCliente",referencedColumnName="numero", insertable=false, updatable=false)
	private OrdenCompraCliente ordenCliente;
	@ManyToOne
	@JoinColumn(name="id_ordenCompraProveedor",referencedColumnName="numero",insertable=false, updatable=false)
	private OrdenCompraProveedor ordenProveedor;
	
	public EstadoOrdenCompraCliente()
	{
	}
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	public EstadoOrdenCompraClienteId getIdEstadoOrdenCompra() {
		return idEstadoOrdenCompra;
	}


	public void setIdEstadoOrdenCompra(
			EstadoOrdenCompraClienteId idEstadoOrdenCompra) {
		this.idEstadoOrdenCompra = idEstadoOrdenCompra;
	}


	public OrdenCompraCliente getOrdenCliente() {
		return ordenCliente;
	}


	public void setOrdenCliente(OrdenCompraCliente ordenCliente) {
		this.ordenCliente = ordenCliente;
	}


	public OrdenCompraProveedor getOrdenProveedor() {
		return ordenProveedor;
	}


	public void setOrdenProveedor(OrdenCompraProveedor ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}

}
