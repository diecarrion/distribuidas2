package Controladores;

import java.rmi.RemoteException;

import dto.*;
import bean.*;

public class StockControlador {

	static StockControlador controlador;
	
	public static StockControlador getControlador() {
		if(controlador == null ){
			controlador=new StockControlador();
		}
		return controlador;
	}
}
