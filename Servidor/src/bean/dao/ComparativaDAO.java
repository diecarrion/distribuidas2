package bean.dao;
import dto.*;
import java.util.*;
import java.io.Serializable;

import org.hibernate.FetchMode;
import org.hibernate.Query;

import hbt.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.*;

public class ComparativaDAO {

	private static ComparativaDAO instancia = null;
	private static SessionFactory sf = null;

	public static ComparativaDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ComparativaDAO();
		} 
		return instancia;
	}
	
	public void grabarComparativa(ComparativaPrecio comp){
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(comp);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public List<ComparativaPrecioVO> consCompPaisOrigen(String paisOrigen) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.origen = ?")
				.setString(0,paisOrigen)
				.list();
	
		session.close();
		return comparativa;	
	}

	public List<ComparativaPrecioVO> consCompMarca(String marca) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.marca = ?")
				.setString(0,marca)
				.list();
	
		session.close();
		return comparativa;
	}

	public List<ComparativaPrecioVO> consCompCodigoSFKyPaisOrigen(
			String codigoSFK, String paisOrigen) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.codigoSFK = ? and r.origen = ?")
				.setString(0,codigoSFK)
				.setString(1, paisOrigen)
				.list();
	
		session.close();
		return comparativa;

	}

	public List<ComparativaPrecioVO> consCompCodigoSFKyMarca(String codigoSFK,
			String marca) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.codigoSFK = ? and r.marca = ?")
				.setString(0,codigoSFK)
				.setString(1, marca)
				.list();
	
		session.close();
		return comparativa;

	}

	public List<ComparativaPrecioVO> consCompCodigoSFK(String codigoSFK) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.codigoSFK = ?")
				.setString(0,codigoSFK)
				.list();
	
		session.close();
		return comparativa;
	}

	public List<ComparativaPrecioVO> consCompCodigoFabricanteyMarca(
			String codigoFabricante, String marca) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.codigoFabricante = ? and r.marca = ?")
				.setString(0,codigoFabricante)
				.setString(1, marca)
				.list();
	
		session.close();
		return comparativa;

	}

	public List<ComparativaPrecioVO> consCompCodigoFabricante(
			String codigoFabricante) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where r.codigoFabricante = ?")
				.setString(0,codigoFabricante)
				.list();
	
		session.close();
		return comparativa;
	}

	public List<ComparativaPrecioVO> consCompCodigoFabricanteyPaisOrigen(
			String codigoFabricante, String paisOrigen) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		List<ComparativaPrecioVO> comparativa = session.createQuery(
				"from ComparativaPrecio comp join comp.rodamiento r where  r.codigoFabricante = ? and r.origen = ?")
				.setString(0,codigoFabricante)
				.setString(1, paisOrigen)
				.list();
	
		session.close();
		return comparativa;
	}
}
