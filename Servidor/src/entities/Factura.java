package entities;

import java.util.*;

import javax.persistence.*;

import dto.*;

@Entity
@Table(name="Facturas")
public class Factura {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	private float montoTotal;
	@ManyToOne
	@JoinColumn(name="id_Oficina", referencedColumnName="id")
	private OficinaVenta oficina;
	@ManyToOne
	@JoinColumn(name="id_Cliente", referencedColumnName="id")
	private Cliente cliente;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<ItemFactura> items = new ArrayList<ItemFactura>();
	
	public Factura()
	{
		
	}

	public Factura(Date fecha, float montoTotal, OficinaVenta oficina, Cliente cliente, List<ItemFactura> items)
	{
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
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}
	
	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	
	public List<ItemFactura> getItemsFactura() {
		return items;
	}

	public void setItemsFactura(List<ItemFactura> items) {
		this.items = items;
	}
	

	public List<ItemFacturaVO> getItemsFacturaVO() {
		List<ItemFacturaVO> itemsVO = new ArrayList<ItemFacturaVO>();
		for(ItemFactura item : items)
		{
			itemsVO.add(item.toVO());
		}
		return itemsVO;
	}
	
	public FacturaVO toVO(){
		return new FacturaVO(this.getId(),this.getFecha(),this.getMontoTotal(), this.getOficinaVenta().toVO(), this.getCliente().toVO(), this.getItemsFacturaVO());
	}
}
