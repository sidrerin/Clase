package ejercicios_bucles;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que le pide al usuario la nota de un alumno (un
		 * n�mero real). El programa escribir� �Suspenso� si la nota est� entre
		 * 0 y 5; �Suficiente� si la nota est� entre 5 y 6; �Bien� si la nota
		 * est� entre 6 y 7; �Notable� si la nota est� entre 7 y 9 y
		 * �Sobresaliente� si est� entre 9 y 10. Si la nota no es v�lida, el
		 * programa nos vuelve a pedir un valor hasta que introduzcamos una
		 * correcta.
		 */

		double nota;
		System.out.println("Introduce tu nota");
		Scanner teclado = new Scanner(System.in);
		nota = teclado.nextDouble();

		if (nota < 5) {

			System.out.println("Su nota es de Suspenso");

		}

		else if (nota == 5 || nota<=6) {

			System.out.println("Su nota es de Suficiente");
		}

		else if (nota == 6 || nota <= 7) {

			System.out.println("Su nota es de Bien");
		}

		else if (nota == 7 || nota <= 8) {

			System.out.println("Su nota es de Notable");

		}

		else if (nota == 9 || nota <= 10) {

			System.out.println("Su nota es de Sobresaliente");

		}

	}
}
