package g.thp.tp3.actividad1.Ejercicio7_Agenda_Turnero;

import java.util.ArrayList;

public class AgendaMedica {
	private ArrayList<Turno> listaTurnos;
	private int cantidadTurnos;
	private final static int CANT_MIN_TURNOS = 0;

	public AgendaMedica(int cantidadTurnos) {
		setCantidadTurnos(cantidadTurnos);
		setListaTurnos(listaTurnos);
	}

	private void setListaTurnos(ArrayList<Turno> listaTurnos) {
		this.listaTurnos = new ArrayList<>();
	}

	private void setCantidadTurnos(int cantidadTurnos) {
		if (cantidadTurnos < CANT_MIN_TURNOS) {
			cantidadTurnos = CANT_MIN_TURNOS;
		}
		this.cantidadTurnos = cantidadTurnos;
	}

	private Turno buscarTurno(String dni) {
		int i = 0;
		Turno turnoAux = null;
		while (i < listaTurnos.size() && turnoAux == null) {
			if (listaTurnos.get(i).compararDni(dni)) {
				turnoAux = listaTurnos.get(i);
			} else {
				i++;
			}
		}
		return turnoAux;
	}

	public boolean darPresente(String dni) {
		Turno turnoAux = buscarTurno(dni);
		boolean pudeDarPresente = false;
		if (turnoAux != null) {
			pudeDarPresente = turnoAux.darPresente();
		}
		return pudeDarPresente;
	}

	public boolean anularTurno(String dni) {
		Turno turnoAux = buscarTurno(dni);
		boolean pudeAnular = false;
		if (turnoAux != null) {
			pudeAnular = listaTurnos.remove(turnoAux);
		}
		return pudeAnular;
	}

	public ArrayList<Paciente> obtenerAusentes() {
		ArrayList<Paciente> listaPacientesAusentes = new ArrayList<>();
		for (Turno turno : listaTurnos) {
			if (!turno.isPresente()) {//Es el getPresente
				listaPacientesAusentes.add(turno.getPaciente());
			}
		}
		return listaPacientesAusentes;
	}

	public void listarTurnos() {
		if (listaTurnos.size() > 0) {
			System.out.println("*** La lista de turnos (" + listaTurnos.size() + ") ***");
			for (Turno turno : listaTurnos) {
				System.out.println(" " + turno);
			}
		}else {
			System.out.println("NO HAY TURNOS");
		}
	}

	// Inicializo TipoResultado con la opcion mas severa
	public TipoResultado registrarTurno(String dni, String nombre, String apellido, String telefono) {
		TipoResultado tipoResultadoAux = TipoResultado.NO_HAY_MAS_TURNOS;
		if (listaTurnos.size() < cantidadTurnos) {
			if (buscarTurno(dni) == null) {
				tipoResultadoAux = TipoResultado.TURNO_CONFIRMADO;
				listaTurnos.add(new Turno(dni, nombre, apellido, telefono));
			} else {
				tipoResultadoAux = TipoResultado.YA_TIENE_TURNO;
			}
		}
		return tipoResultadoAux;
	}
}
