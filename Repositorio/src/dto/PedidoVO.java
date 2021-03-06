package dto;

import java.io.Serializable;
import java.util.Date;

public class PedidoVO implements Serializable {
	
	private int id;
	private Date fecha;
	private OficinaVentaVO oficina;
	private ClienteVO cliente;
	private CotizacionVO cotizacion;
	
	public PedidoVO() {

	}
	
	public PedidoVO(int id, Date fecha, OficinaVentaVO oficina, ClienteVO cliente, CotizacionVO cotizacion){
		this.id = id;
		this.fecha = fecha;
		this.oficina = oficina;
		this.cliente = cliente;
		this.cotizacion = cotizacion;
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
	
	
	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
	
	public CotizacionVO getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(CotizacionVO cotizacion) {
		this.cotizacion = cotizacion;
	}	
}
