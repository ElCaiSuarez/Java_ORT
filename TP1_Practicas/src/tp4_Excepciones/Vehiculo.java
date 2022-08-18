package tp4_Excepciones;

public class Vehiculo {
	private static final String MSG_PAT_INVALIDA = "Patente Invalida";
	private static final String MSG_ANIO_INVALIDO = "Año invalido";
	private static final int ANIO_MENOR = 1900;
	private String patente;
	private int anio;
	
	public Vehiculo(String patente, int anio) {
		super();
		setPatente(patente);
		setAnio(anio);
	}

	private void setAnio(int anio) {
		if (anio <= 0 || anio < ANIO_MENOR ) {
			throw new IllegalArgumentException(MSG_ANIO_INVALIDO);
		}	
		this.anio = anio;
	}

	private void setPatente(String patente) {
		if (patente == null || patente.isBlank()) {
			throw new IllegalArgumentException(MSG_PAT_INVALIDA);
		}		
		this.patente = patente;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", anio=" + anio + "]";
	}
	
	
	
	
}
