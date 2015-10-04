package entities;

import java.util.Date;

public class OrdenCompraProveedor {
	private int numero;
	private Date fecha;
	private Proveedor proveedor;
	private BultoCC bulto;
	
	public OrdenCompraProveedor() {

	}

	public OrdenCompraProveedor(int num, Date fecha, Proveedor prov, BultoCC bulto){
		this.numero = num;
		this.fecha = fecha;
		this.proveedor = prov;
		this.bulto = bulto;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public BultoCC getBulto() {
		return bulto;
	}

	public void setBulto(BultoCC bulto) {
		this.bulto = bulto;
	}
}
