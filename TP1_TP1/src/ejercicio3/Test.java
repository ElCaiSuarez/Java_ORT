package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Carrera carrera1 = new Carrera(100);
		agregarAtleta("Daniel", 10.5, carrera1);// Agregado OK
		agregarAtleta("Maria", 15.5, carrera1);// Agregado OK
		agregarAtleta("Esteban", 10.5, carrera1);// Agregado OK
		agregarAtleta("Esteban", 12.5, carrera1); // No se pudo agregar (REPETIDO)
		agregarAtleta("Veronica", 12.5, carrera1); // Agregado OK
		agregarAtleta("Alberto", 15.5, carrera1); // Agregado OK
		mostrarLosAtletas(carrera1);
		mostrarGanadores(carrera1);

	}

	public static void agregarAtleta(String nombreAtleta, double tiempo, Carrera carrera) {
		System.out.println(carrera.agregarAtleta(nombreAtleta, tiempo) ? "Agregado OK" : "No se pudo agregar");
	}

	public static void mostrarLosAtletas(Carrera carrera) {
		carrera.mostrarAtletas();
	}

	public static void mostrarGanadores(Carrera carrera) {
		carrera.mostrarGanadores();
	}

}
