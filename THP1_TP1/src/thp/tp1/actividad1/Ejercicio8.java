package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num1, num2, suma, resta, producto;
		double division;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el 1er numero natural:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el 2do numero natural:");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		division = num1 / num2;
		System.out.println("Resultado suma: " + suma + " Resultado resta: " + resta + " Resultado producto: " + producto + " Resultado division: " + division);
		
		teclado.close();
		System.out.println("FIN");

	}

}
