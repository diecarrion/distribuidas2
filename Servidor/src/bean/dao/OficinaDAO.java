package bean.dao;

import hbt.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Cliente;
import entities.OficinaVenta;

public class OficinaDAO {
	private static OficinaDAO instancia = null;
	private static SessionFactory sf = null;

	public static OficinaDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new OficinaDAO();
		} 
		return instancia;
	}
	
	
	public OficinaVenta getOficina(int id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM OficinaVenta c WHERE c.id = :id");
		q.setParameter("id", id);
		OficinaVenta o = (OficinaVenta) q.uniqueResult();
		session.close();
		return o;
		
	}
}
