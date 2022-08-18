package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num1, num2, temporal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el 1er valor:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el 2do valor:");
		num2 = teclado.nextInt();
		temporal = num1;
		num1 = num2;
		num2 = temporal;
		System.out.println("El 1er valor ahora es: " + num1);
		System.out.println("El 2do valor ahora es: " + num2);
		
		teclado.close();
		System.out.println("FIN");
			
				

	}

}
