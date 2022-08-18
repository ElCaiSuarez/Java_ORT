package practica20220315_ORTBuster;

public class Asiento {
	private String letra;
	private int fila;
	private Estado estado;

	public Asiento(String letra, int fila) {
		// this.letra = letra;
		setLetra(letra);
		// this.fila = fila;
		setFila(fila);
		setEstado();
	}

	public String getLetra() {
		return letra;
	}

	public int getFila() {
		return fila;
	}

	public Estado getEstado() {
		return estado;
	}

	private void setLetra(String letra) {
		this.letra = letra;
	}

	private void setFila(int fila) {
		this.fila = fila;
	}

	private void setEstado() {
		this.estado = Estado.LIBRE;
	}

	public boolean cumlpir() {
		boolean pudeCumplir = false;
		if (this.estado == Estado.RESERVADO) {
			this.estado = Estado.CUMPLIDO;
			pudeCumplir = true;
		}
		return pudeCumplir;
	}

	public boolean reservar() {
		boolean pudeReservar = false;
		if (this.estado == Estado.LIBRE) {
			this.estado = Estado.RESERVADO;
			pudeReservar = true;
		}
		return pudeReservar;
	}

	public void liberar() {
		this.setEstado();
	}

	public boolean compararAsiento(String letra, int fila) {
		return this.letra.equals(letra) && this.fila == fila;
	}

	@Override
	public String toString() {
		return "Asiento: [letra: " + letra + ", fila: " + fila + ", estado: " + estado + "]";
	}

}
