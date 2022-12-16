package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número de 3 cifras");
		int num = teclado.nextInt();
		
		int cifra1, cifra2, cifra3;
		cifra1 = num / 100;
		cifra2 = num % 100 /10;
		cifra3 = num % 100 % 10;
		
		System.out.printf("cifra1: %d\n cifra2: %d\n cifra3: %d\n", cifra1, cifra2, cifra3);

	}

}
