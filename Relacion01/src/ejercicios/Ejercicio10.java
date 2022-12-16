package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println("Máquina expendedora: ");
		Scanner teclado = new Scanner(System.in);
		
		double importe, precio, cambio;
		
		System.out.println("Importe introducido: ");
		importe = teclado.nextDouble();
		
		System.out.println("Precio del producto: ");
		precio = teclado.nextDouble();
		
		cambio = importe -precio;
		System.out.println("CAmbio a devolver: "+cambio);
		
		int euros, centimos, m2e,m1e, m50c, m20c,m10c,m5c,m2c,m1c;
		
		euros = (int) cambio;
		centimos = (int) ((cambio-euros)*100);
		
		m2e= euros/2;
		m1e=euros%2;
		
	//centimos
		m50c = centimos / 50;
		centimos = centimos %50;
		
		m20c = centimos /20;
		centimos = centimos %20;
		m10c = centimos /10;
		centimos = centimos %10;
		m5c = centimos /5;
		centimos = centimos %5;
		m2c = centimos /2;
		m1c = centimos %2;
		
		System.out.printf("Tu cambio es %d monedas de 2 €, %d monedas de 1 €,\n"
				+ "%d monedas de 50 c, %d monedas de 20 c, %d moedas de 10 c\n"
				+ "%d monedas de 5 c, %d monedas de 2 c y %d monedas de 1 c",
				m2e,m1e, m50c, m20c,m10c,m5c,m2c,m1c);
		

	}

}
