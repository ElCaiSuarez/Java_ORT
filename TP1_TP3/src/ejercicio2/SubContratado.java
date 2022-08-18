package ejercicio2;

public class SubContratado extends Empleado {
	private float cantHoras, precioHora;

	// Metodo que especializa el comportamiento de la superclase
	public float calcularPago() {
		return this.cantHoras * this.precioHora;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	private void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	private void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		setCantHoras(cantHoras);
		setPrecioHora(precioHora);
	}

	public SubContratado() {

	}

	@Override
	public String toString() {
		return "SubContratado " + getNombre() + " gana " + calcularPago();
	}

}
