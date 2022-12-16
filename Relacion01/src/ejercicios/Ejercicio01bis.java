package ejercicios;

import java.util.Scanner;

public class Ejercicio01bis {

	public static void main(String[] args) {
		// Pedir por teclado los datos de una persona, el nombre, la edad 
		// y el peso en kg con decimales
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad;
		float peso;
		
		System.out.println("Introduce tus datos");
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Edad: ");
		edad = teclado.nextInt();
		System.out.println("Peso (en kg):");
		peso = teclado.nextFloat();
		
		System.out.printf("Te llamas %s tienes %d años y tu peso es de %.2f kg\n",
				nombre,edad,peso);
		System.out.println("te llamas "+nombre+ " tienes "+edad+ " años y tu peso es de "+
				           peso + " kg");
		teclado.close();
	}

}
