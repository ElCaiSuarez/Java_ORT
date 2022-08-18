package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio17 {
	/*
	 * Realiz� un programa que permita ingresar una edad (entre 1 y 120 a�os) y un g�nero ( 'F'
	para mujeres, 'M' para hombres). En caso de haber ingresado valores err�neos (edad fuera
	de rango o g�nero inv�lido), informar tal situaci�n. Si los datos est�n bien ingresados el
	programa debe indicar, sabiendo que las mujeres se jubilan con 60 a�os o m�s y los hombres
	con 65 a�os o m�s, si la persona est� en edad de jubilarse.
	 */
	public static void main(String[] args) {
		final int EDAD_MINIMA = 1, EDAD_MAXIMA = 120, JUBILACION_F = 60, JUBILACION_M = 65;
		final char FEMENINO = 'F', MASCULINO = 'M';
		int edad;
		char genero;
		boolean edadValida, generoValido, puedeJubilarse;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese se edad: (entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + ") :");
		edad = input.nextInt();
		input.nextLine();
		
		System.out.println("Ingrese su genero: (" + FEMENINO + " o " + MASCULINO + ") :");
		genero = input.nextLine().toUpperCase().charAt(0);
		input.close();
		
		edadValida = edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA;
		generoValido = genero == FEMENINO || genero == MASCULINO;
		
		if (edadValida && generoValido) {
			puedeJubilarse = (genero == FEMENINO && edad >= JUBILACION_F) || (genero == MASCULINO && edad >= JUBILACION_M);
			System.out.println(puedeJubilarse ? "Puede jubilarse" : "No puede jubilarse");
		}else {
			System.out.println("edad fuera de rango o g�nero inv�lido");
		}
		

	}

}
