package dto;

import java.io.Serializable;
import java.util.Date;

public class OrdenCompraClienteVO implements Serializable{
	private int numero;
	private Date fecha;
	private OficinaVentaVO oficina;
	private ClienteVO cliente;
	private RemitoClienteVO remito;
	private PedidoVO pedido;
	
	public OrdenCompraClienteVO() {

	}

	public OrdenCompraClienteVO(int num, Date fecha, OficinaVentaVO oficina, ClienteVO cliente, RemitoClienteVO remito, PedidoVO pedido){
		this.numero = num;
		this.fecha = fecha;
		this.oficina = oficina;
		this.cliente = cliente;
		this.remito = remito;
		this.pedido = pedido;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	
	public OficinaVentaVO getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
	
	public PedidoVO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoVO pedido) {
		this.pedido = pedido;
	}

}
