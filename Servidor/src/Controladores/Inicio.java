package Controladores;


import java.rmi.RemoteException;

import dto.ClienteVO;
import dto.ProveedorVO;
import entities.*;

public class Inicio {
	public static void main(String[] arg){
		CasaCentralControlador sistema = new CasaCentralControlador();
		try {
			sistema.altaCliente("Diego Carrion", "34334352", "20-35375460-3", "Calle Falsa 123", "Mendoza", 1);
			sistema.modificarCliente(1, "Diego Sota", "34334352",  "Calle Chota 123");
			ClienteVO cliente = sistema.buscarCliente(1);
			sistema.bajaCliente(cliente.getId());
			sistema.altaProveedor("Martin Banfi", "34234234", "20-35360361-3", "Jordan 123", "Tierra del Fuego");
			sistema.modificarProveedor(1, "Pisculichi", "234324",  "Calle Chota 123","Cuba");
			ProveedorVO proveedor = sistema.buscarProveedor(1);
			sistema.bajaProveedor(proveedor.getId());
		
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
