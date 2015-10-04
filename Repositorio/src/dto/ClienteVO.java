package dto;
public class ClienteVO {

	private int id;
	private String identificacion;
	private String telefono;
	private String cuit;
	private String direccion;
	private String provincia;
	private OficinaVentaVO oficina;
	
	public ClienteVO() {

	}

	public ClienteVO(int id, String identificacion, String cuit, String telefono,
			String direccion, String provincia, OficinaVentaVO oficina) {
		this.id = id;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.cuit = cuit;
		this.provincia = provincia;
		this.direccion = direccion;
		this.oficina = oficina;
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
	
	public OficinaVentaVO getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVentaVO oficina) {
		this.oficina = oficina;
	}
	
}
