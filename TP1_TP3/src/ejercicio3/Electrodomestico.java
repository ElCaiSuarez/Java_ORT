package ejercicio3;

public abstract class Electrodomestico {
	private static final int VOLTAJE_DEFAULT = 220;
	private static final String SIN_DEFINIR = "Sin definir";

	private String marca;
	private String modelo;
	private int numeroSerie;
	private int voltaje;
	private boolean encendido;
	private int precio;

	public Electrodomestico() {
		marca = SIN_DEFINIR;
		modelo = SIN_DEFINIR;
		numeroSerie = 0;
		voltaje = VOLTAJE_DEFAULT;
		encendido = false;
		precio = 0;
	}

	public Electrodomestico(String marca, String modelo, int numeroSerie, int voltaje, boolean encendido, int precio) {
		setMarca(marca);
		setModelo(modelo);
		setNumeroSerie(numeroSerie);
		setVoltaje(voltaje);
		setEncendido(encendido);
		setPrecio(precio);
	}

	@Override
	public String toString() {
		return marca + ", modelo " + modelo;
	}

	public String getTipo() {
		return getClass().getSimpleName();
	}

	public abstract String mostrarProducto();

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	private void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	private void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public void encender() {
		encendido = !encendido;
	}

	public boolean estaEncendido() {
		return encendido;
	}

	public int getPrecio() {
		return precio;
	}

	private void setPrecio(int precio) {
		this.precio = precio;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
