package entities;
import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name="RemitoProveedores")
public class RemitoTransporte {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="id_Oficina", referencedColumnName="id")
	private OficinaVenta oficina;
	@OneToOne(mappedBy = "remito")
	private BultoCC bulto;
	
	public RemitoTransporte() {

	}

	public RemitoTransporte(int id, Date fecha, OficinaVenta oficina){
		this.id = id;
		this.fecha = fecha;
		this.oficina = oficina;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
}
