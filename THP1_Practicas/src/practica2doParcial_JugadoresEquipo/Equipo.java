package practica2doParcial_JugadoresEquipo;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Jugador> listaJugadores;
	private final static int maxJugadores = 14;

	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.listaJugadores = new ArrayList<>();
	}

	public boolean compararNombreEquipo(String nombreEquipo) {
		return this.nombreEquipo.equals(nombreEquipo);
	}

	public Jugador buscarJugador(int numeroJugador) {
		int i = 0;
		Jugador jugadorAux = null;
		while (i < listaJugadores.size() && jugadorAux == null) {
			if (listaJugadores.get(i).compararNumero(numeroJugador)) {
				jugadorAux = listaJugadores.get(i);
			}else {
				i++;
			}
		}
		return jugadorAux;
	}

	public boolean agregarJugador(int numero, String apellido, int cantidadGoles) {
		boolean pudeAgregar = false;
		if (buscarJugador(numero) == null) {
			if (listaJugadores.size() < maxJugadores) {
				pudeAgregar = listaJugadores.add(new Jugador(numero, apellido, cantidadGoles));
			}
		}
		return pudeAgregar;
	}

	public boolean mostrarGoles(int numeroJugador) {
		boolean pudeEncontrar = false;
		Jugador jugadorAux = buscarJugador(numeroJugador);
		if (jugadorAux != null) {
			System.out.println(
					"El jugador " + jugadorAux.getApellido() + " hizo: " + jugadorAux.getCantidadGoles() + " goles...");
		}
		return pudeEncontrar;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	
	
	private ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public int contarGoles(Equipo equipoRecibido) {
		int acumGoles = 0;
		for (Jugador jugador : equipoRecibido.getListaJugadores()) {
			acumGoles += jugador.getCantidadGoles();
		}
		return acumGoles;
	}

}
