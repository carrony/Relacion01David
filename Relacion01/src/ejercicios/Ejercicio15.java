package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Programa para pasar de grados centígrados a grados Kelvin.
		 */
		System.out.println("Programa para pasar a grados Kelvin");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce los grados centigrados");
		int centigrados = teclado.nextInt();
		double kelvin = centigrados + 273.15;
		
		System.out.printf("%d grados centogrados son %.2f grados kelvin", 
				centigrados,kelvin);
	}

}
