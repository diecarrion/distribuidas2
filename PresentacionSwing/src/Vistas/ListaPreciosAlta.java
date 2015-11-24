package Vistas;
import dto.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Controladores.*;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
@SuppressWarnings("serial")
public class ListaPreciosAlta extends javax.swing.JFrame {
	private JTextField jTextFieldDir;
	private JButton jButton;
	private JLabel jLabelMensaje;
	private JLabel jLabel1;
	private JButton jButtonSalir;
	private JButton jButtonAlta;
	private Document dom;

	
	
	public ListaPreciosAlta() {
		super();
		initGUI();
	}



	private void initGUI() {
		try {
			{
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				getContentPane().setLayout(null);
				this.setSize(468, 191);
				this.setTitle("Alta Lista de Precios");
				this.setVisible(true);
			}
			{
				jTextFieldDir = new JTextField();
				getContentPane().add(jTextFieldDir);
				jTextFieldDir.setBounds(12, 51, 356, 23);
			}
			{
				jButton = new JButton();
				getContentPane().add(jButton);
				jButton.setText("...");
				jButton.setBounds(388, 51, 41, 23);
				jButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						abrirBusqueda();
						}	
					} 
				);
				
			}
			{
				jLabelMensaje = new JLabel();
				getContentPane().add(jLabelMensaje);
				jLabelMensaje.setText("Ingrese Directorio y nombre de la Lista de Precios .XML");
				jLabelMensaje.setBounds(12, 18, 349, 16);
			}
			{
				jButtonAlta = new JButton();
				getContentPane().add(jButtonAlta);
				getContentPane().add(getJLabel1());
				jButtonAlta.setText("Alta Lista Precios");
				jButtonAlta.setBounds(239, 111, 103, 23);
				jButtonAlta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						altaListaPrecios();
						}	
					} 
				);
			}
			{
				jButtonSalir = new JButton();
				getContentPane().add(jButtonSalir);
				jButtonSalir.setText("Salir");
				jButtonSalir.setBounds(361, 111, 68, 23);
				jButtonSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						dispose();
						}	
					} 
				);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void abrirBusqueda(){
		jLabel1.setVisible(false);
		JFileChooser fileChooser = new JFileChooser();
		int seleccion = fileChooser.showOpenDialog(this);
		if (seleccion == JFileChooser.APPROVE_OPTION)
		{
		   File fichero = fileChooser.getSelectedFile();
		   String path = fichero.getPath();
		   jTextFieldDir.setText(path);
		}
	}
	
	public void altaListaPrecios() {

		
		//parse the xml file and get the dom object
		parseXmlFile(jTextFieldDir.getText());
	
		//get each employee element and create a Employee object
		ListaPrecioVO lp = parseDocument();
	
		//Iterate through the list and print the data
		altaListaP(lp);
	}
	
	public void parseXmlFile(String path){
	
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			dom = db.parse(path);
			
		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private ListaPrecioVO parseDocument(){
		List<ListaPrecioDetalleVO> itemslistaprecios = new ArrayList<ListaPrecioDetalleVO>();
		
		//obtengo el elemento raiz
		Element docEle = dom.getDocumentElement();
		
		//obtengo la cabecera de la Lista de Precios
		NodeList nl = docEle.getElementsByTagName("Cabecera");
		Element el = (Element)nl.item(0);
		
		//obtengo el objeto ListaPreciosView
		ListaPrecioVO lp = getListaPrecios(el);
		
		//obtengo los Items de la Lista de Precio
		NodeList nl1 = docEle.getElementsByTagName("Items");
		
		if(nl1 != null && nl1.getLength() > 0) {
			for(int i = 0 ; i < nl1.getLength();i++) {
				
				//obtengo el elemento empleado
				Element el1 = (Element)nl1.item(i);
				
				//obtengo el objeto empleado
				ListaPrecioDetalleVO ilp = getItemListaPrecios(el1);
				
				//add it to list
				itemslistaprecios.add(ilp);
			}
		}
		lp.setDetalles(itemslistaprecios);
		return lp;
	}

	private ListaPrecioVO getListaPrecios(Element cabecera) {
	
		int idProveedor = getIntValue(cabecera,"idProveedor");
		int idLista = getIntValue(cabecera,"idLista");
		String fechaVigenciaDesdeString = getTextValue(cabecera,"fechaVigenciaDesde");
		String fechaVigenciaHastaString = getTextValue(cabecera,"fechaVigenciaHasta");
		float descuentoLista = getFloatValue(cabecera,"descuentoLista");
		
		//Crea la Lista de PreciosView a partir de los atributos.
		ListaPrecioVO lp = new ListaPrecioVO();
		//Date stuff
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
		try
		{
	        java.util.Date parsed1 = format1.parse(fechaVigenciaDesdeString);
	        java.util.Date parsed2 = format1.parse(fechaVigenciaHastaString);
	    	@SuppressWarnings("static-access")
			java.sql.Date fechaVigenciaDesde = new java.sql.Date(parsed1.getTime());
			@SuppressWarnings("static-access")
			java.sql.Date fechaVigenciaHasta = new java.sql.Date(parsed2.getTime());
			lp.setFechaVigenciaDesde(fechaVigenciaDesde);
			lp.setFechaVigenciaHasta(fechaVigenciaHasta);
			
		}catch(Exception e)
		{
			
		}

		lp.setProveedorId(idProveedor);
		lp.setId(idLista);

		lp.setDescuentoLista(descuentoLista);
	
		return lp;
	}

	private ListaPrecioDetalleVO getItemListaPrecios(Element itemlp) {
		
		// TODO Auto-generated method stub
		int stockDisp = getIntValue(itemlp,"stockDisp");
		float precioUnit = getFloatValue(itemlp,"precioUnit");
		float porcentajeDesc = getFloatValue(itemlp,"porcentajeDesc");
		String codigoSFK = getTextValue(itemlp,"codigoSFK");
		String codigoFabricante = getTextValue(itemlp,"codigoFabricante");
		String paisOrigen = getTextValue(itemlp,"paisOrigen");
		String marca = getTextValue(itemlp,"marca");
		String caracteristica = getTextValue(itemlp,"caracteristica");
	
		//Crea un Item de la Lista de PreciosView a partir de los atributos.
		ListaPrecioDetalleVO ilp = new ListaPrecioDetalleVO();
		RodamientoVO r = new RodamientoVO();
		
		ilp.setPorcDescuento(porcentajeDesc);
		ilp.setPrecioUnit(precioUnit);
		ilp.setStockDisp(stockDisp);
		
		r.setCodigoSKF(codigoSFK);
		r.setCodigoFabricante(codigoFabricante);
		r.setCaracteristicas(caracteristica);
		r.setMarca(marca);
		r.setOrigen(paisOrigen);
		
		ilp.setRodamiento(r);
		
		return ilp;
		
	}
		
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}
		return textVal;
	}

	private int getIntValue(Element ele, String tagName) {
		//in production application you would catch the exception
		//System.out.println(getTextValue(ele, tagName));
		return Integer.parseInt(getTextValue(ele,tagName));
	}
	
	private float getFloatValue(Element ele, String tagName) {
		//in production application you would catch the exception
		//System.out.println(getTextValue(ele, tagName));
		return Float.parseFloat(getTextValue(ele,tagName));
	}
	
	private void altaListaP(ListaPrecioVO lp){
		Sistema s  =  new Sistema();
		s.AltaListaPrecio(lp);
		jLabel1.setVisible(true);
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("LA LISTA DE PRECIOS FUE DADA DE ALTA");
			jLabel1.setVisible(false);
			jLabel1.setBounds(12, 86, 356, 16);
		}
		return jLabel1;
	}
	/**
	* This method should return an instance of this class which does 
	* NOT initialize it's GUI elements. This method is ONLY required by
	* Jigloo if the superclass of this class is abstract or non-public. It 
	* is not needed in any other situation.
	 */
	public static Object getGUIBuilderInstance() {
		return new ListaPreciosAlta(Boolean.FALSE);
	}
	
	/**
	 * This constructor is used by the getGUIBuilderInstance method to
	 * provide an instance of this class which has not had it's GUI elements
	 * initialized (ie, initGUI is not called in this constructor).
	 */
	public ListaPreciosAlta(Boolean initGUI) {
		super();
	}
}
