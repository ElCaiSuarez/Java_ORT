package ejercicio2;

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

	public Empleado() {

	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
