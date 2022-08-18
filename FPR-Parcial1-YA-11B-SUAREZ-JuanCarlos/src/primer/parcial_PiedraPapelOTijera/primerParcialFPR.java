package primer.parcial_PiedraPapelOTijera;

import java.util.Scanner;

public class primerParcialFPR {

	public static void main(String[] args) {
		// Declaracion de Constantes
		final int MIN_DATOS = 1, MAX_DATOS = 5;
		final String EMPATE = "EMPATE", JUGADOR_1 = "ANA", JUGADOR_2 = "BARTOLO", PIEDRA = "piedra", PAPEL = "papel",
				TIJERA = "tijera";
		// Declaracion de Variables
		Scanner input = new Scanner(System.in);
		boolean ganoJugador1, huboEmpate;
		int contadorJugador1, contadorJugador2, rondas;
		String opcionJugador1, opcionJugador2;

		contadorJugador1 = 0;
		contadorJugador2 = 0;
		huboEmpate = false;
		do {
			System.out.println("Ingrese rondas (1/5)");
			rondas = Integer.parseInt(input.nextLine());
		} while (rondas < MIN_DATOS || rondas > MAX_DATOS);
		for (int i = 1; i <= rondas; i++) {
			ganoJugador1 = false;
			do {
				System.out.println("Ingrese la opcion para " + JUGADOR_1);
				opcionJugador1 = input.nextLine().toLowerCase();
			} while (!opcionJugador1.equals(PIEDRA) && !opcionJugador1.equals(PAPEL) && !opcionJugador1.equals(TIJERA));
			do {
				System.out.println("Ingrese la opcion para " + JUGADOR_2);
				opcionJugador2 = input.nextLine().toLowerCase();
			} while (!opcionJugador2.equals(PIEDRA) && !opcionJugador2.equals(PAPEL) && !opcionJugador2.equals(TIJERA));
			if (!opcionJugador1.equals(opcionJugador2)) {
				switch (opcionJugador1) {
				case PIEDRA:
					ganoJugador1 = opcionJugador2.equals(TIJERA);
					break;
				case PAPEL:
					ganoJugador1 = opcionJugador2.equals(PIEDRA);
					break;
				case TIJERA:
					ganoJugador1 = opcionJugador2.equals(PAPEL);
					break;
				}
				if (ganoJugador1) {
					contadorJugador1++;
					System.out.println("Ganador de la ronda nro " + i + " : " + JUGADOR_1);
				} else {
					contadorJugador2++;
					System.out.println("Ganador de la ronda nro " + i + " : " + JUGADOR_2);
				}
			} else {
				System.out.println("La ronda nro " + i + " fue " + EMPATE);
			}
		}
		input.close();
		huboEmpate = (contadorJugador1 == contadorJugador2);
		if (!huboEmpate) {
			if (contadorJugador1 > contadorJugador2) {
				System.out.println("El ganador fue: " + JUGADOR_1);

			} else {
				System.out.println("El ganador fue: " + JUGADOR_2);
			}
		} else {
			System.out.println("El resultado del juego fue " + EMPATE);
		}

	}

}
