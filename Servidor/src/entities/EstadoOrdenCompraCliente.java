package entities;

public class EstadoOrdenCompraCliente {
	private String estado;
	private OrdenCompraCliente ordenCliente;
	private OrdenCompraProveedor ordenProveedor;
	
	public EstadoOrdenCompraCliente()
	{
	}
	
	public EstadoOrdenCompraCliente(String estado, OrdenCompraCliente ordenCliente, OrdenCompraProveedor ordenProveedor)
	{
		this.estado = estado;
		this.ordenCliente = ordenCliente;
		this.ordenProveedor = ordenProveedor;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
