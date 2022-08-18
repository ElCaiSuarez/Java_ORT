package ejercicio3;

public class Heladera extends Electrodomestico {

	private static final String SIN_NO_FROST = "sin no frost";
	private static final String NO_FROST = "no frost";
	
	private int capacidad; // Capacidad en litros
	private boolean esNoFrost;

	public Heladera() {
		capacidad = 0;
		esNoFrost = false;
	}

	public Heladera(String marca, String modelo, int numeroSerie, int voltaje, boolean encendido, int precio,
			int capacidad, boolean esNoFrost) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		setCapacidad(capacidad);
		setEsNoFrost(esNoFrost);
	}

	@Override
	public String toString() {
		return "Heladera " + super.toString() + " capacidad " + capacidad + " litros " + descripcionNoFrost() + ": $"
				+ getPrecio() + ".";
	}

	public String mostrarProducto() {
		return "Heladera " + getMarca() + ", modelo " + getModelo() + ", " + descripcionNoFrost() + ", capacidad "
				+ capacidad + " litros: $" + getPrecio() + ".";
	}

	public String descripcionNoFrost() {
		String retorno;
		if (esNoFrost) {
			retorno = NO_FROST;
		} else {
			retorno = SIN_NO_FROST;
		}
		return retorno;
	}

	public int getCapacidad() {
		return capacidad;
	}

	private void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean EsNoFrost() {
		return esNoFrost;
	}

	private void setEsNoFrost(boolean esNoFrost) {
		this.esNoFrost = esNoFrost;
	}
}