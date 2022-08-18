package estructurada;

import java.util.Scanner;

public class Practica_Parcial_Peaje_FinCiclo_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int HORA_MIN = 0, HORA_MAX = 23, HORA_PICO_MIN = 9, HORA_PICO_MAX = 18;
		final char TIPO_MOTO = 'M', TIPO_AUTO = 'A', TIPO_CAMIONETA = 'C';
		final String FIN_DATOS = "FIN";
		final double PRECIO_MOTO = 50, PRECIO_AUTO = 100, PRECIO_CAMIONETA = 150, AUMENTO_HORA_PICO = 1.5;
		Scanner input = new Scanner(System.in);
		String patente;
		int hora, contadorAutos = 0, contadorTotal = 0;
		char tipoVehiculo;
		double precio, porcentajeAutos, acumRecaudado = 0;
		boolean finDeDatos, patenteVacia, tipoValido, horaValida, esHoraPico;

		// Lectura adelantada de Fin de ciclo y validacion de empty
		do {
			System.out.println("Ingresa la patente del vehiculo. ([FIN] para finalizar la carga)");
			patente = input.nextLine();
			patenteVacia = patente.isEmpty();
			if (patenteVacia)
				System.out.println("Error!!! escriba una patente");
		} while (patenteVacia);
		finDeDatos = !patente.equalsIgnoreCase(FIN_DATOS);
		// Ciclo fin de datos
		while (finDeDatos) {
			contadorTotal++;
			precio = 0;
			// Validacion tipo de vehiculo
			do {
				System.out.println("Ingresa tipo de vehiculo (M - Moto, A - Automovil, C - Camioneta)");
				tipoVehiculo = input.nextLine().toUpperCase().charAt(0);
				tipoValido = tipoVehiculo != TIPO_MOTO && tipoVehiculo != TIPO_AUTO && tipoVehiculo != TIPO_CAMIONETA;
			} while (tipoValido);
			// Validacion hora
			do {
				System.out.println("Ingresa la hora (solo la hora) de 0 a 23");
				hora = Integer.parseInt(input.nextLine());
				horaValida = hora < HORA_MIN || hora > HORA_MAX;
			} while (horaValida);
			// Calculo precio/hora pico, suma AUTOS y Acumulo recaudacion
			esHoraPico = hora > HORA_PICO_MIN && hora < HORA_PICO_MAX;
			
			switch (tipoVehiculo) {
			case TIPO_MOTO:
				precio += PRECIO_MOTO;
				break;
			case TIPO_AUTO:
				precio += PRECIO_AUTO;
				contadorAutos++;
				break;
			case TIPO_CAMIONETA:
				precio += PRECIO_CAMIONETA;
				break;
			}
			System.out.println(
					esHoraPico ? "El peaje del vehiculo " + patente + " es " + (precio = precio * AUMENTO_HORA_PICO)
							: "El peaje del vehiculo " + patente + " es " + precio);
			acumRecaudado += precio;
			// Lectura de Fin de Ciclo y validacion de empty
			
			do {
				System.out.println("Ingresa la patente del vehiculo. ([FIN] para finalizar la carga)");
				patente = input.nextLine();
				patenteVacia = patente.isEmpty();
				if (patenteVacia)
					System.out.println("Error!!! escriba una patente");
			} while (patenteVacia);
			finDeDatos = !patente.equalsIgnoreCase(FIN_DATOS);
		}
		input.close();
		if (contadorTotal > 0) {
			porcentajeAutos = contadorAutos * 100 / contadorTotal;
			System.out.println("El porcentaje de Autos es de " + porcentajeAutos + " %");
			System.out.println("El total recaudado es " + acumRecaudado);
		} else {
			System.out.println("No se ingresaron vehiculos");
		}
		System.out.println("FIN");

	}
}
