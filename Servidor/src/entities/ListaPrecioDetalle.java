package entities;

public class ListaPrecioDetalle {
	
	private Rodamiento rodamiento;
	private ListaPrecio listaPrecio;
	private float precio;
	
	public ListaPrecioDetalle()
	{
		
	}
	public ListaPrecioDetalle(Rodamiento rodamiento, ListaPrecio listaPrecio, float precio) {
		this.rodamiento = rodamiento;
		this.listaPrecio = listaPrecio;
		this.precio = precio;
	}
	public Rodamiento getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	public ListaPrecio getListaPrecio() {
		return listaPrecio;
	}
	public void setListaPrecio(ListaPrecio listaPrecio) {
		this.listaPrecio = listaPrecio;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	

}