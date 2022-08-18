package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	// private static final int COEFICIENTE_SILLA = 3;
	private int alto;
	private MaterialSilla materialSilla;

	public Silla(String modelo, float costoBase, float porcentajeGanancia, int alto, MaterialSilla materialSilla) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
		this.materialSilla = materialSilla;
	}

	// ESTE METODO HAY QUE INVESTIGAR
	public float calcularPrecioCosto() {
		return this.getCostoBase() * materialSilla.getMultiplicadorValor() * this.alto;
	}

}
