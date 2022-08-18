package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantCuerpos;
	private TelaSillon tela;

	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantCuerpos = cantCuerpos;
		this.tela = tela;
	}

	@Override
	public float calcularPrecioCosto() {
		return getCostoBase() * cantCuerpos * (1 + tela.getPorcentaje() / 100);
	}

}
