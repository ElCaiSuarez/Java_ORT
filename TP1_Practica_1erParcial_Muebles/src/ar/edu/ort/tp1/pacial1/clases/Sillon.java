package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantCuerpos;
	private TelaSillon telaSillon;

	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon telaSillon) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantCuerpos = cantCuerpos;
		this.telaSillon = telaSillon;
	}

	// ESTE METODO HAY QUE INVESTIGAR
	public float calcularPrecioCosto() {
		return this.getCostoBase() * this.cantCuerpos * telaSillon.getPorcentaje();
	}

}
