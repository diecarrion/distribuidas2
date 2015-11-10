package entities;

import java.util.*;

import javax.persistence.*;

import dto.*;

@Entity
@Table(name="Rodamientos")
public class Rodamiento {
	@Id	
	@Column(name="id")
	private String codigoFabricante;
	private String codigoSKF;
	private String caracteristicas;
	private String marca;
	private String origen;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="id_rodamiento")
	private List<ListaPrecioDetalle> listaDetalle = new ArrayList<ListaPrecioDetalle>();
	
	public Rodamiento() {

	}
	
	public Rodamiento(String codigoSKF, String caracteristicas, String marca, String origen){
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
	
	public RodamientoVO toVO(){
		return new RodamientoVO(this.getCodigoSKF(),this.getCaracteristicas(), this.getMarca(), this.getOrigen());
	}

	public List<ListaPrecioDetalle> getListaPrecios() {
		return listaDetalle;
	}

	public void setListaPrecios(List<ListaPrecioDetalle> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
	
	
}
