package ejercicio2;

public class Asalariado extends Empleado {
	private float sueldo;

	// Metodo que especializa el comportamiento de la superclase
	public float calcularPago() {
		return this.sueldo;
	}

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		setSueldo(sueldo);
	}

	public Asalariado() {

	}

	public float getSueldo() {
		return sueldo;
	}

	private void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Asalariado " + getNombre() + " gana " + sueldo;
	}

}
