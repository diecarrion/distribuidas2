package dto;

import java.io.Serializable;

public class ComparativaDetalleVO implements Serializable {
	

	private int IdListaPrecio;
	private int IdRodamiento;
	private float precio;
	
	
	public ComparativaDetalleVO(int idListaPrecio, int idRodamiento,
			float precio) {
		IdListaPrecio = idListaPrecio;
		IdRodamiento = idRodamiento;
		this.precio = precio;
	}
	
	
	public int getIdListaPrecio() {
		return IdListaPrecio;
	}
	public void setIdListaPrecio(int idListaPrecio) {
		IdListaPrecio = idListaPrecio;
	}
	public int getIdRodamiento() {
		return IdRodamiento;
	}
	public void setIdRodamiento(int idRodamiento) {
		IdRodamiento = idRodamiento;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	

}
