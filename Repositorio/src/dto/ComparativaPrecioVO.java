package dto;

public class ComparativaPrecioVO {
	private int id;
	private float mejorPrecio;
	
	public ComparativaPrecioVO()
	{}

	public ComparativaPrecioVO(int id, float mejorPrecio)
	{
		this.id = id;
		this.mejorPrecio = mejorPrecio;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
	public float getMejorPrecio(){
		return mejorPrecio;
	}
	
	public void setMejorPrecio(float mejorPrecio){
		this.mejorPrecio = mejorPrecio;
	}

}
