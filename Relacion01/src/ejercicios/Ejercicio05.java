package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	//final double PI = 3.14159;
	
	public static void main(String[] args) {
		System.out.println("Programa para calcular la longitud y el área de un círculo dado su radio");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Radio del círculo: ");
		double radio = teclado.nextDouble();
		
		double longitud, area;
		longitud = 2 * Math.PI * radio;
		//area = Math.PI * radio * radio;
		area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El valor de la longitud es "+longitud+ " y el área es "+area);
		System.out.printf("EL valor de la longitud es %.2f y el del área es %.2f", longitud,area);
		
	}

}
