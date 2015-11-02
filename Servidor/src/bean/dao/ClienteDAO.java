package bean.dao;

import java.util.*;
import java.io.Serializable;

import org.hibernate.FetchMode;
import org.hibernate.Query;

import hbt.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.*;

public class ClienteDAO {

	private static ClienteDAO instancia = null;
	private static SessionFactory sf = null;

	public static ClienteDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ClienteDAO();
		} 
		return instancia;
	}
	
	public void grabarCliente(Cliente cliente){
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(cliente);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public Cliente getCliente(int id) {
		Session session = sf.openSession();
		Query q = session.createQuery("FROM Cliente c WHERE c.id = :id");
		q.setParameter("id", id);
		Cliente c = (Cliente) q.uniqueResult();
		session.close();
		return c;
		
	}

	public List<Cliente> getClientes() {
		Session session = sf.openSession();
		List<Cliente> clientes = session.createQuery("FROM Cliente").list();
		session.close();
		return clientes;
	}
	
	public void modificarCliente(Cliente cliente){
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(cliente);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public int eliminarCliente(int clienteId) { 
		Session session = sf.openSession();
		int result = session.createQuery("DELETE Cliente WHERE id = :clienteId")
				.setParameter("clienteId", clienteId)
				.executeUpdate();
		return result;
	}
}
