package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String mail;
	private ArrayList<Materia> listaMaterias;
	private static int APROBADA = 4;
	private static int APROBO_MIN = 5;

	public Alumno(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		this.listaMaterias = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public boolean comparaNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public boolean esCandidato() {
		boolean esCandidato = false;
		int i = 0;
		int contadorAux = 0;
		while (i < listaMaterias.size() && contadorAux < APROBO_MIN) {
			if (listaMaterias.get(i).getNotaFinal() > APROBADA) {
				contadorAux++;
			}
			i++;

		}
		if (contadorAux >= 5) {
			esCandidato = true;
		}
		return esCandidato;
	}

	public double obtenerPromedio() {
		double acumAux = 0;
		for (Materia materia : listaMaterias) {
			acumAux += materia.getNotaFinal();
		}
		return acumAux / listaMaterias.size();
	}

	private Materia buscarMateria(String nombreMateria) {
		Materia materiaAux = null;
		int i = 0;
		while (i < listaMaterias.size() && materiaAux == null) {
			if (listaMaterias.get(i).comparaNombre(nombreMateria)) {
				materiaAux = listaMaterias.get(i);
			} else {
				i++;
			}
		}
		return materiaAux;
	}

	public boolean agregarMateria(String nombreMateria, int notaFinal) {
		boolean pudeAgregar = false;
		if (buscarMateria(nombreMateria) == null) {
			pudeAgregar = this.listaMaterias.add(new Materia(nombreMateria, notaFinal));
		}
		return pudeAgregar;
	}

}
