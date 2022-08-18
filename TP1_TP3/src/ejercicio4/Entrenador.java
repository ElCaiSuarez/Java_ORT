package ejercicio4;



public class Entrenador extends Empleado {

	private int aniosExperiencia;

	public Entrenador() {
		aniosExperiencia = 0;
	}

	public Entrenador(String nombreYApellido, String horaIngreso, String horaSalida, int aniosExperiencia) {
		super(nombreYApellido, horaIngreso, horaSalida);
		setAniosExperiencia(aniosExperiencia);
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	private void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
