package clases_20220509;

public enum TipoEncuesta {
	ENCUESTA_GRATIS(100), ENCUESTA_PLATA(250), ENCUESTA_ORO(500);
	
	private int puntosEncuesta;

	private TipoEncuesta(int puntosEncuesta) {
		this.puntosEncuesta = puntosEncuesta;
	}

	public int getPuntosEncuesta() {
		return puntosEncuesta;
	}
	
	
}
