package j.thp.tp3.actividad1.Ejercicio10_Correcaminos_LocalDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Carrera> listaCarreras;

	public Empresa() {
		this.listaCarreras = new ArrayList<>();
	}

	public Carrera buscarCarrera(LocalDateTime fechaYHora) {
		Carrera carreraAux = null;
		int i = 0;
		while (i < listaCarreras.size() && carreraAux == null) {
			if (listaCarreras.get(i).comparaFechaYHora(fechaYHora)) {
				carreraAux = listaCarreras.get(i);
			} else {
				i++;
			}
		}
		return carreraAux;
	}

	public boolean agregarCarrera(LocalDateTime fechaYHora, TipoDificultad dificultad) {
		Carrera carreraAux = buscarCarrera(fechaYHora);
		boolean pudeAgregar = false;
		if (carreraAux == null) {
			pudeAgregar = listaCarreras.add(new Carrera(fechaYHora, dificultad));
		}
		return pudeAgregar;
	}

	public boolean agregarPiloto(Carrera carrera, String nombre, String dni, boolean abandono) {
		Carrera carreraAux = buscarCarrera(carrera.getFechaYHora());
		boolean pudeAgregar = false;
		if (carreraAux != null) {
			pudeAgregar = carreraAux.agregarPiloto(nombre, dni, abandono);
		}
		return pudeAgregar;
	}

	public boolean agregarVuelta(LocalDateTime fechaYHora, String dni, int tiempo) {
		boolean pudeAgregar = false;
		Carrera carreraAux = buscarCarrera(fechaYHora);
		if (carreraAux != null) {
			pudeAgregar = carreraAux.agregarVuelta(dni, tiempo);
		}
		return pudeAgregar;
	}

	public ArrayList<Informe> pilotosPorCarrera() {
		ArrayList<Informe> listaPilotosPorCarrera = new ArrayList<>();
		for (Carrera carrera : listaCarreras) {
			listaPilotosPorCarrera.add(new Informe(carrera.getFechaYHora(), carrera.obtenerCantidadPilotos()));
		}
		return listaPilotosPorCarrera;
	}

}
