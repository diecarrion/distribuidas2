package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import dto.ListaPrecioVO;

@Entity
@Table(name="ListaPrecios")
public class ListaPrecio {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="id")
	private int idPrecio;

	@ManyToOne
	@JoinColumn(name="id_Proveedor", referencedColumnName="id")
	private Proveedor proveedor;
	private Date fechaVigenciaDesde;
	private Date fechaVigenciaHasta;
	private float descuentoLista;
	private boolean activa;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id_listaPrecio")
	private List<ListaPrecioDetalle> detalles =  new ArrayList<ListaPrecioDetalle>();
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<DescuentoCantidad> descuentosCantidad =  new ArrayList<DescuentoCantidad>();
	
	public ListaPrecio() {

	}

	public ListaPrecio(int id, Date fechaVigenciaDesde,Date fechaVigenciaHasta, float precio, Proveedor proveedor) {
		this.idPrecio = id;
		this.fechaVigenciaDesde = fechaVigenciaDesde;
		this.fechaVigenciaHasta = fechaVigenciaHasta;
		this.proveedor = proveedor;
		this.activa = true;
	}
	
	public int getId() {
		return idPrecio;
	}

	public void setId(int id) {
		this.idPrecio = id;
	}
	

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public ListaPrecioVO toVO(){
		return new ListaPrecioVO(this.getId(),this.getFechaVigenciaDesde(),this.getFechaVigenciaHasta(), this.getProveedor().getId());
	}


	public List<DescuentoCantidad> getDescuentosCantidad() {
		return descuentosCantidad;
	}

	public void setDescuentosCantidad(List<DescuentoCantidad> descuentosCantidad) {
		this.descuentosCantidad = descuentosCantidad;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public List<ListaPrecioDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<ListaPrecioDetalle> detalles) {
		this.detalles = detalles;
	}

	public int getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}

	public Date getFechaVigenciaDesde() {
		return fechaVigenciaDesde;
	}

	public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
		this.fechaVigenciaDesde = fechaVigenciaDesde;
	}

	public Date getFechaVigenciaHasta() {
		return fechaVigenciaHasta;
	}

	public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
		this.fechaVigenciaHasta = fechaVigenciaHasta;
	}

	public float getDescuentoLista() {
		return descuentoLista;
	}

	public void setDescuentoLista(float descuentoLista) {
		this.descuentoLista = descuentoLista;
	}

}
