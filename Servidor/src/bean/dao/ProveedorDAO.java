package bean.dao;

import java.util.List;

import hbt.HibernateUtil;
import entities.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Cliente;

public class ProveedorDAO {
	
	private static ProveedorDAO instancia = null;
	private static SessionFactory sf = null;

	public static ProveedorDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ProveedorDAO();
		} 
		return instancia;
	}
	
	public void grabarProveedor(Proveedor proveedor){
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(proveedor);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public Proveedor getProveedor(int id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM Proveedor p WHERE p.id = :id");
		q.setParameter("id", id);
		Proveedor p = (Proveedor) q.uniqueResult();
		session.close();
		return p;
		
	}

	public List<Proveedor> getProveedores() {
		Session session = sf.openSession();
		List<Proveedor> proveedores = session.createQuery("FROM Proveedor").list();
		session.close();
		return proveedores;
	}
	
	public void modificarProveedor(Proveedor prov){
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(prov);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public int eliminarProveedor(int proveedorId) { 
		Session session = sf.openSession();
		int result = session.createQuery("DELETE Proveedor WHERE id = :proveedorId")
				.setParameter("proveedorId", proveedorId)
				.executeUpdate();
		return result;
	}

}
