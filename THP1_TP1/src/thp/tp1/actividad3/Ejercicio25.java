package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio25 {
final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int alto, ancho, i, j;
			
		do {
			System.out.println("Ingrese el alto: ");
			alto = Integer.parseInt(input.nextLine());	
		} while (alto <= 0);
		
		do {
			System.out.println("Ingrese el ancho: ");
			ancho = Integer.parseInt(input.nextLine());	
		} while (ancho <= 0);
		
		for (i = 1; i <= alto; i++){
			for (j = 1; j <= ancho; j++){
				System.out.print("X");
			}
			System.out.println();
			//System.out.print("\n");
		}
		input.close();
		System.out.println("FIN");
	}

}