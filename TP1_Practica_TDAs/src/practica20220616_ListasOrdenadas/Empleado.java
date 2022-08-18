package practica20220616_ListasOrdenadas;

public class Empleado {
	private String legajo;
	private int anioNac;
	private String apellido;
	private String nombre;
	
	public Empleado(String legajo, int anioNac, String apellido, String nombre) {
		super();
		this.legajo = legajo;
		this.anioNac = anioNac;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", anioNac=" + anioNac + ", apellido=" + apellido + ", nombre=" + nombre
				+ "]";
	}

	public String getLegajo() {
		return legajo;
	}
	
	
	
	
}
