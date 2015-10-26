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
	
	public CotizacionVO generarCotizacion(int idCliente, List<RodamientoCotizadoVO> listaRodamientos, Date validez) throws RemoteException
	{
		List<RodamientoCotizadoVO> rodCotizados = new ArrayList<RodamientoCotizadoVO>();
		Cliente c = ClienteSRV.buscarCliente(idCliente);
		float total = 0;
		if(c!= null)
		{
			CotizacionVO cot = new CotizacionVO(validez, c.toVO().getOficinaVenta());
			for (RodamientoCotizadoVO p : listaRodamientos) {
				Rodamiento r =  new Rodamiento(p.getRodamiento().getCodigoSKF(), p.getRodamiento().getCaracteristicas(), p.getRodamiento().getMarca(), p.getRodamiento().getOrigen());
				ListaPrecioDetalle mejorLista = ComparativaPrecioSRV.mejorPrecio(r);
				if(mejorLista!=null)
				{
					RodamientoCotizadoVO rc = new RodamientoCotizadoVO(r.toVO(),mejorLista.getPrecio(),mejorLista.getListaPrecio().getProveedor().toVO(), p.getCantidad());
					total += mejorLista.getPrecio();
					rodCotizados.add(rc);
				}
			}
			
			float totalDescuento = ClienteSRV.aplicarDescuentoCliente(c, total);
			
			cot.setRodamientos(rodCotizados);
			cot.setPrecioTotal(totalDescuento);
			return cot;
		}
			
		return null;
	}
}
