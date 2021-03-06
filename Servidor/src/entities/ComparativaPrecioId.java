package entities;
import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ComparativaPrecioId implements Serializable {

	private int idProveedor;
	private int idLista;
	private String codigoSFK;
	private String codigoFabricante;
	
	public ComparativaPrecioId(int idProveedor, int idLista, String codigoSFK, String codigoFabricante) {
		super();
		this.idProveedor = idProveedor;
		this.idLista = idLista;
		this.codigoSFK = codigoSFK;
		this.codigoFabricante = codigoFabricante;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public String getCodigoSFK() {
		return codigoSFK;
	}

	public void setCodigoSFK(String codigoSFK) {
		this.codigoSFK = codigoSFK;
	}

	public String getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	


}
