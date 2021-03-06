package entities;
import javax.persistence.*;

import dto.*;

@Entity
@Table(name="ItemsOrdenCompraProveedor")
public class ItemOrdenCompraProveedor {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private int cantidad;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_Rodamiento", referencedColumnName="codigoSKF")
	private Rodamiento rodamiento;
	@ManyToOne
	@JoinColumn(name="id_ordenCompraProveedor", referencedColumnName="numero" ,insertable=false, updatable=false)
	private OrdenCompraProveedor ordenProveedor;
	
	public ItemOrdenCompraProveedor() {

	}

	public ItemOrdenCompraProveedor(int id, int cantidad, Rodamiento rodamiento, OrdenCompraProveedor ordenCompra){
		this.id = id;
		this.cantidad = cantidad;
		this.rodamiento = rodamiento;
		this.ordenProveedor = ordenCompra;
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
	
	public OrdenCompraProveedor getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedor ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}
	
	public ItemOrdenCompraProveedorVO toVO(){
		return new ItemOrdenCompraProveedorVO(this.getId(),this.getCantidad(),this.getRodamiento().toVO(), this.getOrdenProveedor().toVO());
	}
}
