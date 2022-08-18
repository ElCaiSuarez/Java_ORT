package f.thp.tp3.actividad1.Ejercicio6_MusicAPP_LocalDate;

import java.time.LocalDate;

public class Cancion {
	private String nombreCancion;
	private String autor;
	private String genero;
	private LocalDate fechaPublicacion;
	private int contadorReproducciones;
	private final static int DIAS_PREMIUM = 7;
	private final static int REPRODUCCIONES_PREMIUM = 1000;

	public Cancion(String nombreCancion, String autor, String genero) {
		setNombreCancion(nombreCancion);
		setAutor(autor);
		setGenero(genero);
		setFechaPublicacion(fechaPublicacion);
		setContadorReproducciones();
	}

	private void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	private void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = LocalDate.now();
	}

	private void setContadorReproducciones() {
		this.contadorReproducciones = 0;
	}

	public boolean compararCancion(String nombreCancion, String autor) {
		return this.nombreCancion.equals(nombreCancion) && this.autor.equals(autor);
	}

	public void sumarReproduccion() {
		this.contadorReproducciones++;
	}

	public int calcularContadorDias(LocalDate fechaPublicacion) {
		return LocalDate.now().compareTo(fechaPublicacion);
	}

	public boolean esPremium() {
		return (calcularContadorDias(this.fechaPublicacion) < DIAS_PREMIUM) && (this.contadorReproducciones < REPRODUCCIONES_PREMIUM);
	}

	@Override
	public String toString() {
		return "  Cancion: " + nombreCancion + ", autor: " + autor + ", genero: " + genero;
	}

}
