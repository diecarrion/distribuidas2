package dto;
import java.sql.Date;


public class ComparativaPrecioVO {
	private int idProveedor;
	private int idLista;
	private String codigoSFK;
	private String codigoFabricante;
	private String paisOrigen;
	private String marca;
	private String caracteristicas;
	private float precioCalculado;	
	private int stockDisp;
	private Date FechaVigenciaDesde;
	private Date FechaVigenciaHasta;
	
	public ComparativaPrecioVO(int idProveedor, int idLista, String codigoSFK,
			String codigoFabricante, String paisOrigen, String marca,
			String caracteristicas, float precioCalculado, int stockDisp,
			Date fechaVigenciaDesde, Date fechaVigenciaHasta) {
		super();
		this.idProveedor = idProveedor;
		this.idLista = idLista;
		this.codigoSFK = codigoSFK;
		this.codigoFabricante = codigoFabricante;
		this.paisOrigen = paisOrigen;
		this.marca = marca;
		this.caracteristicas = caracteristicas;
		this.precioCalculado = precioCalculado;
		this.stockDisp = stockDisp;
		FechaVigenciaDesde = fechaVigenciaDesde;
		FechaVigenciaHasta = fechaVigenciaHasta;
	}


	public ComparativaPrecioVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}


	public int getIdLista() {
		return idLista;
	}


	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}


	public String getCodigoSFK() {
		return codigoSFK;
	}


	public void setCodigoSFK(String codigoSFK) {
		this.codigoSFK = codigoSFK;
	}


	public String getCodigoFabricante() {
		return codigoFabricante;
	}


	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCaracteristicas() {
		return caracteristicas;
	}


	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
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


	public Date getFechaVigenciaDesde() {
		return FechaVigenciaDesde;
	}


	public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
		FechaVigenciaDesde = fechaVigenciaDesde;
	}


	public Date getFechaVigenciaHasta() {
		return FechaVigenciaHasta;
	}


	public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
		FechaVigenciaHasta = fechaVigenciaHasta;
	}

}
	