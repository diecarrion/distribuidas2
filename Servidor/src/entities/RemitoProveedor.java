package entities;

import java.util.*;

import javax.persistence.*;

import dto.ProveedorVO;
import dto.RemitoProveedorVO;

@Entity
@Table(name="RemitoProveedores")
public class RemitoProveedor {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="id_Proveedor",referencedColumnName="id")
	private Proveedor proveedor;
	@OneToOne
	@JoinColumn(name="numero_Orden",referencedColumnName="numero")
	private OrdenCompraProveedor ordenProveedor;
	
	public RemitoProveedor() {

	}

	public RemitoProveedor(int id, Date fecha, Proveedor proveedor, OrdenCompraProveedor ordenProveedor){
		this.id = id;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.ordenProveedor = ordenProveedor;
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
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public OrdenCompraProveedor getOrdenProveedor() {
		return ordenProveedor;
	}

	public void setOrdenProveedor(OrdenCompraProveedor ordenProveedor) {
		this.ordenProveedor = ordenProveedor;
	}
	
	public RemitoProveedorVO toVO(){
		return new RemitoProveedorVO(this.getId(),this.getFecha(),this.getProveedor().toVO(), this.getOrdenProveedor().toVO());
	}

}
