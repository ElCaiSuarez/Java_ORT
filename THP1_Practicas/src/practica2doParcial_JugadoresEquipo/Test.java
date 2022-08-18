package practica2doParcial_JugadoresEquipo;

public class Test {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("Equipo1");
		Equipo equipo2 = new Equipo("Equipo2");
		Aplicacion aplicacion = new Aplicacion(equipo1);
		System.out.println(aplicacion.agregarJugador(equipo1, 1, "Jugador1", 3));
		System.out.println(aplicacion.agregarJugador(equipo1, 2, "Jugador2", 0));
		System.out.println(aplicacion.agregarJugador(equipo1, 3, "Jugador3", 3));
		System.out.println(aplicacion.agregarJugador(equipo1, 4, "Jugador4", 0));

		System.out.println(aplicacion.agregarJugador(equipo2, 1, "Jugador1", 0));
		System.out.println(aplicacion.agregarJugador(equipo2, 2, "Jugador2", 2));
		System.out.println(aplicacion.agregarJugador(equipo2, 3, "Jugador3", 0));
		System.out.println(aplicacion.agregarJugador(equipo2, 4, "Jugador4", 2));

		aplicacion.jugar(equipo2);
		aplicacion.mostrarGoles(equipo1, 3);
		aplicacion.mostrarGoles(equipo2, 4);
	}

}
