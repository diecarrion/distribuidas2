package dto;

import java.util.Date;

public class OrdenCompraProveedorVO {
	private int numero;
	private Date fecha;
	private ProveedorVO proveedor;
	private BultoCCVO bulto;
	
	public OrdenCompraProveedorVO() {

	}

	public OrdenCompraProveedorVO(int num, Date fecha, ProveedorVO prov, BultoCCVO bulto){
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
	
	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}
	
	public BultoCCVO getBulto() {
		return bulto;
	}

	public void setBulto(BultoCCVO bulto) {
		this.bulto = bulto;
	}
}
