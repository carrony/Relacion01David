package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/* DAdo un número de 5 cifras escribirlo en la forma, Ej: 12345
		 * 5
		 * 45
		 * 345
		 * 2345
		 * 12345
		 * */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un número de 5 cfras");
		int num = teclado.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", num%10, num%100, num%1000,
				num%10000, num);

	}

}
