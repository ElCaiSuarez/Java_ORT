package clases_20220509;

public class EncuestaGratis extends Encuesta {
	private final static int CANT_MAX_PREGUNTAS_GRATIS = 10;
	private final static int CANT_MAX_DIAS_DISPONIBLE_GRATIS = 15;
	private TipoEncuesta tipoEncuestaGratis = TipoEncuesta.ENCUESTA_GRATIS;

	@Override
	public boolean encuestaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public int obtenerPuntosEncuesta() {
		return tipoEncuestaGratis.getPuntosEncuesta();
	}

}
