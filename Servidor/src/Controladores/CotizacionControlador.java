package Controladores;
import java.rmi.RemoteException;
import java.util.*;

import dto.*;
import entities.*;
import bean.srv.ClienteSRV;
import bean.srv.ComparativaPrecioSRV;

public class CotizacionControlador {

	static CotizacionControlador controlador;
	
	public static CotizacionControlador getControlador() {
		if(controlador == null ){
			controlador=new CotizacionControlador();
		}
		return controlador;
	}
	
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoVO> listaRodamientos, Date validez) throws RemoteException
	{
		List<RodamientoCotizadoVO> rodCotizados = new ArrayList<RodamientoCotizadoVO>();
		Cliente c = ClienteSRV.buscarCliente(idCliente);
		float total = 0;
		if(c!= null)
		{
			CotizacionVO cot = new CotizacionVO(validez, c.toVO().getOficinaVenta());
			for (RodamientoVO p : listaRodamientos) {
				Rodamiento r =  new Rodamiento(p.getId(), p.getCodigoSKF(), p.getCaracteristicas(), p.getMarca(), p.getOrigen());
				ListaPrecio mejorLista = ComparativaPrecioSRV.mejorPrecio(r);
				if(mejorLista!=null)
				{
					float precioDescuento = ClienteSRV.aplicarDescuentoCliente(c, mejorLista.getPrecio());
					total += precioDescuento;
					RodamientoCotizadoVO rc = new RodamientoCotizadoVO(p,total,mejorLista.getProveedor().toVO());
					rodCotizados.add(rc);
				}
			}
			
			cot.setRodamientos(rodCotizados);
			cot.setPrecioTotal(total);
			
			return cot;
		}
		
		return null;
	}
}
