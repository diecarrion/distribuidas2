package dto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CotizacionVO {
	
	private int id;
	private Date fecha;
	private float precioTotal;
	private OficinaVentaVO oficina;
	private List<RodamientoCotizadoVO> rodamientos;
	
	public CotizacionVO() {

	}

	public CotizacionVO(Date fecha, OficinaVentaVO oficina){
		this.fecha = fecha;
		this.oficina = oficina;
		this.rodamientos = new ArrayList<RodamientoCotizadoVO>();
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

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
	
	public void setRodamientos(List<RodamientoCotizadoVO> rodamientos) {
		this.rodamientos = rodamientos;
	}
	

}
