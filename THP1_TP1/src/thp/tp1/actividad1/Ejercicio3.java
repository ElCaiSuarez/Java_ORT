package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		double a, b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		numero = teclado.nextInt();
		
		a = numero * 5;
		System.out.println("El resultado de A es: " + a);
		b = numero / 2;
		System.out.println("El resultado de B es: " + b);
		
		teclado.close();
		System.out.println("FIN");
		

	}

}
