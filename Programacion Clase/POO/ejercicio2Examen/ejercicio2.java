package ejercicio2Examen;

import java.util.Scanner;

public class ejercicio2 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] vector = new String [3];
		
		String contraPuesta;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige cual va a ser tu contrase�a");
		contraPuesta=teclado.nextLine();
		
		
		
		String contrase�a;
		System.out.println("Por favor inserta tu contrase�a");
		contrase�a=teclado.nextLine();
		
		
		int contador=0;
		//String correcto ="si";
		boolean correcto=true;
		
		while(contador<2){
			
			
		
		if (contraPuesta.equalsIgnoreCase(contrase�a)){
			
			System.out.println("CONTRASE�A CORRECTA");
			break;
		
		}
			
		
		if (!(contraPuesta.equalsIgnoreCase(contrase�a))){
			
			System.out.println("Contrae�a incorrecta intentelo de nuevo");
			correcto=false;
			contrase�a=teclado.nextLine();
			vector[contador]=contrase�a;
			contador++;
		}
			
			
		
		
		}
		
		
		if (correcto=true)
			System.out.println("Ha llegado al numero maximo de intentos, gracias");
			
		
		
		
	}

	
	
	
	
}
