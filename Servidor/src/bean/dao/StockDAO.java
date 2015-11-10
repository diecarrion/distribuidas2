package bean.dao;

import java.util.*;
import java.io.Serializable;

import org.hibernate.FetchMode;
import org.hibernate.Query;

import hbt.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.*;

public class StockDAO {

	private static StockDAO instancia = null;
	private static SessionFactory sf = null;

	public static StockDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new StockDAO();
		} 
		return instancia;
	}
	
	public void altaStock(Stock stock) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(stock);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	public void actualizarStock(Stock stock) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		session.beginTransaction();
		session.merge(stock);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	public Stock buscarStock(String codigoFabricante) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		Stock stock = (Stock) session.createQuery(
				"from Stock st join Rodamiento rod" + 
				"where rod.codigoFabricante = ?")
				.setString(0,codigoFabricante)
				.list();
	
		session.close();
		return stock;	
	}
	
}
