package ar.edu.ort.tp1.parcial1.clases;

public class Asegurado implements Mostrable {

	private String nombre;
	private String apellido;
	private int edad;
	private Genero genero;
	private String dni;

	public Asegurado(String nombre, String apellido, int edad, Genero genero, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
	}

	public boolean comparaDni(String dniRecibido) {
		return this.dni == dniRecibido;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public void mostrar() {
		toString();
	}

	@Override
	public String texto() {
		return toString();
	}

	public Genero getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Asegurado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", dni=" + dni + "]";
	}

}
