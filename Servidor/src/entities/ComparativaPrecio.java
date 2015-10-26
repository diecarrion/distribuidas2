package entities;

public class ComparativaPrecio {
	private Rodamiento rodamiento;
	private ListaPrecio listaPrecio;
	
	public ComparativaPrecio()
	{}

	public ComparativaPrecio(Rodamiento rodamiento, ListaPrecio listaPrecio)
	{
		this.rodamiento = rodamiento;
		this.listaPrecio = listaPrecio;
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
	
}
