package dom;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ejercicio531b {
	static Scanner teclado = new Scanner(System.in);
	private static Document doc;


	static int menu() {
		int opcion = 0;
		do {

			System.out.println("1. Insertar nuevo Contacto");
			System.out.println("2. Mostrar lista completa");
			System.out.println("3. Borrar un Contacto por su Indice");
			System.out.println("4. Borrar un Contacto por su nombre");
			System.out.println("5. Borrar todos los contactos");
			System.out.println("6. Exportar XML");
			System.out.println("7. Exportar HTML");
			System.out.println("8. Salir del programa");
			System.out.println("Elija la operación que desee");
			try {
				opcion = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Opcion incorrecta");
			} finally {
				teclado.nextLine();
			}
		} while (opcion < 1 || opcion > 8);

		return opcion;
	}// fin menu()

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		
		

		int opcion = 0;
		String nombre, telefono;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				// Insertar contacto
				System.out.println("Contacto: ");
				nombre = teclado.nextLine();
				System.out.println("Telefono: ");
				telefono = teclado.nextLine();
				addxml(nombre, telefono);
				break;
			case 2:
				// Mostrar todos
				mostrarXML();
				break;
			case 3:
				// Borrar por Indice
				try {
					System.out.println("Indica índice del Contacto a borrar: ");
					int indice = teclado.nextInt();
					// Eliminar elemento del documento XML
					remove(indice - 1);
				} catch (InputMismatchException e) {
					System.out.println("Se ha producido un error al borrar ");
					teclado.nextLine();
				}
				break;
			case 4:
				// Borrar por nombre
				System.out.println("Nombre del Contacto a borrar: ");
				String nomBorrar = teclado.nextLine();
				removeByName(nomBorrar);
				break;
			case 5:
				// Borrar todos
				clear();
				System.out.println("Se han borrado todos los contactos");
				break;
			case 6:
				// Exportar XML
				toXML();
				System.out.println("Se han exportado los contactos al archivo 'contactos.xml'");
				break;
			case 7:
				// Exportar HTML
				toHTML();
				System.out.println("Se han exportado los contactos al archivo 'contactos.html'");
				break;
			case 8:
				System.out.println("FIN DEL PROGRAMA...");
				break;
			}
		} while (opcion != 8);

	}

	private static void toHTML() throws TransformerException {

	}

	private static void toXML() throws TransformerException {

		File AgendaXML = new File("agenda.xml");
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();

		DOMSource origen = new DOMSource(doc);
		StreamResult destino = new StreamResult(AgendaXML);
		transformer.transform(origen, destino);
	}

	private static void clear() {

	}

	private static void removeByName(String nomBorrar) {

	}

	private static void remove(int indice) {

	}

	private static void mostrarXML() {
		
		
		
		
		

	}

	private static void addxml(String nombre, String telefono) {
	
		try {
			
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance(); // creamos la factoria
			DocumentBuilder builder = factoria.newDocumentBuilder();  // creamos el builder
			doc = builder.newDocument(); //creamos el documento vacio en memoria
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		}
		
		Element agenda=doc.createElement("agenda");  // creamos el elemneto raiz agenda
		
		Element contacto=doc.createElement("contacto"); // creamos el elemnto contacto con la etiqueta " contacto"
		agenda.appendChild(contacto);  // decimos que contacto es hijo de agenda
		
		Element name = doc.createElement("nombre");
		name.appendChild(doc.createTextNode(nombre));
		contacto.appendChild(name);
		
		
		Element num =doc.createElement("telefono");
		num.appendChild(doc.createTextNode(telefono));
		contacto.appendChild(num);
		
		
		
		
	}
}
