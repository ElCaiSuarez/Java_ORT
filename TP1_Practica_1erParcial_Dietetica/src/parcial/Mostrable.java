package parcial;

public interface Mostrable {

	public static final String FORMATO_ENCABEZADO_CONSOLA = "%9s %20s %17s %18s %19s";
	public static final String FORMATO_CANTIDAD_LINEA_CONSOLA = "%9s";
	public static final String FORMATO_LINEA_CONSOLA = "%20s %17s %18.2f %25s \n";

	public void mostrar();
}
