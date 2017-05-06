package album;

public class ALBUM {

	private String titulo;
	private String autor;
	private String discografia;
	private int a�o;
	private char soporte;
	private int elementos;
	private double precio;
	private char genero;
	private boolean espa�ol;
	
	
	//CONTRUCTORES
	
	public ALBUM(String titulo, String autor, String discografia, int a�o, char soporte, double precio, char genero, boolean espa�ol){
		
		this.titulo=titulo;
		this.autor=autor;
		this.discografia=discografia;
		this.a�o=a�o;
		this.soporte=soporte;
		this.precio=precio;
		this.genero=genero;
		this.espa�ol=espa�ol;
		
		
	}

	
	public ALBUM (){
		
		this.titulo="";
		this.autor="";
		this.discografia="";
		this.a�o=0;
		this.soporte=' ';
		this.precio=0;
		this.genero=' ';
		this.espa�ol=false;
		
	}
	
	
	


	public String getTitulo() {
		return titulo;
	}



	public String getAutor() {
		return autor;
	}



	public String getDiscografia() {
		return discografia;
	}



	public int getA�o() {
		return a�o;
	}



	public char getSoporte() {
		return soporte;
	}



	public int getElementos() {
		return elementos;
	}



	public double getPrecio() {
		return precio;
	}



	public char getGenero() {
		return genero;
	}



	public boolean isEspa�ol() {
		return espa�ol;
	}

	


	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setDiscografia(String discografia) {
		this.discografia = discografia;
	}



	public void setA�o(int a�o) {
		this.a�o = a�o;
	}



	public void setSoporte(char soporte) {
		this.soporte = soporte;
	}



	public void setElementos(int elementos) {
		this.elementos = elementos;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public void setGenero(char genero) {
		this.genero = genero;
	}



	public void setEspa�ol(boolean espa�ol) {
		this.espa�ol = espa�ol;
	}



	public String Imprimir_Album() {
		return "Datos del album:"
				+ "\n"
				+ "ALBUM :\t" + titulo +
				"\n"+ 
				"AUTOR : \t" + autor +
				"\n"+
				"DISCOGRAFIA :\t" + discografia +
				"\n" +
				"A�O :\t" + a�o+
				"\n"+
				"SOPORTE :\t" + soporte +
				"\n"+
				"PRECIO : \t" + precio +
				"\n"+
				"GENERO : \t" + genero +
				"\n"+ 
				"ESPA�OL : \t" + espa�ol;
	}
	
	
	
	
	
	
	
	
	
	
	
}
