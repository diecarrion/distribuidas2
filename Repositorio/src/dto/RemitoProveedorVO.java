package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemitoProveedorVO {
	private int id;
	private Date fecha;
	private ProveedorVO proveedor;
	private OrdenCompraProveedorVO ordenProveedor;
	
	public RemitoProveedorVO() {

	}

	public RemitoProveedorVO(int id, Date fecha, ProveedorVO proveedor, OrdenCompraProveedorVO ordenProveedor){
		this.id = id;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.ordenProveedor = ordenProveedor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}
	
	public OrdenCompraProveedorVO getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedorVO ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}

}
