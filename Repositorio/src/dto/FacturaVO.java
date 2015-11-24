package dto;

import java.io.Serializable;
import java.util.*;

public class FacturaVO implements Serializable {

	private int id;
	private Date fecha;
	private float montoTotal;
	private OficinaVentaVO oficina;
	private ClienteVO cliente;
	private List<ItemFacturaVO> items;
	
	public FacturaVO()
	{
		
	}

	public FacturaVO(int id, Date fecha, float montoTotal, OficinaVentaVO oficina, ClienteVO cliente, List<ItemFacturaVO> items)
	{
		this.id = id;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
		this.oficina= oficina;
		this.cliente = cliente;
		this.items = items;
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
	
	public List<ItemFacturaVO> getItemsFactura() {
		return items;
	}

	public void setItemsFactura(List<ItemFacturaVO> items) {
		this.items = items;
	}
}
