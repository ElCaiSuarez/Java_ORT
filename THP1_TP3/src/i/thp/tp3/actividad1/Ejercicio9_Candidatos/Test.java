package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Institucion institucion1 = new Institucion();
		institucion1.agregarCarrera("Carrera1");
		System.out.println(institucion1.agregarAlumno("Carrera1", "alumno1", "mail1@mail.com"));
		System.out.println(institucion1.agregarAlumno("Carrera1", "alumno1", "mail1@mail.com"));// FALSE Ya existe
																								// Alumno en la Materia
		System.out.println(institucion1.agregarAlumno("CarreraNN", "alumno2", "mail1@mail.com"));// FALSE No existe
																									// carrera
		System.out.println(institucion1.agregarAlumno("Carrera1", "alumno2", "mail1@mail.com"));
		System.out.println(institucion1.agregarAlumno("Carrera1", "alumno3", "mail1@mail.com"));
		System.out.println(institucion1.agregarAlumno("Carrera1", "alumno4", "mail1@mail.com"));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno1", "Materia1", 2));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno1", "Materia1", 2));// FALSE Ya existe Materia
																								// en el Alumno
		System.out.println(institucion1.agregarMateria("Carrera1", "alumnoNN", "Materia2", 2));// FALSE No existe Alumno
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno2", "Materia1", 4));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno2", "Materia2", 4));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia1", 8));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia2", 8));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia3", 8));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia4", 10));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia5", 8));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno3", "Materia6", 9));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno4", "Materia1", 10));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno4", "Materia2", 10));
		System.out.println(institucion1.agregarMateria("Carrera1", "alumno4", "Materia3", -10));// Nota fuera de rango
		ArrayList<Informe> listaCandidatos = institucion1.obtenerCandidatos("Carrera1", 8);// SOLO ALUMNO 3 es CANDIDATO
		System.out.println(listaCandidatos);
	}

}
