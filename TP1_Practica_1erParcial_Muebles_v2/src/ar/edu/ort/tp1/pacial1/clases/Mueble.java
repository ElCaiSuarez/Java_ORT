package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {

	// TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public abstract float calcularPrecioCosto();

	public float calcularPrecioVenta() {
		return calcularPrecioCosto() * (1 + porcentajeGanancia / 100);
	}

	public void mostrar() {
		System.out.printf("Mueble tipo %s - Modelo: %s - Precio de Venta: %.2f\n", this.getClass().getSimpleName(),
				this.modelo, this.calcularPrecioVenta());
//		System.out.println("Mueble tipo " + this.getClass().getSimpleName() + " - Modelo: " + this.modelo
//				+ " - Precio de Venta: " + this.calcularPrecioVenta());
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {

		return modelo == this.modelo;
	}

}
