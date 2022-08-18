package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int EDAD_MAYOR = 18, CANTIDAD_EDADES = 5;
		int edad, acumEdad = 0, imparesMayores = 0, i;
		double promedio;
		
		for (i = 1; i < CANTIDAD_EDADES; i++) {
			do {
				System.out.println("Ingrese la edad " + i + ": ");
				edad = Integer.parseInt(input.nextLine());
			} while (edad < 0);
			acumEdad += edad;
			if (edad > EDAD_MAYOR && edad % 2 != 0) {
				imparesMayores ++;
			}
		}
		promedio = acumEdad / CANTIDAD_EDADES;
		System.out.println("El promedio de edades es: " + promedio);
		System.out.println("La cantidad de edades impares mayores a 18 fueron: " + imparesMayores);
		input.close();
		System.out.println("FIN");
	}

}
