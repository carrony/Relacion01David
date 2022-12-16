package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("Cálculo de la hipotenusa de un triángulo rectángulo dado sus catetos");
		
		Scanner teclado = new Scanner(System.in);

		double cateto1, cateto2;
		System.out.println("Cateto 1: ");
		cateto1= teclado.nextDouble();
		System.out.println("Cateto 2: ");
		cateto2= teclado.nextDouble();
		
		double hipotenusa =Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
		System.out.println("La hipotenusa vale "+ hipotenusa);

	}

}
