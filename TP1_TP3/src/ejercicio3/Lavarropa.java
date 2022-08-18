package ejercicio3;

public class Lavarropa extends Electrodomestico {

	private int cargaMaxima;
	private boolean esAutomatico;

	public Lavarropa() {
		cargaMaxima = 0;
		esAutomatico = false;
	}

	public Lavarropa(String marca, String modelo, int numeroSerie, int voltaje, boolean encendido, int precio,
			int cargaMaxima, boolean esAutomatico) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		setCargaMaxima(cargaMaxima);
		setEsAutomatico(esAutomatico);
	}

	@Override
	public String toString() {
		return "Lavarropa " + super.toString() + " carga maxima " + cargaMaxima + " kgs " + descripcionAutomatico()
				+ ": $" + getPrecio() + ".";
	}

	public String descripcionAutomatico() {
		String retorno;
		if (esAutomatico) {
			retorno = "automatico";
		} else {
			retorno = "semi autom�tico";
		}
		return retorno;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	private void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public boolean isEsAutomatico() {
		return esAutomatico;
	}

	private void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	public String mostrarProducto() {
		return "Lavarropas " + getMarca() + " " + descripcionAutomatico() + ", carga m�xima " + cargaMaxima
				+ "kg, modelo " + getModelo() + ": $" + getPrecio() + ".";
	}

}