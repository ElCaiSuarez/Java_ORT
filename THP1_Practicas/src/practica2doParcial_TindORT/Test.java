package practica2doParcial_TindORT;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		TindORT tindort = new TindORT();

		tindort.agregarPersona("Juan", "juan@mail.com", TipoGenero.MASCULINO, 30, TipoGenero.FEMENINO, 25, 35);
		tindort.agregarPersona("Carlos", "carlos@mail.com", TipoGenero.MASCULINO, 45, TipoGenero.INDISTINTO, 30, 50);
		System.out.println(tindort.agregarPersona("Carlos", "carlos@mail.com", TipoGenero.MASCULINO, 45,
				TipoGenero.FEMENINO, 25, 35));// FALSE YA EXISTE NOMBRE
		System.out.println(tindort.agregarPersona("Alberto", "carlos@mail.com", TipoGenero.MASCULINO, 45,
				TipoGenero.FEMENINO, 25, 35));// FALSE YA EXISTE MAIL PARA NO TENER 2 POSIBLES RESULTADOS
		tindort.agregarPersona("Maria", "maria@mail.com", TipoGenero.FEMENINO, 28, TipoGenero.MASCULINO, 30, 40);
		tindort.agregarPersona("Ana", "ana@mail.com", TipoGenero.FEMENINO, 32, TipoGenero.MASCULINO, 28, 42);
		tindort.agregarPersona("Eva", "eva@mail.com", TipoGenero.FEMENINO, 32, TipoGenero.MASCULINO, 40, 50);
		tindort.agregarPersona("Alberto", "alberto@mail.com", TipoGenero.MASCULINO, 45, TipoGenero.INDISTINTO, 30, 50);
		tindort.mostrarLista();
		System.out.println("Lista MATCH de JUAN");
		ArrayList<Persona> listaDeseadas = tindort.mostrarListado("juan@mail.com");
		for (Persona persona : listaDeseadas) {
			System.out.println(persona);
		}
		System.out.println("Lista MATCH de CARLOS");// EN EL ENUNCIADO ESTA MAL EL RESULTADO DEBE SER EVA Y NO ANA
		ArrayList<Persona> listaDeseadas2 = tindort.mostrarListado("carlos@mail.com");
		for (Persona persona : listaDeseadas2) {
			System.out.println(persona);
		}

	}

}
