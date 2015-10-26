package entities;

import java.util.Date;
import java.util.List;

public class DescuentoCantidad {
	
	private int id;
	private int cantidad;
	private String condEsp;
	private float montoDescuento;
	private float porcentaje;
	private Date vigenteHasta;
	private List<ListaPrecio> listaPrecios;
	
	public DescuentoCantidad() {
	}

	public DescuentoCantidad(int id, int cantidad,  String condEsp, float montoDescuento, float porcentaje, Date vigenteHasta){
		this.id = id;
		this.condEsp = condEsp;
		this.cantidad = cantidad;
		this.montoDescuento = montoDescuento;
		this.porcentaje = porcentaje;
		this.vigenteHasta = vigenteHasta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public String getCondEsp() {
		return condEsp;
	}

	public void setCondEsp(String condEsp) {
		this.condEsp = condEsp;
	}
	
	public float getMontoDescuento(){
		return montoDescuento;
	}
	
	public void setMontoDescuento(float montoDescuento){
		this.montoDescuento = montoDescuento;
	}
	
	public float getPorcentaje(){
		return porcentaje;
	}
	
	public void setPorcentaje(float porcentaje){
		this.porcentaje = porcentaje;
	}
	
	public Date getVigenteHasta() {
		return vigenteHasta;
	}

	public void setVigenteHasta(Date vigenteHasta) {
		this.vigenteHasta = vigenteHasta;
	}
	
	public List<ListaPrecio> getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(List<ListaPrecio> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}

}
