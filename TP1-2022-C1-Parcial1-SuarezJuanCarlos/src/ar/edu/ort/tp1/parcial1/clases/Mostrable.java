package ar.edu.ort.tp1.parcial1.clases;

public interface Mostrable {

	public static final String PATRON_TEXTO_HOGAR = "Provincia: %s - Metros cuadrados: %d";
	public static final String PATRON_TEXTO_TECNO = "Marca: %s - Modelo: %Ss - Valor de Reposición: %.2f";
	
	/**
	 * Muestra por consola los datos de la clase.
	 */
	public void mostrar();
	
	/**
	 * Devuelve un texto que puede utilizarse al mostrar la clase.
	 * @return El texto a mostrar.
	 */
	public String texto();
}
