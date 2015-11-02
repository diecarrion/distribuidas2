package entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="BultosCC")
public class BultoCC {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	@OneToOne
	@JoinColumn(name="id_Remito", referencedColumnName ="id")
	private RemitoTransporte remito;
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="numero")
	private List<OrdenCompraProveedor> ordenes = new ArrayList<OrdenCompraProveedor>();
	
	public BultoCC() {

	}

	public BultoCC(int id, Date fecha, RemitoTransporte remito){
		this.id = id;
		this.fecha = fecha;
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
	
	public RemitoTransporte getRemitoTransporte() {
		return remito;
	}

	public void setRemitoTransporte(RemitoTransporte remito) {
		this.remito = remito;
	}
	
	public List<OrdenCompraProveedor> getOrdenesCompra() {
		return ordenes;
	}

	public void setOrdenesCompra(List<OrdenCompraProveedor> ordenes) {
		this.ordenes = ordenes;
	}
	
}
