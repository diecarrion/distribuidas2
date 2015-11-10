package entities;

import java.util.*;

import javax.persistence.*;

import dto.*;

@Entity
@Table(name="Proveedores")
public class Proveedor {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String identificacion;
	private String telefono;
	private String cuit;
	private String direccion;
	private String provincia;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List <ListaPrecio> listaPrecios = new ArrayList<ListaPrecio>();
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="numero")
	private List <OrdenCompraProveedor> ordenes = new ArrayList<OrdenCompraProveedor>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private List<RemitoProveedor> remitos;
	


	public Proveedor() {

	}

	public Proveedor(String identificacion, String cuit, String telefono,
			String direccion, String provincia) {
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.cuit = cuit;
		this.provincia = provincia;
		this.direccion = direccion;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public List<ListaPrecio> getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(List<ListaPrecio> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}
	
	public void agregarListaPrecio(ListaPrecio lp)
	{
		this.listaPrecios.add(lp);
	}

	public List<OrdenCompraProveedor> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<OrdenCompraProveedor> ordenes) {
		this.ordenes = ordenes;
	}

	public List<RemitoProveedor> getRemitos() {
		return remitos;
	}

	public void setRemitos(List<RemitoProveedor> remitos) {
		this.remitos = remitos;
	}

	public void agregarRemito(RemitoProveedor rem) {
		remitos.add(rem);	
	}
	
	public List<OrdenCompraProveedorVO> getOrdenesCompraVO() {
		List<OrdenCompraProveedorVO> itemsVO = new ArrayList<OrdenCompraProveedorVO>();
		for(OrdenCompraProveedor item : ordenes)
		{
			itemsVO.add(item.toVO());
		}
		return itemsVO;
	}
	
	public List<RemitoProveedorVO> getRemitosProveedorVO() {
		List<RemitoProveedorVO> itemsVO = new ArrayList<RemitoProveedorVO>();
		for(RemitoProveedor item : remitos)
		{
			itemsVO.add(item.toVO());
		}
		return itemsVO;
	}
	
	public ProveedorVO toVO(){
		return new ProveedorVO(this.getId(), this.getIdentificacion(),this.getCuit(),this.getTelefono(), this.getDireccion(), this.getProvincia(),this.getOrdenesCompraVO(), this.getRemitosProveedorVO());
	}
	
}
