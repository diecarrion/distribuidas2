package entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="OrdenCompraProveedores")
public class OrdenCompraProveedor {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int numero;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="id_Proveedor", referencedColumnName="id")
	private Proveedor proveedor;
	@ManyToOne
	@JoinColumn(name="id_Bulto", referencedColumnName="id")
	private BultoCC bulto;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<ItemOrdenCompraProveedor> itemsOrdenCompraProveedor = new ArrayList<ItemOrdenCompraProveedor>();
	
	public OrdenCompraProveedor() {

	}

	public OrdenCompraProveedor(int num, Date fecha, Proveedor prov, BultoCC bulto){
		this.numero = num;
		this.fecha = fecha;
		this.proveedor = prov;
		this.bulto = bulto;
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
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public BultoCC getBulto() {
		return bulto;
	}

	public void setBulto(BultoCC bulto) {
		this.bulto = bulto;
	}

	public List<ItemOrdenCompraProveedor> getItemsOrdenCompraProveedor() {
		return itemsOrdenCompraProveedor;
	}

	public void setItemsOrdenCompraProveedor(
			List<ItemOrdenCompraProveedor> itemsOrdenCompraProveedor) {
		this.itemsOrdenCompraProveedor = itemsOrdenCompraProveedor;
	}
	
}
