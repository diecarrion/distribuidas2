package dto;

import java.util.List;

public class ProveedorVO {
	private int id;
	private String identificacion;
	private String telefono;
	private String cuit;
	private String direccion;
	private String provincia;
	private List<OrdenCompraProveedorVO> ordenes;
	private List<RemitoProveedorVO> remitos;
	
	public ProveedorVO() {

	}

	public ProveedorVO(int id, String identificacion, String cuit, String telefono,
			String direccion, String provincia, List<OrdenCompraProveedorVO> ordenes, List<RemitoProveedorVO> remitos ) {
		this.id = id;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.cuit = cuit;
		this.provincia = provincia;
		this.direccion = direccion;
		this.ordenes = ordenes;
		this.remitos = remitos;
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

	public List<OrdenCompraProveedorVO> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<OrdenCompraProveedorVO> ordenes) {
		this.ordenes = ordenes;
	}

	public List<RemitoProveedorVO> getRemitos() {
		return remitos;
	}

	public void setRemitos(List<RemitoProveedorVO> remitos) {
		this.remitos = remitos;
	}
}
