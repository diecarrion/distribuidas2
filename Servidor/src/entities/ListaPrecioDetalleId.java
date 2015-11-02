package entities;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ListaPrecioDetalleId implements Serializable {

	private int id_rodamiento;
	private int id_listaPrecio;
	
	public ListaPrecioDetalleId()
	{
		
	}
	
	public int getId_rodamiento() {
		return id_rodamiento;
	}
	public void setId_rodamiento(int id_rodamiento) {
		this.id_rodamiento = id_rodamiento;
	}
	public int getId_listaPrecio() {
		return id_listaPrecio;
	}
	public void setId_listaPrecio(int id_listaPrecio) {
		this.id_listaPrecio = id_listaPrecio;
	}

}
