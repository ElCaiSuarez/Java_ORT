package ejercicio1;

public abstract class Empleado {
	private String nombre;
	private int edad;

	public abstract float calcularPago();

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public Empleado(String nombre, int edad) {
		super();
		setNombre(nombre);
		setEdad(edad);
	}

	/*
	 * public Empleado() {
	 * 
	 * }
	 */

	public String toString() {
		// return getClass().getSimpleName() + nombre + " gana: " + calcularPago();
		return String.format("%s %s gana: %.2f", getClass().getSimpleName(), nombre, calcularPago());
	}

}
