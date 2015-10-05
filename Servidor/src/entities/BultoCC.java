package entities;

import java.util.*;

public class BultoCC {
	private int id;
	private Date fecha;
	private RemitoTransporte remito;
	private List<OrdenCompraProveedor> ordenes;
	
	public BultoCC() {

	}

	public BultoCC(int id, Date fecha, RemitoTransporte remito, List<OrdenCompraProveedor> ordenes){
		this.id = id;
		this.fecha = fecha;
		this.remito = remito;
		this.ordenes = ordenes;
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
	
	public RemitoTransporte getRemitoTransporte() {
		return remito;
	}

	public void setRemitoTransporte(RemitoTransporte remito) {
		this.remito = remito;
	}
	
	public List<OrdenCompraProveedor> getOrdenesCompra() {
		return ordenes;
	}

	public void setOrdenesCompra(List<OrdenCompraProveedor> ordenes) {
		this.ordenes = ordenes;
	}
	
}
