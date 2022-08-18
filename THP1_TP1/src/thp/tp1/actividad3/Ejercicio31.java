package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio31 {
/*
 * Realizá un programa que permita validar una opción ingresada. Se le preguntará al usuario si
desea continuar con alguna operación de la forma "¿Deseás continuar? [S/N]" . Se
espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas). La opción debe ser
ingresada tanto como sea necesario hasta que quede comprendida dentro de las
posibilidades esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo while y
con ciclo do - while .
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("WHILE ¿Desea continuar? [S/N]");
		char opcion = input.nextLine().charAt(0);
		while(opcion == 's'){
			System.out.println("WHILE ¿Desea continuar? [S/N]");
			opcion = input.nextLine().charAt(0);
			
		}
		input.close();
		System.out.println("FIN");
	}

}
