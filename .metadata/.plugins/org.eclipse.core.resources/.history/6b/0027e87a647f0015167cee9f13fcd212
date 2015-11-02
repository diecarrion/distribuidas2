package hbt;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.*;

public class HibernateUtil {

	 private static final SessionFactory sessionFactory;
	    static
	    {
	        try
	        {
	        	 AnnotationConfiguration config = new AnnotationConfiguration();
	        	 config.addAnnotatedClass(BultoCC.class);
	        	 config.addAnnotatedClass(BultoOV.class);
	        	 config.addAnnotatedClass(Cliente.class);
	        	 config.addAnnotatedClass(Cotizacion.class);
	        	 config.addAnnotatedClass(DescuentoCantidad.class);
	        	 config.addAnnotatedClass(DescuentoCliente.class);
	        	 config.addAnnotatedClass(EstadoOrdenCompraCliente.class);
	        	 config.addAnnotatedClass(Factura.class);
	        	 config.addAnnotatedClass(ItemFactura.class);
	        	 config.addAnnotatedClass(ItemOrdenCompraOV.class);
	        	 config.addAnnotatedClass(ItemOrdenCompraProveedor.class);
	        	 config.addAnnotatedClass(ListaPrecio.class);
	        	 config.addAnnotatedClass(ListaPrecioDetalle.class);
	        	 config.addAnnotatedClass(OficinaVenta.class);
	        	 config.addAnnotatedClass(OrdenCompraCliente.class);
	        	 config.addAnnotatedClass(OrdenCompraProveedor.class);
	        	 config.addAnnotatedClass(Pedido.class);
	        	 config.addAnnotatedClass(Proveedor.class);
	        	 config.addAnnotatedClass(RemitoCliente.class);
	        	 config.addAnnotatedClass(RemitoProveedor.class);
	        	 config.addAnnotatedClass(RemitoTransporte.class);
	        	 config.addAnnotatedClass(Rodamiento.class);
	        	 config.addAnnotatedClass(RodamientoCotizado.class);
	        	 config.addAnnotatedClass(Stock.class);
	        	 config.addAnnotatedClass(ComparativaPrecio.class);
	             sessionFactory = config.buildSessionFactory();
	        }
	        catch (Throwable ex)
	        {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    
	    public static SessionFactory getSessionFactory()
	    {
	        return sessionFactory;
	    }
}
