package ejercicio2;

public class Atleta {
	private String nombre;
	private double tiempo;

	public Atleta(String nombre, double tiempo) {
		super();
		setNombre(nombre);
		setTiempo(tiempo);
	}

	public String getNombre() {
		return nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public boolean comparaNombre(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", tiempo=" + tiempo + "]";
	}

}
