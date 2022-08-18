package ejercicio1;

public class NumeroTelefonico {
	private int caracteristicas, numeroDeAbonado, codigoDePais;
	private TipoDeLinea tipoDeLinea;

	public int getCaracteristicas() {
		return caracteristicas;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}

	private void setCaracteristicas(int caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	private void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	private void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	private void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	public NumeroTelefonico(int codigoDePais, int caracteristicas, int numeroDeAbonado, TipoDeLinea tipoDeLinea) {
		super();
		setCaracteristicas(caracteristicas);
		setNumeroDeAbonado(numeroDeAbonado);
		setCodigoDePais(codigoDePais);
		setTipoDeLinea(tipoDeLinea);
	}

	public String getValor() {
		return "(+" + getCodigoDePais() + ") " + getCaracteristicas() + "-" + getNumeroDeAbonado();
	}

}
