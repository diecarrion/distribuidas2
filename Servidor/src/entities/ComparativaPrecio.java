package entities;

import javax.persistence.*;

@Entity
@Table(name="ComparativaPrecios")
public class ComparativaPrecio {

	@EmbeddedId 
	private ComparativaPrecioId idComparativaPrecio;
	
	@ManyToOne
	@JoinColumn(name="id_rodamiento",referencedColumnName="codigoSKF", insertable=false, updatable=false)
	private Rodamiento rodamiento;
	@ManyToOne
	@JoinColumn(name="id_listaPrecio",referencedColumnName="id",insertable=false, updatable=false)
	private ListaPrecio listaPrecio;
	@ManyToOne
	@JoinColumn(name="id_proveedor",referencedColumnName="id",insertable=false, updatable=false)
	private Proveedor proveedor;
	
	private float precioCalculado;	
	private int stockDisp;
	

	public ComparativaPrecio()
	{}
	
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

	public float getPrecioCalculado() {
		return precioCalculado;
	}

	public void setPrecioCalculado(float precioCalculado) {
		this.precioCalculado = precioCalculado;
	}

	public int getStockDisp() {
		return stockDisp;
	}

	public void setStockDisp(int stockDisp) {
		this.stockDisp = stockDisp;
	}


	public ComparativaPrecioId getIdComparativaPrecio() {
		return idComparativaPrecio;
	}

	public void setIdComparativaPrecio(String codFab, String idRod, int idLista, int idproveedor) {
		
		this.idComparativaPrecio.setIdLista(idLista);
		this.idComparativaPrecio.setCodigoFabricante(codFab);
		this.idComparativaPrecio.setCodigoSFK(idRod);
		this.idComparativaPrecio.setIdProveedor(idproveedor);
	}



	
}
