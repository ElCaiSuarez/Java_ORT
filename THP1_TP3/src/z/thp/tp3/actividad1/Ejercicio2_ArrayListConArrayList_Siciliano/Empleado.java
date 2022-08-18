package z.thp.tp3.actividad1.Ejercicio2_ArrayListConArrayList_Siciliano;

public class Empleado {
	private String nombre;

	public Empleado(String nombre) {
		super();
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	
}
