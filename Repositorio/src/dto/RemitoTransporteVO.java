package dto;

import java.io.Serializable;
import java.util.Date;

public class RemitoTransporteVO implements Serializable {
	private int id;
	private Date fecha;
	private OficinaVentaVO oficina;
	
	public RemitoTransporteVO() {

	}

	public RemitoTransporteVO(int id, Date fecha, OficinaVentaVO oficina){
		this.id = id;
		this.fecha = fecha;
		this.oficina = oficina;
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
	
	public OficinaVentaVO getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
}
