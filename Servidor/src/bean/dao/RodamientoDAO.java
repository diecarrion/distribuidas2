package bean.dao;

import hbt.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.*;

public class RodamientoDAO {
	private static RodamientoDAO instancia = null;
	private static SessionFactory sf = null;

	public static RodamientoDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new RodamientoDAO();
		} 
		return instancia;
	}
	
	public Rodamiento getRodamiento(String id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM Rodamiento r WHERE c.id = :id");
		q.setParameter("id", id);
		Rodamiento r = (Rodamiento) q.uniqueResult();
		session.close();
		return r;
		
	}

}
