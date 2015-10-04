package dto;

import java.util.Date;

public class ListaPrecioVO {
	private int id;
	private Date fecha;
	private float precio;
	private ProveedorVO proveedor;
	
	public ListaPrecioVO() {

	}

	public ListaPrecioVO(int id, Date fecha, float precio, ProveedorVO proveedor) {
		this.id = id;
		this.fecha = fecha;
		this.precio = precio;
		this.proveedor = proveedor;
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
	
	public float getPrecio(){
		return precio;
	}
	
	public void setPrecio(float precio){
		this.precio = precio;
	}
	
	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

}
