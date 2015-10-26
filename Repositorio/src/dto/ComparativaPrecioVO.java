package dto;

public class ComparativaPrecioVO {
	private ListaPrecioVO listaPrecioVO;
	private RodamientoVO rodamiento;
	
	public ComparativaPrecioVO()
	{}

	public ComparativaPrecioVO(ListaPrecioVO lista, RodamientoVO rodamiento)
	{
		this.listaPrecioVO = lista;
		this.rodamiento = rodamiento;
	}

	public ListaPrecioVO getListaPrecioVO() {
		return listaPrecioVO;
	}

	public void setListaPrecioVO(ListaPrecioVO listaPrecioVO) {
		this.listaPrecioVO = listaPrecioVO;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}
}
	