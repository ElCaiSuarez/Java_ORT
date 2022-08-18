package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo() {

	}

	public Conejo(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	public static double getMultAlimentacion() {
		return MULT_ALIMENTACION;
	}

	public static double getPorcDescPeso() {
		return PORC_DESC_PESO;
	}

	// Implemento el metodo defecar que es Abstracto en la Superclase
	public void defecar() {
		super.actualizarPeso(getPorcDescPeso());
		System.out.println("\nSoy un Conejo y estoy defecando");
		// this.actualizarPeso(PORC_DESC_PESO);
	}

	// Uso el metodo comer de la super clase
	public void comer(double peso) {
		super.comer(peso, getMultAlimentacion());
	}

}
