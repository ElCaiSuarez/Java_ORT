package clases_20220527;

public enum PuntosEncuesta {
	ENCUESTA_GRATIS(100), ENCUESTA_PLATA(250), ENCUESTA_ORO(500);
	
	private int puntosEncuesta;

	private PuntosEncuesta(int puntosEncuesta) {
		this.puntosEncuesta = puntosEncuesta;
	}

	public int getPuntosEncuesta() {
		return puntosEncuesta;
	}
	
	
}
