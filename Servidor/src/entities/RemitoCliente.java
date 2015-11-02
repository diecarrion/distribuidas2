package entities;

import java.util.*;

import javax.persistence.*;

import dto.*;

@Entity
@Table(name="RemitoClientes")
public class RemitoCliente {
	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="id_Cliente", referencedColumnName="id")
	private Cliente cliente;
	
	public RemitoCliente() {

	}

	public RemitoCliente(Date fecha, Cliente cliente){
			this.fecha = fecha;
		this.cliente = cliente;
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
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public RemitoClienteVO toVO(){
		return new RemitoClienteVO(this.getId(),this.getFecha(),this.getCliente().toVO());
	}
}
