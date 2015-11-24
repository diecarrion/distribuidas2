package dto;

import java.io.Serializable;
import java.util.Date;

public class RemitoClienteVO implements Serializable {
	private int id;
	private Date fecha;
	private ClienteVO cliente;
	
	public RemitoClienteVO() {

	}

	public RemitoClienteVO(int id, Date fecha, ClienteVO cliente){
		this.id = id;
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
	
	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
}
