package xml_pruebas;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Xml_1 {

	
	public static void crear_xml(){
		
		try {
			
		DocumentBuilderFactory factoria=DocumentBuilderFactory.newInstance();
		DocumentBuilder doc = factoria.newDocumentBuilder();
		
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}
