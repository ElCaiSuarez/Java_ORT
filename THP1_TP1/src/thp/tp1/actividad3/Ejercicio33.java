package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int FIN_CARGA = 0;
		int numeroIngresado, maximo, minimo;

		System.out.println("Ingrese un numero o cero (0) para terminar");
		numeroIngresado = Integer.parseInt(input.nextLine());
		maximo = numeroIngresado;
		minimo = numeroIngresado;
		while (numeroIngresado != FIN_CARGA) {
			if (numeroIngresado > maximo) {
				maximo = numeroIngresado;
			} else if (numeroIngresado < minimo) {
				minimo = numeroIngresado;
			}
			System.out.println("Ingrese un numero o cero (0) para terminar");
			numeroIngresado = Integer.parseInt(input.nextLine());
		}
		System.out.println("El numero maximo es: " + maximo + " el numero minimo es: " + minimo);
		input.close();
		System.out.println("FIN");
	}

}
