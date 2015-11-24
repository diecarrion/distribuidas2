package dto;

import java.io.Serializable;
import java.util.Date;

public class BultoOVVO implements Serializable{
	private int id;
	private Date fecha;
	private OficinaVentaVO oficina;
	private FacturaVO factura;
	private ClienteVO cliente;
	private RemitoClienteVO remito;
	
	public BultoOVVO() {

	}

	public BultoOVVO(int id, Date fecha, OficinaVentaVO oficina, ClienteVO cliente, RemitoClienteVO remito){
		this.id = id;
		this.fecha = fecha;
		this.oficina = oficina;
		this.cliente = cliente;
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
	
	public OficinaVentaVO getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
	
	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
	}
	
	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
	
	public RemitoClienteVO getRemitoCliente() {
		return remito;
	}

	public void setRemitoCliente(RemitoClienteVO remito) {
		this.remito = remito;
	}
}
