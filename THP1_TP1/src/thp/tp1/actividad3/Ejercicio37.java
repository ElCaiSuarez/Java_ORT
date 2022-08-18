package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int mes = 1;
		double sueldo, acumulador = 0;
		System.out.println("Ingrese el suelodo del mes" + mes);
		sueldo = input.nextDouble();
		while (sueldo > 0 && mes < 12) {
			acumulador+=sueldo;
			mes++;
			System.out.println("Ingrese el suelodo del mes" + mes);
			sueldo = input.nextDouble();
			
		}
		System.out.println("El monto percibido por el empleado hasta el momento es $" + acumulador);
		input.close();
		System.out.println("FIN");
	}

}
