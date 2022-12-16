package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String nombre;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Buenos días "+nombre);
		//System.out.printf("Buenos días %s\n",nombre);
	}

}
