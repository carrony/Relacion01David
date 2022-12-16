package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa para pasar de grados centígrados a fahrenheit");
		System.out.println("Grados centígrados: ");
		double centigrados = teclado.nextDouble();
		
		double fahrenheit = 32 + (9*centigrados/5);
		System.out.printf("%.2f grados centigrados son %.2f grados fahrenheit", 
				centigrados, fahrenheit);
		teclado.close();
	}
}
