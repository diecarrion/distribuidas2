package entities;

import java.util.*;

import dto.BultoOVVO;
import dto.PedidoVO;

public class BultoOV {
	private int id;
	private Date fecha;
	private OficinaVenta oficina;
	private Factura factura;
	private Cliente cliente;
	private RemitoCliente remito;
	private List<OrdenCompraCliente> ordenes;
	
	public BultoOV() {

	}

	public BultoOV(Date fecha, OficinaVenta oficina, Cliente cliente, RemitoCliente remito){
		this.fecha = fecha;
		this.oficina = oficina;
		this.cliente = cliente;
		this.remito = remito;
		this.ordenes = new ArrayList<OrdenCompraCliente>();
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
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public RemitoCliente getRemitoCliente() {
		return remito;
	}

	public void setRemitoCliente(RemitoCliente remito) {
		this.remito = remito;
	}
	
	public List<OrdenCompraCliente> getOrdenes() {
		return ordenes;
	}

	public void addOrdenCompraCliente(OrdenCompraCliente oc) {
		this.ordenes.add(oc);
	}
	
	public BultoOVVO toVO(){
		return new BultoOVVO(this.getId(),this.getFecha(), this.getOficinaVenta().toVO(), this.getCliente().toVO(),this.getRemitoCliente().toVO());
	}
}
