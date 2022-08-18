package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		final int SUMAANGULOS = 180;
		int angulo1, angulo2, angulo3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la medida del 1er angulo:");
		angulo1 = teclado.nextInt();
		System.out.println("Ingrese la medida del 2do angulo:");
		angulo2 = teclado.nextInt();
		
		angulo3 = SUMAANGULOS - (angulo1 + angulo2);
		System.out.println("El valor del angulo restante es: " + angulo3);
		
		teclado.close();
		System.out.println("FIN");

	}

}
