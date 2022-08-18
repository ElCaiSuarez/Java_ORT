package practica2doParcial_JugadoresEquipo;

public class Aplicacion {
	private Equipo equipo;

	public Aplicacion(Equipo equipo) {
		this.equipo = equipo;
	}

	public boolean agregarJugador(Equipo equipoRecibido, int numero, String apellido, int cantidadGoles) {

		return equipoRecibido.agregarJugador(numero, apellido, cantidadGoles);

	}

	public void mostrarGoles(Equipo equipoRecibido, int numeroJugador) {
		if (equipoRecibido.buscarJugador(numeroJugador) != null) {
			equipoRecibido.mostrarGoles(numeroJugador);
		} else {
			System.out.println("Jugador Inexistente");
		}

	}

	public void jugar(Equipo equipoRecibido) {
		int acumEquipo1 = this.equipo.contarGoles(this.equipo);
		int acumEquipo2 = equipoRecibido.contarGoles(equipoRecibido);
		if (acumEquipo1 > acumEquipo2) {
			System.out.println("Gano el equipo " + this.equipo.getNombreEquipo() + " Resultado: " + acumEquipo1 + " a "
					+ acumEquipo2);
		} else if (acumEquipo1 < acumEquipo2) {
			System.out.println("Gano el equipo " + equipoRecibido.getNombreEquipo() + " Resultado: " + acumEquipo2
					+ " a " + acumEquipo1);
		} else {
			System.out.println("Hubo empate entre los equipos " + this.equipo.getNombreEquipo() + " y "
					+ equipoRecibido.getNombreEquipo() + " Resultado: " + acumEquipo1 + " a " + acumEquipo2);
		}
	}

	@Override
	public String toString() {
		return "Aplicacion [equipo=" + equipo + "]";
	}

}
