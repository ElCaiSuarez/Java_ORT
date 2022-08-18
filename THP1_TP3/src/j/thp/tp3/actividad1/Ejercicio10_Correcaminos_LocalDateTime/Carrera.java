package j.thp.tp3.actividad1.Ejercicio10_Correcaminos_LocalDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera {
	private LocalDateTime fechaYHora;
	private TipoDificultad dificultad;
	private ArrayList<Piloto> listaPilotos;

	public Carrera(LocalDateTime fechaYHora, TipoDificultad dificultad) {
		super();
		this.fechaYHora = fechaYHora;
		this.dificultad = dificultad;
		this.listaPilotos = new ArrayList<>();
	}

	public boolean comparaFechaYHora(LocalDateTime fechaYHora) {
		return this.fechaYHora.equals(fechaYHora);
	}

	private Piloto buscarPiloto(String dni) {
		Piloto pilotoAux = null;
		int i = 0;
		while (i < listaPilotos.size() && pilotoAux == null) {
			if (listaPilotos.get(i).comparaDni(dni)) {
				pilotoAux = listaPilotos.get(i);
			} else {
				i++;
			}
		}
		return pilotoAux;
	}

	public boolean agregarPiloto(String nombre, String dni, boolean abandono) {
		Piloto pilotoAux = buscarPiloto(dni);
		boolean pudeAgregar = false;
		if (pilotoAux == null) {
			pudeAgregar = listaPilotos.add(new Piloto(nombre, dni, abandono));
		}
		return pudeAgregar;
	}

	public boolean agregarVuelta(String dni, int tiempo) {
		boolean pudeAgregar = false;
		Piloto pilotoAux = buscarPiloto(dni);
		if (pilotoAux != null) {
			pudeAgregar = pilotoAux.agregarVuelta(tiempo);
		}
		return pudeAgregar;
	}

	public LocalDateTime getFechaYHora() {
		return fechaYHora;
	}

	public ArrayList<Piloto> buscarPilotosPorDebajoDe(int segundos) {
		ArrayList<Piloto> listaPilotosAux = new ArrayList<>();
		double promedioAux = 0;
		for (Piloto piloto : listaPilotos) {
			promedioAux = piloto.calcularPromedio();
			if (promedioAux < segundos && piloto.obtenerVueltas() > 10) {
				listaPilotosAux.add(piloto);
			}
		}
		return listaPilotosAux;
	}

	public void mostrarMenorPromedio() {
		Piloto pilotoAux = null;
		double promedioMin = Integer.MAX_VALUE;
		double promedioAux = Integer.MAX_VALUE;
		for (Piloto piloto : listaPilotos) {
			promedioAux = piloto.calcularPromedio();
			if (promedioAux < promedioMin) {
				promedioMin = promedioAux;
				pilotoAux = piloto;
			}
		}
		System.out.println(pilotoAux != null ? pilotoAux + " Promedio: " + promedioMin : "No hay Pilotos");
	}

	public int obtenerCantidadPilotos() {
		return this.listaPilotos.size();
	}

}
