package e.thp.tp3.actividad1.Ejercicio5_OrtFLIX_ABM_Reutilizacion;

public class Pelicula{
	private String nombrePelicula;
	
	public Pelicula(String nombrePelicula) {
		setNombrePelicula(nombrePelicula);
	}
	
	private void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	@Override
	public String toString() {
		return "  Pelicula: " + nombrePelicula;
	}
	
	public boolean compararNombre(String nombrePelicula) {
		return this.nombrePelicula.equals(nombrePelicula);
	}
	
}
