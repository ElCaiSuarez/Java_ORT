package clases_20220509;

public class EncuestaPlata extends Encuesta {
	private final static int CANT_MAX_PREGUNTAS_PLATA = 20;
	private final static int CANT_MAX_DIAS_DISPONIBLE_PLATA = 30;
	private TipoEncuesta tipoEncuestaPlata = TipoEncuesta.ENCUESTA_PLATA;

	@Override
	public boolean encuestaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public int obtenerPuntosEncuesta() {
		return tipoEncuestaPlata.getPuntosEncuesta();
	}

}
