package thp.tp1.actividad1;

/*
 * Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
 */

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombre;
		
		System.out.println("Ingresa tu nombre: ");

		Scanner input = new Scanner(System.in);
		nombre = input.nextLine();
		input.close();

		System.out.println("Bienvenido " + nombre);
	}

}
