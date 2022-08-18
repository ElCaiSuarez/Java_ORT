//THP-1P-YA-11B-SUAREZ-JuanCarlos
//Encontre 2 errores: un if de mas cuando pregunta por perro == NEGATIVO y tambien el mensaje de error del piso al final del while estaba distinto al del inicio
package primer.parcial;

import java.util.Scanner;

public class primerParcialTHP {

	public static void main(String[] args) {
		// Declaracion de Constantes
		final int FIN_DATOS = 0, MAX_PISOS = 30, MIN_DPTO = 1, DPTOS_1AL10 = 4, DPTOS_11AL20 = 3, DPTOS_21AL30 = 2;
		final String ERROR = "Error de Ingreso";
		final char AFIRMATIVO = 'S', NEGATIVO = 'N';
		// Declaracion de Variables
		Scanner input = new Scanner(System.in);
		boolean validoPiso, validoDpto, validoPerro, validoGato, tieneMascota;
		char perro, gato;
		int piso, depto, contadorEncuesta = 0, contadorTieneMascota = 0, contadorTieneUnaMascota = 0,
				maxPisoGato = Integer.MIN_VALUE, maxDeptoGato = Integer.MIN_VALUE;

		// Inicio y valido PISO / FIN DE DATO
		do {
			System.out.println("Ingrese un piso (0 para terminar): ");
			piso = Integer.parseInt(input.nextLine());
			validoPiso = piso < FIN_DATOS || piso > MAX_PISOS;
			if (validoPiso) {
				//Esto lo enseñaron con la correccion
				System.err.println("Error, debe estar en el rango [ "+ FIN_DATOS + " a " + MAX_PISOS + " ]");
			}
		} while (validoPiso);

		while (piso != FIN_DATOS) {

			// Valido cantidad de deptos segun piso
			do {
								
				if (piso > 1 && piso < 10) {
					System.out.println("Ingrese el depto (1-4) para el piso " + piso);
					depto = Integer.parseInt(input.nextLine());
					validoDpto = depto < MIN_DPTO || depto > DPTOS_1AL10;
				} else if (piso > 11 && piso < 20) {
					System.out.println("Ingrese el depto (1-3) para el piso " + piso);
					depto = Integer.parseInt(input.nextLine());
					validoDpto = depto < MIN_DPTO || depto > DPTOS_11AL20;
				} else {
					System.out.println("Ingrese el depto (1-2) para el piso " + piso);
					depto = Integer.parseInt(input.nextLine());
					validoDpto = depto < MIN_DPTO || depto > DPTOS_21AL30;
				}
				if (validoDpto) {
					System.out.println(ERROR);
				}
			} while (validoDpto);

			// Valido respuesta Tiene perro?
			do {
				System.out.println("Tiene perro? (S/N) ");
				perro = input.nextLine().toUpperCase().charAt(0);
				validoPerro = perro != AFIRMATIVO && perro != NEGATIVO;
				if (validoPerro) {
					System.out.println(ERROR);
				}
			} while (validoPerro);

			// Valido respuesta Tiene gato?
			do {
				System.out.println("Tiene gato? (S/N) ");
				gato = input.nextLine().toUpperCase().charAt(0);
				validoGato = gato != AFIRMATIVO && gato != NEGATIVO;
				if (validoGato) {
					System.out.println(ERROR);
				}
			} while (validoGato);

			// Valido si tiene mascota
			tieneMascota = gato == AFIRMATIVO || perro == AFIRMATIVO;

			// Sumo contadores y guardo Maximos
			//En el parcial pusiste un IF de mas
			contadorEncuesta++;
			if (tieneMascota) {
				contadorTieneMascota++;
				if (gato == NEGATIVO) {
					//Tiene solo perro
					contadorTieneUnaMascota++;
				} else {
					//Tiene solo gato
					contadorTieneUnaMascota++;
					if (maxPisoGato < piso && maxDeptoGato < depto) {
						maxPisoGato = piso;
						maxDeptoGato = depto;
					}

				}
			}

			// Vuelvo a pedir y validar PISO / FIN DE DATO
			do {
				System.out.println("Ingrese un piso (0 para terminar): ");
				piso = Integer.parseInt(input.nextLine());
				validoPiso = piso < FIN_DATOS || piso > MAX_PISOS;
				if (validoPiso) {
					System.err.println("Error, debe estar en el rango [ "+ FIN_DATOS + " a " + MAX_PISOS + " ]");
				}
			} while (validoPiso);

		}
		// MUESTRO RESULTADOS
		input.close();
		if (contadorEncuesta > 0) {
			System.out.println("Departamentos encuestados: " + contadorEncuesta);
			System.out.println("Porcentaje de departamentos con mascotas: "
					+ ((double) contadorTieneMascota * 100 / (double) contadorEncuesta) + " %");
			System.out.println("Departamentos con solo perro o gato: " + contadorTieneUnaMascota);
			System.out.println("El gato que vive mas arriba esta en el " + maxPisoGato + " " + maxDeptoGato);
		} else {
			System.out.println("No se realizo ninguna encuesta");
		}

	}

}
