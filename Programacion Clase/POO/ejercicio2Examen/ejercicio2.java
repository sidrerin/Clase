package ejercicio2Examen;

import java.util.Scanner;

public class ejercicio2 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] vector = new String [3];
		
		String contraPuesta;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige cual va a ser tu contraseņa");
		contraPuesta=teclado.nextLine();
		
		
		
		String contraseņa;
		System.out.println("Por favor inserta tu contraseņa");
		contraseņa=teclado.nextLine();
		
		
		int contador=0;
		//String correcto ="si";
		boolean correcto=true;
		
		while(contador<2){
			
			
		
		if (contraPuesta.equalsIgnoreCase(contraseņa)){
			
			System.out.println("CONTRASEŅA CORRECTA");
			break;
		
		}
			
		
		if (!(contraPuesta.equalsIgnoreCase(contraseņa))){
			
			System.out.println("Contraeņa incorrecta intentelo de nuevo");
			correcto=false;
			contraseņa=teclado.nextLine();
			vector[contador]=contraseņa;
			contador++;
		}
			
			
		
		
		}
		
		
		if (correcto=true)
			System.out.println("Ha llegado al numero maximo de intentos, gracias");
			
		
		
		
	}

	
	
	
	
}
