package ejercicio2;

public class Vendedor extends SubContratado {
	private float porcentaje;

	public float calcularPago() {

		return (getCantHoras() * getPrecioHora()) * porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		setPorcentaje(porcentaje);
	}

	public Vendedor() {

	}

	@Override
	public String toString() {
		return "Vendedor [calcularPago()=" + calcularPago() + ", getNombre()=" + getNombre() + "]";
	}

}
