package practica20220315_ORTBuster;

public class Entrada {
	private String dia;
	private String hora;
	private int fila;
	private String letra;

	public Entrada(String dia, String hora, int fila, String letra) {
		// this.dia = dia;
		setDia(dia);
		// this.hora = hora;
		setHora(hora);
		// this.numero = numero;
		setLetra(letra);
		// this.letra = letra;
		setFila(fila);
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public int getfila() {
		return fila;
	}

	public String getLetra() {
		return letra;
	}

	private void setDia(String dia) {
		this.dia = dia;
	}

	private void setHora(String hora) {
		this.hora = hora;
	}

	private void setFila(int fila) {
		this.fila = fila;
	}

	private void setLetra(String letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "Entrada [dia=" + dia + ", hora=" + hora + ", fila=" + fila + ", letra=" + letra + "]";
	}

}
