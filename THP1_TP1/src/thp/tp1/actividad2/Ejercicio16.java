package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inscriptos, asientosDisponibles;
		
		System.out.println("Cantidad de Inscriptos?: ");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Cantidad de asientos disponibles?: ");
		asientosDisponibles = Integer.parseInt(input.nextLine());
		if (asientosDisponibles >= inscriptos) {
			System.out.println("Los asientos alcanzan");
			
			
		}else {
			System.out.println("Los asientos no alcanzan");
			System.out.println("(faltan " + (inscriptos-asientosDisponibles) + " asientos)");
			
		}
		input.close();
		System.out.println("FIN");
	}

}
