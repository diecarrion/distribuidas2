package dto;

public class RodamientoVO {

	private String codigoFabricante;
	private String codigoSKF;
	private String caracteristicas;
	private String marca;
	private String origen;
	
	public RodamientoVO() {

	}
	
	public RodamientoVO(String codigoSKF, String caracteristicas, String marca, String origen){
		this.codigoSKF = codigoSKF;
		this.caracteristicas = caracteristicas;
		this.marca = marca;
		this.origen = origen;
	}
	
	public String getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(String codigo) {
		this.codigoFabricante = codigo;
	}
	
	public String getCodigoSKF() {
		return codigoSKF;
	}

	public void setCodigoSKF(String codigoSKF) {
		this.codigoSKF = codigoSKF;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
