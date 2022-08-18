package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {
	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro() {

	}

	public Perro(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	public static double getMultAlimentacion() {
		return MULT_ALIMENTACION;
	}

	public static double getPorcDescPeso() {
		return PORC_DESC_PESO;
	}

	public void defecar() {
		System.out.println("\nSoy un Perro y estoy defecando");
		this.actualizarPeso(PORC_DESC_PESO);
	}

	public void comer(double peso) {
		super.comer(peso, MULT_ALIMENTACION);
	}

}
