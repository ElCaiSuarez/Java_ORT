package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int FIN_CARGA = 0;
		double estaturaJugador, promedioEstatura, acumuladorEstatura = 0;
		int cantJugadores = 0;
		
		System.out.println("Ingrese la estatura en metros del jugador " + (cantJugadores+1) + " o cero(0) para salir");
		estaturaJugador = input.nextDouble();
		
		while (estaturaJugador != FIN_CARGA) {
			acumuladorEstatura += estaturaJugador;
			cantJugadores++;
			System.out.println("Ingrese la estatura en metros del jugador " + (cantJugadores+1) + " o cero(0) para salir");
			estaturaJugador = input.nextDouble();
			
		}
		if (cantJugadores>0) {
			promedioEstatura=acumuladorEstatura/cantJugadores;
			System.out.println("La estatura promedio del equipo es: " + promedioEstatura);
			
		}else {
			System.out.println("No se ingresaron datos");
		}
		input.close();
		System.out.println("FIN");
	}

}
