package clases_20220509;

public interface InterfazCliente {

	/**
	 * Alta nuevo Cliente GRATUITO con datos personales y de la empresa a la que
	 * representa
	 */
	public boolean registrarCliente(Cliente nuevoCliente);

	/**
	 * Modificacion de la membresia GRATIS o PLATA u ORO
	 */
	public boolean actuzalizarMembresia(TipoMembresia nuevaMembresia);

	/**
	 * Guarda las configuraciones de la encuesta del Cliente (segun membresia
	 * permite customizar los filtros de negocio)
	 */
	public boolean crearEncuesta(Encuesta nuevaEncuesta);

	/**
	 * Una vez cumplido el vencimiento y/o el maximo de resultados/respuestas, el
	 * cliente puede generar un reporte de la encuesta finalizada
	 **/
	public Encuesta obtenerReporteEncuestaFinalizada();
}
