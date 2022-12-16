package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		System.out.println("Cálculo del volumen de una esfera dado su radio");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("RAdio: ");
		double radio = teclado.nextDouble();
		
		double volumen = 4.0/3.0*Math.PI*Math.pow(radio, 3);
		
		System.out.printf("El volumen de una esfera de radio %.2f m es %.2f metros cúbicos", radio, volumen);


	}

}
