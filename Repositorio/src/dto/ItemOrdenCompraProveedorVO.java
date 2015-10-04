package dto;

public class ItemOrdenCompraProveedorVO {

	private int id;
	private int cantidad;
	private RodamientoVO rodamiento;
	private OrdenCompraProveedorVO ordenProveedor;
	
	public ItemOrdenCompraProveedorVO() {

	}

	public ItemOrdenCompraProveedorVO(int id, int cantidad, RodamientoVO rodamiento, OrdenCompraProveedorVO ordenCompra){
		this.id = id;
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.ordenProveedor = ordenCompra;
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
	
	public OrdenCompraProveedorVO getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedorVO ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}
}
