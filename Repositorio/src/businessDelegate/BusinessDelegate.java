package businessDelegate;

import interfaz.ISistemaRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class BusinessDelegate {
	
private ISistemaRemote sistemaRemote;
	
    public BusinessDelegate() {
		super();
		getStub();
	}

	public boolean getStub() {
    	try {
    		
    		sistemaRemote = (ISistemaRemote)Naming.lookup ("//localhost/Sistema");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }

}
