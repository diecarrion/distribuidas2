package entities;

import java.util.*;

import dto.ListaPrecioVO;

public class ListaPrecio {
	private int id;
	private Date fecha;
	private Proveedor proveedor;
	private boolean activa;
	private List<ListaPrecioDetalle> detalles;
	private List<DescuentoCantidad> descuentosCantidad;
	
	public ListaPrecio() {

	}

	public ListaPrecio(int id, Date fecha, float precio, Proveedor proveedor) {
		this.id = id;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.activa = true;
		this.detalles = new ArrayList<ListaPrecioDetalle>();
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
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public ListaPrecioVO toVO(){
		return new ListaPrecioVO(this.getId(),this.getFecha(), this.getProveedor().toVO());
	}


	public List<DescuentoCantidad> getDescuentosCantidad() {
		return descuentosCantidad;
	}

	public void setDescuentosCantidad(List<DescuentoCantidad> descuentosCantidad) {
		this.descuentosCantidad = descuentosCantidad;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public List<ListaPrecioDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<ListaPrecioDetalle> detalles) {
		this.detalles = detalles;
	}

}
