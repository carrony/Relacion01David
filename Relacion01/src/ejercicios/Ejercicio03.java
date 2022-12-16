package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		num = teclado.nextDouble();
		
		/*System.out.println("Tu número es "+ num+ " el doble es "+num*2
				+ " y el triple es "+num*3);*/
		
		System.out.printf("Tu número es %.2f, su doble es %.2f y su triple"
				 + " es %.2f", num, num*2, num*3);

	}

}
