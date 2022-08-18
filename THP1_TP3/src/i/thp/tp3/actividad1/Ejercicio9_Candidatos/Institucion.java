package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

import java.util.ArrayList;

public class Institucion {
	private ArrayList<Carrera> listaCarreras;

	public Institucion() {
		this.listaCarreras = new ArrayList<>();
	}

	public ArrayList<Informe> obtenerCandidatos(String nombreCarrera, int PromedioMinimo) {
		ArrayList<Informe> listaInformeAux = new ArrayList<>();
		Carrera carreraAux = buscarCarrera(nombreCarrera);
		if (carreraAux != null) {
			listaInformeAux = carreraAux.obtenerCandidatos(PromedioMinimo);
		}
		return listaInformeAux;
	}

	private Carrera buscarCarrera(String nombreCarrera) {
		Carrera carreraAux = null;
		int i = 0;
		while (i < listaCarreras.size() && carreraAux == null) {
			if (listaCarreras.get(i).comparaNombre(nombreCarrera)) {
				carreraAux = listaCarreras.get(i);
			} else {
				i++;
			}
		}
		return carreraAux;
	}

	public boolean agregarCarrera(String nombreCarrera) {
		boolean pudeAgregar = false;
		if (buscarCarrera(nombreCarrera) == null) {
			pudeAgregar = this.listaCarreras.add(new Carrera(nombreCarrera));
		}
		return pudeAgregar;
	}

	public boolean agregarAlumno(String nombreCarrera, String nombreAlumno, String mail) {
		boolean pudeAgregar = false;
		Carrera carreraAux = buscarCarrera(nombreCarrera);
		if (carreraAux != null) {
			pudeAgregar = carreraAux.agregarAlumno(nombreAlumno, mail);
		}
		return pudeAgregar;
	}

	public boolean agregarMateria(String nombreCarrera, String nombreAlumno, String nombreMateria, int notaFinal) {
		boolean pudeAgregar = false;
		Carrera carreraAux = buscarCarrera(nombreCarrera);
		if (carreraAux != null) {
			pudeAgregar = carreraAux.agregarMateria(nombreAlumno, nombreMateria, notaFinal);
		}
		return pudeAgregar;
	}

}
