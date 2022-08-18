package clases_20220509;

public class EncuestaOro extends Encuesta {
	private final static int CANT_MAX_PREGUNTAS_ORO = 30;
	private final static int CANT_MAX_DIAS_DISPONIBLE_ORO = 60;
	private TipoEncuesta tipoEncuestaOro = TipoEncuesta.ENCUESTA_ORO;

	@Override
	public boolean encuestaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public int obtenerPuntosEncuesta() {
		return tipoEncuestaOro.getPuntosEncuesta();
	}

}
