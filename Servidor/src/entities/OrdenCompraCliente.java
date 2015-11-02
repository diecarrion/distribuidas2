package entities;

import java.util.*;

import javax.persistence.*;

import dto.*;


@Entity
@Table(name="OrdenCompraClientes")
public class OrdenCompraCliente {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int numero;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="id_Oficina", referencedColumnName="id")
	private OficinaVenta oficina;
	@ManyToOne
	@JoinColumn(name="id_Cliente", referencedColumnName="id")
	private Cliente cliente;
	@OneToOne
	@JoinColumn(name="id_Remito", referencedColumnName ="id")
	private RemitoCliente remito;
	@OneToOne
	@JoinColumn(name="id_Pedido", referencedColumnName ="id")
	private Pedido pedido;
	
	
	public OrdenCompraCliente() {

	}

	public OrdenCompraCliente(Date fecha, OficinaVenta oficina, Cliente cliente, RemitoCliente remito, Pedido pedido){
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
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public OrdenCompraClienteVO toVO(){
		return new OrdenCompraClienteVO(this.getNumero(),this.getFecha(),this.getOficinaVenta().toVO(),this.getCliente().toVO(), this.getRemitoCliente().toVO(), this.getPedido().toVO());
}

	public OficinaVenta getOficina() {
		return oficina;
	}

	public void setOficina(OficinaVenta oficina) {
		this.oficina = oficina;
	}

	public RemitoCliente getRemito() {
		return remito;
	}

	public void setRemito(RemitoCliente remito) {
		this.remito = remito;
	}


}
