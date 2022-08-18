package thp.tp2.actividad2.Ejercicio2_ObjetosConObjetosyEnums;

public class Persona {
	private String nombre;
	private String apellido;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, Computadora computadora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.computadora = computadora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Computadora getComputadora() {
		return computadora;
	}
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	public void actualizarLectora(String marca, boolean puedeGrabar){
		computadora.actualizarLectora(marca, puedeGrabar);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", computadora=" + computadora + "]";
	}
	
	
}
