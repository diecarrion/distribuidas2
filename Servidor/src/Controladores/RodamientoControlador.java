package Controladores;
import java.rmi.RemoteException;

import dto.*;
import bean.*;

public class RodamientoControlador {
	
	static RodamientoControlador controlador;
	
	public static RodamientoControlador getControlador() {
		if(controlador == null ){
			controlador=new RodamientoControlador();
		}
		return controlador;
	}

}
