package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cálculo del área de un triángulo dado sus lados");
		
		double lado1, lado2, lado3;
		System.out.println("Lado 1:");
		lado1 = teclado.nextDouble();
		
		System.out.println("Lado 2:");
		lado2 = teclado.nextDouble();
		
		System.out.println("Lado 3:");
		lado3 = teclado.nextDouble();
		
		double s=(lado1+lado2+lado3)/2;
		
		double area = Math.sqrt( s* (s-lado1)*(s-lado2)* (s-lado3) );
		
		System.out.printf("El área del trinágulo de lados %.2f, %.2f y %.2f es %.2f",
				lado1, lado2,lado3, area);
		

	}
}
