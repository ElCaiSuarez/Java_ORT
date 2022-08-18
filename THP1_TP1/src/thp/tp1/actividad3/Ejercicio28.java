package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cantidad, valor, maximo = Integer.MAX_VALUE, posicion = 0;
		
		do {
			System.out.println("Ingrese la cantidad de numeros a procesar: ");
			cantidad = Integer.parseInt(input.nextLine());
		} while (cantidad < 1);
		for (int i = 1; i < cantidad; i++) {
			System.out.println("Ingrese un valor entero cualquiera: ");
			valor = Integer.parseInt(input.nextLine());
			if (valor > maximo) {
				maximo = valor;
				posicion = i;
			}
		}
		System.out.println("El mayor numero fue" + maximo + " y aparecio en la posicion " + posicion);
		input.close();
		System.out.println("FIN");
	}

}
