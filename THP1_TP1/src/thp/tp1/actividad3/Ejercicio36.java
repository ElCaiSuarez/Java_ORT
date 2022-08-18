package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int VALOR_CORTE = 20;
		int valorIngresado, acumuladorValores = 0, cantidadValores = 0;
		double promedio;
		
		do {
			System.out.println("Ingrese un valor; ");
			valorIngresado = Integer.parseInt(input.nextLine());
			cantidadValores++;
			acumuladorValores+=valorIngresado;
			promedio=acumuladorValores/cantidadValores;
		} while (promedio < VALOR_CORTE);
		System.out.println("Se ingresaron " + cantidadValores + " y su promedio es de " + promedio );
		input.close();
		System.out.println("FIN");
	}

}
