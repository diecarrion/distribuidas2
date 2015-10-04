package dto;

public class EstadoOrdenCompraClienteVO {
	private String estado;
	private OrdenCompraClienteVO ordenCliente;
	private OrdenCompraProveedorVO ordenProveedor;
	
	public EstadoOrdenCompraClienteVO()
	{
	}
	
	public EstadoOrdenCompraClienteVO(String estado, OrdenCompraClienteVO ordenCliente, OrdenCompraProveedorVO ordenProveedor)
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
	
	public OrdenCompraClienteVO getOrdenCliente() {
		return ordenCliente;
	}

	public void setOrdenCliente(OrdenCompraClienteVO ordenCliente) {
		this.ordenCliente = ordenCliente;
	}

	public OrdenCompraProveedorVO getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedorVO ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}

}
