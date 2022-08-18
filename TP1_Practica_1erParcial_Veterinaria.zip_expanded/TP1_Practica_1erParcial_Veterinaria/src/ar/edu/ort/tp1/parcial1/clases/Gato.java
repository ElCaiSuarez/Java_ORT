package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {
	private static final double MULT_ALIMENTACION = 0.033;
	private static final double PORC_DESC_PESO = -1;

	public Gato() {

	}

	public Gato(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	public static double getMultAlimentacion() {
		return MULT_ALIMENTACION;
	}

	public static double getPorcDescPeso() {
		return PORC_DESC_PESO;
	}

	public void defecar() {
		System.out.println("\nSoy un Gato y estoy defecando");
		this.actualizarPeso(PORC_DESC_PESO);
	}

	public void comer(double peso) {
		super.comer(peso, MULT_ALIMENTACION);
	}

}
