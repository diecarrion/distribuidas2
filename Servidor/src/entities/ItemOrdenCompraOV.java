package entities;

import javax.persistence.*;

@Entity
@Table(name="ItemsOrdenCompraOV")
public class ItemOrdenCompraOV {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private int cantidad;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_Rodamiento", referencedColumnName="id")
	private Rodamiento rodamiento;
	@ManyToOne
	@JoinColumn(name="id_ordenCompraCliente", referencedColumnName="numero" ,insertable=false, updatable=false)
	private OrdenCompraCliente ordenCliente;
	
	public ItemOrdenCompraOV() {

	}

	public ItemOrdenCompraOV(int id, int cantidad, Rodamiento rodamiento, OrdenCompraCliente ordenCliente){
		this.id = id;
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.ordenCliente = ordenCliente;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Rodamiento getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public OrdenCompraCliente getOrdenCliente() {
		return ordenCliente;
	}

	public void setOrdenCliente(OrdenCompraCliente ordenCliente) {
		this.ordenCliente = ordenCliente;
	}

}
