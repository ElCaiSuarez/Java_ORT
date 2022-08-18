package estructurada;

import java.util.Scanner;

public class Practica_Parcial_Casino_FinCiclo_DOWHILE {

	public static void main(String[] args) {
		final int DINERO_INICIAL_MINIMO = 500, RESULTADO_GANO = 2, RESULTADO_EMPATO = 1, RESULTADO_PERDIO = 0,
				PRECIO_RUL = 100, PRECIO_BJK = 200, PRECIO_PKR = 500, DINERO_RESTANTE_MINIMO = PRECIO_RUL,
				DINERO_RESTANTE_MAXIMO = 5000;
		final double DINERO_RESTANTE_PORCENTAJE_LIMITE = 0.2;
		final String CODIGO_RUL = "RUL", CODIGO_BJK = "BJK", CODIGO_PKR = "PKR";

		String nombreJugador, nombreJuego;
		int dineroInicial = 0, dineroRestante, precioJuego = 0, resultadoJuego = Integer.MAX_VALUE, contadorRul = 0,
				contadorBjk = 0, contadorPkr = 0, contadorTot = 0;
		boolean puedeJugar = false;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese su nombre: ");
		nombreJugador = input.nextLine();
		do {
			System.out.println("Ingrese la cantidad de dinero con que jugara (minimo $500): ");
			dineroInicial = Integer.parseInt(input.nextLine());
		} while (dineroInicial < DINERO_INICIAL_MINIMO);
		dineroRestante = dineroInicial;
		do {
			do {
				System.out.println("a que juego desea jugar? (Ingrese RUL/BJK/PKR): ");
				nombreJuego = input.nextLine();
				nombreJuego = nombreJuego.toUpperCase();
			} while ((!nombreJuego.equals(CODIGO_RUL)) && (!nombreJuego.equals(CODIGO_BJK))
					&& (!nombreJuego.equals(CODIGO_PKR)));
			//LOS SWITCH NO LLEVAN DEFAULT PQ EL DATO YA ESTA VALIDADO
			switch (nombreJuego) {
			case CODIGO_RUL:
				precioJuego = PRECIO_RUL;
				puedeJugar = dineroRestante >= PRECIO_RUL;
				break;
			case CODIGO_BJK:
				precioJuego = PRECIO_BJK;
				puedeJugar = dineroRestante >= PRECIO_BJK;
				break;
			case CODIGO_PKR:
				precioJuego = PRECIO_PKR;
				puedeJugar = dineroRestante >= PRECIO_PKR;
				break;
			}
			System.out.println("El valor del juego es: " + precioJuego);
			if (puedeJugar) {
				dineroRestante -= precioJuego;
				resultadoJuego = (int) (Math.random() * 3);
				switch (resultadoJuego) {
				case RESULTADO_GANO:
					dineroRestante += (precioJuego * RESULTADO_GANO);
					break;
				case RESULTADO_EMPATO:
					dineroRestante += (precioJuego * RESULTADO_EMPATO);
					break;
				case RESULTADO_PERDIO:
					dineroRestante += (precioJuego * RESULTADO_PERDIO);
					break;
				}
				switch (nombreJuego) {
				case CODIGO_RUL:
					contadorRul++;
					break;
				case CODIGO_BJK:
					contadorBjk++;
					break;
				case CODIGO_PKR:
					contadorPkr++;
					break;
				}
			} else {
				System.out.println("No te alcanza el dinero");
			}
		} while ((dineroRestante > (dineroInicial * DINERO_RESTANTE_PORCENTAJE_LIMITE))
				&& (dineroRestante > DINERO_RESTANTE_MINIMO) && (dineroRestante < DINERO_RESTANTE_MAXIMO));
		input.close();
		contadorTot = (contadorRul + contadorBjk + contadorPkr);
		System.out.println("El Dinero restante es: " + dineroRestante);
		System.out.println("La cantidad de veces que jugo a la Ruleta fue: " + contadorRul + "-> "
				+ (contadorRul * 100 / contadorTot) + "%");
		System.out.println("La cantidad de veces que jugo a la Ruleta fue: " + contadorBjk + "-> "
				+ (contadorBjk * 100 / contadorTot) + "%");
		System.out.println("La cantidad de veces que jugo a la Ruleta fue: " + contadorPkr + "-> "
				+ (contadorPkr * 100 / contadorTot) + "%");
		System.out.println("FIN");
	}

}
/*
 * System.out.println("Ingrese su nombre: "); nombreJuego = input.nextLine();
 * System.out.println(
 * "Ingrese la cantidad de dinero con que jugara (minimo $500): ");
 * dineroInicial = Integer.parseInt(input.nextLine()); dineroRestante =
 * dineroInicial; do { while ((dineroInicial >= DINERO_INICIAL_MINIMO) &&
 * (dineroRestante > (dineroInicial * DINERO_RESTANTE_PORCENTAJE_LIMITE)) &&
 * (dineroRestante > DINERO_RESTANTE_MINIMO) && (dineroRestante <
 * DINERO_RESTANTE_MAXIMO)) {
 * 
 * do { System.out.println("a que juego desea jugar? (Ingrese RUL/BJK/PKR): ");
 * nombreJuego = input.nextLine(); } while
 * ((!nombreJuego.equalsIgnoreCase(CODIGO_RUL)) &&
 * (!nombreJuego.equalsIgnoreCase(CODIGO_BJK)) &&
 * (!nombreJuego.equalsIgnoreCase(CODIGO_PKR)));
 * 
 * switch (nombreJuego) { case CODIGO_RUL: precioJuego = PRECIO_RUL; puedeJugar
 * = dineroRestante >= PRECIO_RUL; break; case CODIGO_BJK: precioJuego =
 * PRECIO_BJK; puedeJugar = dineroRestante >= PRECIO_BJK; break; case
 * CODIGO_PKR: precioJuego = PRECIO_PKR; puedeJugar = dineroRestante >=
 * PRECIO_PKR; break; default: break; }
 * 
 * if (puedeJugar) { dineroRestante -= precioJuego; resultadoJuego = (int)
 * (Math.random() * 3);
 * 
 * switch (resultadoJuego) { case RESULTADO_GANO: dineroRestante += (precioJuego
 * * 2); break; case RESULTADO_EMPATO: dineroRestante += (precioJuego); break;
 * case RESULTADO_PERDIO: dineroRestante -= (precioJuego); break; default:
 * break; }
 * 
 * switch (nombreJuego) { case CODIGO_RUL: contadorRul++; break; case
 * CODIGO_BJK: contadorBjk++; break; case CODIGO_PKR: contadorPkr++; break;
 * default: break; }
 * 
 * }
 * 
 * } contadorTot = (contadorRul + contadorBjk + contadorPkr);
 * 
 * if (contadorTot > 0) { System.out.println("El Dinero restante es: " +
 * dineroRestante); System.out.println(
 * "La cantidad de veces que jugo a la Ruleta fue: " + contadorRul + "-> " +
 * (contadorRul * 100 / contadorTot ) + "%"); System.out.println(
 * "La cantidad de veces que jugo a la Ruleta fue: " + contadorBjk + "-> " +
 * (contadorBjk * 100 / contadorTot ) + "%"); System.out.println(
 * "La cantidad de veces que jugo a la Ruleta fue: " + contadorPkr + "-> " +
 * (contadorPkr * 100 / contadorTot ) + "%"); }else { System.out.println(
 * "ERROR! Ingrese la cantidad de dinero con que jugara (minimo $500): ");
 * dineroInicial = Integer.parseInt(input.nextLine()); dineroRestante =
 * dineroInicial; }
 * 
 * } while (dineroInicial < DINERO_INICIAL_MINIMO);
 * 
 * input.close(); }
 */
