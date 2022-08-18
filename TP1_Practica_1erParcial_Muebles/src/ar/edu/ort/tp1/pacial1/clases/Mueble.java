package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble {

	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble() {

	}

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public String getModelo() {
		return modelo;
	}

	// ESTE METODO HAY QUE INVESTIGAR
	protected abstract float calcularPrecioCosto();

	// ESTE METODO HAY QUE INVESTIGAR
	public float calcularPrecioVenta() {
		float costo = this.calcularPrecioCosto();
		return costo + (costo * porcentajeGanancia / 100);
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
		return modelo == this.modelo;
	}

	// ESTE METODO HAY QUE INVESTIGAR
	public void mostrar() {
		System.out.println(
				"Mueble tipo: " + this.getClass().getSimpleName() + " - Modelo: " + this.modelo + " - Precio de Venta: " + this.calcularPrecioVenta());
	}

}
