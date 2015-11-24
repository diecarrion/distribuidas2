package bean.dao;

import hbt.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.*;

public class OrdenCompraClienteDAO {

	private static OrdenCompraClienteDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static OrdenCompraClienteDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new OrdenCompraClienteDAO();
		} 
		return instancia;
	}
	
	public OrdenCompraCliente getOrdenCompraCliente(int id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM OrdenCompraCliente oc WHERE oc.numero = :id");
		q.setParameter("id", id);
		OrdenCompraCliente oc = (OrdenCompraCliente) q.uniqueResult();
		session.close();
		return oc;
	}
	
	public void grabarOrdenCompraCliente(OrdenCompraCliente ordenCompra){
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(ordenCompra);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}
