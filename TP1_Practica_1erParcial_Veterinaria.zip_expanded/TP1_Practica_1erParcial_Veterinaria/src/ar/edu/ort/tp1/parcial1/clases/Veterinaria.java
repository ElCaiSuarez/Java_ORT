package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> animalesIngresados;

	public Veterinaria(String nombre, Doctor doctor) {
		setDoctor(doctor);
		setNombre(nombre);
		setAnimalesIngresados();
	}

	public Veterinaria() {

	}

	public String getNombre() {
		return nombre;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	private void setAnimalesIngresados() {
		this.animalesIngresados = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
		if (mascota != null) {
			System.out.printf(TXT_INGRESO, mascota.getNombre());
			animalesIngresados.add(mascota);
		}
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota mascotaAux = null;
		int i = 0;
		while (i < animalesIngresados.size() && mascotaAux == null) {
			if (animalesIngresados.get(i).getNombre().equals(nombreDeMascota)) {
				mascotaAux = animalesIngresados.get(i);
			} else {
				i++;
			}
		}
		return mascotaAux;
	}

	public void vacunar() {
		// Te olvidaste el contador de vacunas
		int cantVacunas = 0;
		for (Mascota mascota : animalesIngresados) {
			if (!mascota.isVacuna()) {
				cantVacunas++;
				mascota.setVacuna();
			}
		}
		System.out.println("Vacunas Aplicadas: " + cantVacunas);
	}

	public void mostrar() {
		System.out.println("Veterinaria: " + this.nombre);
		System.out.println("Doctor: " + this.doctor.getNombre());

		int cantConejos = 0;
		int cantGatos = 0;
		int cantPerros = 0;
		// FOREACH con el uso de instanceof para diferenciar las SubClases
		for (Mascota mascota : animalesIngresados) {
			if (mascota instanceof Conejo) {
				cantConejos++;
			} else if (mascota instanceof Gato) {
				cantGatos++;
			} else {
				cantPerros++;
			}
		}

		// DEVUELVE ERROR EL FORMATEO CON DOUBLE
		System.out.printf(TXT_CANTIDADES, cantConejos, cantGatos, cantPerros);
	}

}
