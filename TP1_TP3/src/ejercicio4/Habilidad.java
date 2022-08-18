package ejercicio4;

public class Habilidad {

	private String nombre;
	private int kgNecesarios;// Kgs necesarios para alimentar al animal luego de la habilidad

	public Habilidad() {
		nombre = "sin definir";
		kgNecesarios = 0;
	}

	public Habilidad(String nombre, int kgNecesarios) {
		setNombre(nombre);
		setKgNecesarios(kgNecesarios);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKgNecesarios() {
		return kgNecesarios;
	}

	private void setKgNecesarios(int kgNecesarios) {
		this.kgNecesarios = kgNecesarios;
	}
}