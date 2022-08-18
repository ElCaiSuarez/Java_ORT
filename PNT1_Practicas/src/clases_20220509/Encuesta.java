package clases_20220509;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Encuesta {

	private final static int CANT_MIN_PREGUNTAS = 5;
	private String tituloEncuesta;
	private ArrayList<Pregunta> preguntasEncuesta;
	private LocalDateTime fechaYHoraCreacionEncuesta;
	private LocalDateTime fechaYHoraVencimientoEncuesta;
	private int cantidadMaximaRespuestas;

	public abstract boolean encuestaDisponible();

	public abstract int obtenerPuntosEncuesta();

}
