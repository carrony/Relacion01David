package ejercicios;import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		System.out.println("Programa para "
				// Se utiliza \" para mostrar un comilla doble en el texto
				// a esto se le denomina secuencia de escape
				+ "pasar de \"Km/h\" a \"m/sg\"");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Km/h: ");
		int kmHora = teclado.nextInt();
		
		double mSg = kmHora*1000/3600.0;
		
		System.out.printf("%d km/h son %.2f m/sg", kmHora,mSg);

	}

}
