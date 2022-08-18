package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Alumno> listaAlumnos;
	private static int CANDIDATOS_MAX = 20;

	public Carrera(String nombre) {
		this.nombre = nombre;
		this.listaAlumnos = new ArrayList<>();
	}

	public boolean comparaNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public ArrayList<Informe> obtenerCandidatos(int PromedioMinimo) {
		ArrayList<Informe> listaInformeAux = new ArrayList<>();
		Alumno alumnoAux;
		int i = 0;
		while (i < listaAlumnos.size() && listaInformeAux.size() <= CANDIDATOS_MAX) {
			alumnoAux = listaAlumnos.get(i);
			if (alumnoAux.esCandidato() && alumnoAux.obtenerPromedio() >= PromedioMinimo) {
				listaInformeAux.add(new Informe(alumnoAux.getNombre(), alumnoAux.getMail()));
			}
			i++;
		}
		return listaInformeAux;
	}

	private Alumno buscarAlumno(String nombreAlumno) {
		Alumno alumnoAux = null;
		int i = 0;
		while (i < listaAlumnos.size() && alumnoAux == null) {
			if (listaAlumnos.get(i).comparaNombre(nombreAlumno)) {
				alumnoAux = listaAlumnos.get(i);
			} else {
				i++;
			}
		}
		return alumnoAux;
	}

	public boolean agregarAlumno(String nombreAlumno, String mail) {
		boolean pudeAgregar = false;
		if (buscarAlumno(nombreAlumno) == null) {
			pudeAgregar = this.listaAlumnos.add(new Alumno(nombreAlumno, mail));
		}
		return pudeAgregar;
	}

	public boolean agregarMateria(String nombreAlumno, String nombreMateria, int notaFinal) {
		boolean pudeAgregar = false;
		Alumno alumnoAux = buscarAlumno(nombreAlumno);
		if (alumnoAux != null) {
			pudeAgregar = alumnoAux.agregarMateria(nombreMateria, notaFinal);
		}
		return pudeAgregar;
	}

}
