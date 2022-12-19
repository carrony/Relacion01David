package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.
			El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
			Por ejemplo:
			Si la fecha de nacimiento es 12/07/1980
			Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
			Número de la suerte: 28
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de tu número de la suerte");
		System.out.println("Introduce el dia de nacimiento:");
		int dia = teclado.nextInt();
		System.out.println("Introduce el mes de nacimiento:");
		int mes = teclado.nextInt();
		System.out.println("Introduce el año de nacimiento:");
		int anio = teclado.nextInt();
		
		int suma = dia+mes+anio;
		int numSuerte = suma /1000;
		int resto = suma % 1000;
		numSuerte = numSuerte + resto /100;
		resto = resto % 100;
		numSuerte = numSuerte + resto /10;
		numSuerte = numSuerte + resto%10;
		
		System.out.printf("Tu número de la suerte es %d ", numSuerte);
		
		

	}

}
