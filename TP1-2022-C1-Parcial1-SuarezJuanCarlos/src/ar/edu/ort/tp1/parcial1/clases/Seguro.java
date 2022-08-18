package ar.edu.ort.tp1.parcial1.clases;

public abstract class Seguro implements Mostrable {

	private static final String MOSTRAR_PATTERN = "Seguro de %s, cuya descripci�n es %s - detalle: %s, pagar� mensualmente $ %.2f.\n";
	private String dniAsegurado; // ID DE ASEGURADO

	public Seguro() {

	}

	public void setAsegurado(String dniRecibido) {
		this.dniAsegurado = dniRecibido;
	}

	public abstract float calcularPremio();

	/*
	 * NO ME QUEDO CLARO SI TENIA QUE USAR ESTE METODO
	 */
	public void mostrar() {
		System.out.printf(MOSTRAR_PATTERN, this.dniAsegurado, this.texto(), this.getClass().getSimpleName(),
				this.calcularPremio());
	}

}
