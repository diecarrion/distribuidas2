package dto;

import java.io.Serializable;
import java.util.*;

public class OrdenCompraProveedorVO implements Serializable {
	private int numero;
	private Date fecha;
	private ProveedorVO proveedor;
	private BultoCCVO bulto;
	private List<ItemOrdenCompraProveedorVO> items; 
	
	public OrdenCompraProveedorVO() {

	}

	public OrdenCompraProveedorVO(int num, Date fecha, ProveedorVO prov, List<ItemOrdenCompraProveedorVO> items ){
		this.numero = num;
		this.fecha = fecha;
		this.proveedor = prov;
		this.items = items;
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
	
	public List<ItemOrdenCompraProveedorVO> getItems() {
		return items;
	}

	public void setItems(List<ItemOrdenCompraProveedorVO> items) {
		this.items = items;
	}
}
