package Controladores;

import java.rmi.RemoteException;

import businessDelegate.BusinessDelegate;
import dto.*;


public class Sistema {

   BusinessDelegate bd = null;
	
   public Sistema()
	{
		try 
		{
			bd = new BusinessDelegate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void AltaListaPrecio(ListaPrecioVO lp)
	{
		
		try {
			bd.alta_listaPrecio(lp);	
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
