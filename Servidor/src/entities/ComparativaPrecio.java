package entities;

import javax.persistence.*;

@Entity
@Table(name="ComparativaPrecios")
public class ComparativaPrecio {

	@EmbeddedId 
	private ComparativaPrecioId idComparativaPrecio;
	
	@ManyToOne
	@JoinColumn(name="id_rodamiento",referencedColumnName="id", insertable=false, updatable=false)
	private Rodamiento rodamiento;
	@ManyToOne
	@JoinColumn(name="id_listaPrecio",referencedColumnName="id",insertable=false, updatable=false)
	private ListaPrecio listaPrecio;
	
	public ComparativaPrecio()
	{}

	public ComparativaPrecioId getIdComparativaPrecio() {
		return idComparativaPrecio;
	}

	public void setIdComparativaPrecio(ComparativaPrecioId idComparativaPrecio) {
		this.idComparativaPrecio = idComparativaPrecio;
	}



	
}
