package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private int largo;
	private int ancho;
	private TipoMesa tipoMesa;

	public Mesa(String modelo, float costoBase, float porcentajeGanancia, int largo, int ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.tipoMesa = tipoMesa;
	}

	// ESTE METODO HAY QUE INVESTIGAR
	public float calcularPrecioCosto() {
		return this.getCostoBase() * tipoMesa.getMultiplicadorValor() + COEFICIENTE_SUPERFICIE * this.largo * this.ancho;
	}

}
