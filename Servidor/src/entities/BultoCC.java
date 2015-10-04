package entities;

import java.util.Date;

public class BultoCC {
	private int id;
	private Date fecha;
	private RemitoTransporte remito;
	
	public BultoCC() {

	}

	public BultoCC(int id, Date fecha, RemitoTransporte remito){
		this.id = id;
		this.fecha = fecha;
		this.remito = remito;
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
	
}
