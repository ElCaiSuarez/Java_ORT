package ar.edu.ort.tp1.parcial1.clases;

public class SeguroHogar extends Seguro {

	private static final String DESCRIPCION = "Seguro combinado familiar";
	private static final float VALOR_M2 = 725f;
	private int metrosCuadrados;
	private Provincia provincia;

	public SeguroHogar(int metrosCuadrados, Provincia provincia) {
		super();
		setMetrosCuadrados(metrosCuadrados);
		setProvincia(provincia);
	}

	private void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	private void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public void mostrar() {
		System.out.println(DESCRIPCION);

	}

	@Override
	public String texto() {
		return DESCRIPCION;
	}

	@Override
	public float calcularPremio() {
		return this.metrosCuadrados * VALOR_M2 * this.provincia.getMultiplicadorRiesgo();
	}

}
