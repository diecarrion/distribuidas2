package server;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfaz.ISistemaRemote;
import rmi.*;

public class Server {

	 ISistemaRemote objetoRemoto;

	public static void main(String[] args)
	{
		new Server();
		
		// Carga de datos para pruebas
	
	}

	public Server() {
		iniciar();
	}
	
	public void iniciar() {
		try {
			
			LocateRegistry.createRegistry(1099);	
			objetoRemoto = new SistemaRemote();
	        Naming.rebind("//localhost/Sistema", objetoRemoto);
	        System.out.println("Fijado en //localhost/Sistema");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}