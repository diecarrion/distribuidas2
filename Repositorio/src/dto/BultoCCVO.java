package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class BultoCCVO implements Serializable {
	private int id;
	private Date fecha;
	private RemitoTransporteVO remito;
	private List<OrdenCompraProveedorVO> ordenes;
	
	public BultoCCVO() {

	}

	public BultoCCVO(int id, Date fecha, RemitoTransporteVO remito, List<OrdenCompraProveedorVO> ordenes){
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
	
	public RemitoTransporteVO getRemitoTransporte() {
		return remito;
	}

	public void setRemitoTransporte(RemitoTransporteVO remito) {
		this.remito = remito;
	}
	
	public List<OrdenCompraProveedorVO> getOrdenesCompra() {
		return ordenes;
	}

	public void setOrdenesCompra(List<OrdenCompraProveedorVO> ordenes) {
		this.ordenes = ordenes;
	}
	
}
