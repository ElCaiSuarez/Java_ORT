package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		final double COMISION = 0.16, SUELDOFIJO = 44000;
		double importeACobrar, montoTotal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el monto total de ventas: ");
		montoTotal = teclado.nextDouble();
		
		importeACobrar = montoTotal * COMISION;
		importeACobrar = importeACobrar + SUELDOFIJO;
		System.out.println("El importe a cobra por el vendedor es: " + importeACobrar);
		
		teclado.close();
		System.out.println("FIN");
		

	}

}
