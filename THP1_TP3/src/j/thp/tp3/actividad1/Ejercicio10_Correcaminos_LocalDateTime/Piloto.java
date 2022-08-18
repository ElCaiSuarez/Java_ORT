package j.thp.tp3.actividad1.Ejercicio10_Correcaminos_LocalDateTime;

import java.util.ArrayList;

public class Piloto {
	private String nombre;
	private String dni;
	private ArrayList<Vuelta> listaVueltas;
	private boolean abandono;

	public Piloto(String nombre, String dni, boolean abandono) {
		this.nombre = nombre;
		this.dni = dni;
		this.listaVueltas = new ArrayList<>();
		this.abandono = abandono;
	}

	public boolean comparaDni(String dni) {
		return this.dni.equals(dni);
	}

	public boolean agregarVuelta(int tiempo) {
		boolean pudeAgregar = false;
		if (!abandono && tiempo > 0) {
			pudeAgregar = listaVueltas.add(new Vuelta(tiempo));
		}
		return pudeAgregar;
	}

	public String getDni() {
		return dni;
	}

	public double calcularPromedio() {
		double acumAux = 0;
		for (Vuelta vuelta : listaVueltas) {
			acumAux += vuelta.getTiempo();
		}
		return Matematica.obtenerPromedio(acumAux, (double) listaVueltas.size());
	}

	public int obtenerVueltas() {
		return listaVueltas.size();
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + ", dni: " + dni + ", abandono: " + abandono;
	}

}
