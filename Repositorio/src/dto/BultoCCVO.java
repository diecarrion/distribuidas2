package dto;

import java.util.Date;

public class BultoCCVO {
	private int id;
	private Date fecha;
	private RemitoTransporteVO remito;
	
	public BultoCCVO() {

	}

	public BultoCCVO(int id, Date fecha, RemitoTransporteVO remito){
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
	
	public RemitoTransporteVO getRemitoTransporte() {
		return remito;
	}

	public void setRemitoTransporte(RemitoTransporteVO remito) {
		this.remito = remito;
	}
	
}
