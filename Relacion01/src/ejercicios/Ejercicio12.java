package ejercicios;

import java.util.Scanner;



public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * DAdo un número de 5 cifras escribirlo en la forma, Ej: 12345
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número de 5 cifras");
		int num = teclado.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", num/10000, num/1000, num/100,
				num/10, num/1);
		
		

	}

}
