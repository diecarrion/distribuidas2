package bean.dao;

import hbt.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.*;

public class RemitoProveedorDAO {
	
	private static RemitoProveedorDAO instancia = null;
	private static SessionFactory sf = null;

	public static RemitoProveedorDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new RemitoProveedorDAO();
		} 
		return instancia;
	}
	
	public void grabarRemitoProveedor(RemitoProveedor remito){
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(remito);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public RemitoProveedor getRemito(int id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM RemitoProveedor rm WHERE rm.id = :id");
		q.setParameter("id", id);
		RemitoProveedor rm = (RemitoProveedor) q.uniqueResult();
		session.close();
		return rm;
		
	}

}
