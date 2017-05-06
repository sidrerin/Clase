package fecha;

public class Fecha {

	
	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha (){
		
		this.dia=0;
		this.mes=0;
		this.a�o=0;
	}
	
	
	public Fecha (int dia, int mes, int a�o){
		
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
		
	}
	
	
	public String mes_literal(){
		
		String MesLiteral="";
		
		switch (this.mes){
		
		case 1: MesLiteral="Enero";
				break;
				
		case 2: MesLiteral="Febrero";
		break;
		
		
		case 3: MesLiteral="Marzo";
		break;
		
				
		case 4: MesLiteral="Abril";
		break;
		
		
		case 5: MesLiteral="Mayo";
		break;
		
		
		case 6: MesLiteral="Junio";
		break;
		
		
		case 7: MesLiteral="Julio";
		break;
		
		
		case 8: MesLiteral="Agosto";
		break;
		
		
		case 9: MesLiteral="Septiembre";
		break;
		
		
		case 10: MesLiteral="Octubre";
		break;
		
		
		case 11: MesLiteral="Noviembre";
		break;
		
		
		case 12: MesLiteral="Diciembre";
		break;
		
		
				
		}
		return MesLiteral;
		
	}
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	public String toString() {
		return "Fecha: " + dia + " / " + mes + " / " + a�o;
		
	}
	
	
	public void imprimirfecha(){
		
		System.out.println("Fecha: "+dia+" de "+getMes()+" del a�o " + a�o);
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	

