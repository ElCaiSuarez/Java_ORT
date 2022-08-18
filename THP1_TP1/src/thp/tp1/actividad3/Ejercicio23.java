package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int CANTIDAD_MULTIPLOS = 10;
		int n, i;
		System.out.println("Ingrese un numero entero: ");
		n = Integer.parseInt(input.nextLine());
		System.out.println("Primeros " + CANTIDAD_MULTIPLOS+ " multiplos de " + n);
		for (i = 1; i < (CANTIDAD_MULTIPLOS + 1); i++) {
			System.out.println(n*i);
		}
		input.close();
		System.out.println("FIN");
		
	}

}
