package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// 1. Programa Java que lea dos números enteros por teclado y los
		// muestre por pantalla.

		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		System.out.println("El primer número es "+ num1+
				           " y el segundo es "+num2);
		
		System.out.printf("El primer número es %d y el segundo es %d\n", 						   
				          num1,num2);	
		
		
	}

}
