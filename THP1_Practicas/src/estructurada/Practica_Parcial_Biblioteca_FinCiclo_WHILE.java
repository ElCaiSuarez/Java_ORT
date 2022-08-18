package estructurada;

import java.util.Scanner;

public class Practica_Parcial_Biblioteca_FinCiclo_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char FIN_DATOS = 'Z', GENERO_INFANTIL = 'I', GENERO_NOVELA = 'N', GENERO_HISTORIA = 'H';
		final int MIN_LIBROS = 0, MIN_PAGINAS = 0;
		final String ERROR = "Error de ingreso";
		Scanner input = new Scanner(System.in);
		char letraEstante, generoLibro;
		int cantLibros, cantPaginas, mayorCantPaginas, contadorInfantil = 0, contadorNovela = 0, contadorHistoria = 0,
				contadorEstantes = 0;
		String nombreLibro, mayorNombreLibro;
		boolean finCiclo, validoCantLibros, validoNombreLibro, validoGenero, validoCantPaginas;

		System.out.println("Ingrese la letra del estante ([Z] para finalizar): ");
		letraEstante = input.nextLine().toUpperCase().charAt(0);
		finCiclo = letraEstante != FIN_DATOS;

		while (finCiclo) {
			// Inicio Estante
			contadorEstantes++;
			mayorCantPaginas = Integer.MIN_VALUE;
			mayorNombreLibro = "";
			do {
				System.out.println("Ingrese la cantidad de libros para el estante " + letraEstante);
				cantLibros = Integer.parseInt(input.nextLine());
				validoCantLibros = cantLibros < MIN_LIBROS;
				if (validoCantLibros) {
					System.out.println(ERROR);
				}
			} while (validoCantLibros);

			for (int i = 1; i <= cantLibros; i++) {
				// Inicio Libro
				do {
					System.out.println("Ingrese el nombre del libro nro " + i);
					nombreLibro = input.nextLine();
					validoNombreLibro = nombreLibro.isEmpty();
					if (validoNombreLibro) {
						System.out.println(ERROR);
					}
				} while (validoNombreLibro);
				do {
					System.out.println("Ingrese el genero para el libro (I/N/H)" + nombreLibro);
					generoLibro = input.nextLine().toUpperCase().charAt(0);
					validoGenero = generoLibro != 'I' && generoLibro != 'N' && generoLibro != 'H';
					if (validoGenero) {
						System.out.println(ERROR);
					}
				} while (validoGenero);
				do {
					System.out.println("Ingrese la cantidad de paginas del libro " + nombreLibro);
					cantPaginas = Integer.parseInt(input.nextLine());
					validoCantPaginas = cantPaginas <= MIN_PAGINAS;
					if (validoCantPaginas) {
						System.out.println(ERROR);
					}
				} while (validoCantPaginas);
				if (mayorCantPaginas < cantPaginas) {
					mayorCantPaginas = cantPaginas;
					mayorNombreLibro = nombreLibro;
				}
				switch (generoLibro) {
				case GENERO_INFANTIL:
					contadorInfantil++;
					break;
				case GENERO_NOVELA:
					contadorNovela++;
					break;
				case GENERO_HISTORIA:
					contadorHistoria++;
					break;
				}

			}
			//Fin libro
			System.out.println(cantLibros > MIN_LIBROS ? "El libro con mayor cantidad de paginas del estante " + letraEstante + " es: " + mayorNombreLibro : "No se ingresaron libros");

			System.out.println("Ingrese la letra del estante ([Z] para finalizar): ");
			letraEstante = input.nextLine().toUpperCase().charAt(0);
			finCiclo = letraEstante != FIN_DATOS;
		}
		//Fin estante
		input.close();
		if (contadorEstantes > 0) {
			System.out.println("No se ingresaron estantes");
		} else {
			System.out.println("La cantidad de libros por genero fue I: " + contadorInfantil + " N: " + contadorNovela
					+ " H: " + contadorHistoria);
			System.out.println("El promedio de libros por estante fue: "
					+ ((double) contadorHistoria + (double) contadorInfantil + (double) contadorNovela)
							/ (double) contadorEstantes);
		}

	}

}
