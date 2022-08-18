package clases_20220527;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Encuesta {
	public int EncuestaId;
	public String tituloEncuesta;
	public LocalDateTime fechaYHoraCreacionEncuesta;
	public LocalDateTime fechaYHoraVencimientoEncuesta;
	public PuntosEncuesta puntosEncuesta;
	public ArrayList<Pregunta> preguntasEncuesta;


}
