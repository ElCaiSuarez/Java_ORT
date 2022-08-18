package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;

	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
	}

	@Override
	public float calcularPrecioCosto() {
		return getCostoBase() + COEFICIENTE_SILLA * alto;
	}

}
