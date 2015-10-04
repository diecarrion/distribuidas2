package Controladores;
import java.rmi.RemoteException;

import dto.*;
import bean.*;

public class EntregaControlador {
	static EntregaControlador controlador;
	
	public static EntregaControlador getControlador() {
		if(controlador == null ){
			controlador=new EntregaControlador();
		}
		return controlador;
	}

}
