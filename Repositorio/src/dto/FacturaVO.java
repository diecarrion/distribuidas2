package dto;

import java.util.Date;

public class FacturaVO {

	private int id;
	private Date fecha;
	private float montoTotal;
	private OficinaVentaVO oficina;
	private ClienteVO cliente;
	
	public FacturaVO()
	{
		
	}

	public FacturaVO(int id, Date fecha, float montoTotal, OficinaVentaVO oficina, ClienteVO cliente)
	{
		this.id = id;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
		this.oficina= oficina;
		this.cliente = cliente;
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
	
	public float getMontoTotal(){
		return montoTotal;
	}
	
	public void setMontoTotal(float montoTotal){
		this.montoTotal = montoTotal;
	}
	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
	
	public OficinaVentaVO getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
}
