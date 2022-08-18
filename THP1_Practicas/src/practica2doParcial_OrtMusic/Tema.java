package practica2doParcial_OrtMusic;

public class Tema {
	private String titulo;
	private String autor;
	private int anio;
	private String genero;
	private int cantidadReproducciones;
	
	public Tema(String titulo, String autor, int anio, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.genero = genero;
		this.cantidadReproducciones = 0;
	}
	
	public boolean compararTitulo(String titulo) {
		return this.titulo.equals(titulo);
	}
	
	public void sumarReproduccion() {
		this.cantidadReproducciones++;
	}

	public String getGenero() {
		return genero;
	}

	public int getCantidadReproducciones() {
		return cantidadReproducciones;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Tema [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", genero=" + genero
				+ ", cantidadReproducciones=" + cantidadReproducciones + "]";
	}
	

	
	
}
