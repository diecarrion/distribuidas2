package dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaPrecioVO {
	private int id;
	private Date fechaVigenciaDesde;
	private Date fechaVigenciaHasta;
	private float descuentoLista;
	private boolean activa;
	private ProveedorVO proveedor;
	private List<ListaPrecioDetalleVO> detalles;
	
	public ListaPrecioVO() {

	}

	public ListaPrecioVO(int id, Date fechaVigenciaDesde, Date fechaVigenciaHasta, ProveedorVO proveedor) {
		this.id = id;
		this.fechaVigenciaDesde = fechaVigenciaDesde;
		this.fechaVigenciaHasta = fechaVigenciaHasta;
		this.activa = true;
		this.proveedor = proveedor;
	}
	
	public List<ListaPrecioDetalleVO> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<ListaPrecioDetalleVO> detalles) {
		this.detalles = detalles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public Date getFechaVigenciaDesde() {
		return fechaVigenciaDesde;
	}

	public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
		this.fechaVigenciaDesde = fechaVigenciaDesde;
	}

	public Date getFechaVigenciaHasta() {
		return fechaVigenciaHasta;
	}

	public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
		this.fechaVigenciaHasta = fechaVigenciaHasta;
	}

	public float getDescuentoLista() {
		return descuentoLista;
	}

	public void setDescuentoLista(float descuentoLista) {
		this.descuentoLista = descuentoLista;
	}

}
