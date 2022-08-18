package clases_20220509;

import java.util.ArrayList;

public interface InterfazUsuario {

	/**
	 * Alta nuevo Usuario con datos personales para una futura paga por las
	 * encuestas realizadas
	 */
	public boolean registrarUsuario(Usuario nuevoUsuario);

	/**
	 * Actualiza las preferencias con las que se haran los filtros de negocio
	 */
	public boolean actuzalizarPreferencias(ArrayList<Preferencias> nuevasPreferencias);

	/**
	 * Obtiene una lista de encuestas disponibles para responder y sumar puntos
	 */
	public ArrayList<Encuesta> obtenerEncuestasDisponibles();

	/**
	 * Guarda las opciones del Usuario para 1 encuesta
	 */
	public boolean responderEncuesta(Encuesta encuestaRespondida);

	/**
	 * Recorre el Historial de encuestas ordenada por fecha y segun el tipo de
	 * encuesta suma puntos del Usuario
	 *
	 */
	public int obtenerPuntosUsuario();

}
