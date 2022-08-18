package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

public class Materia {
	private String nombre;
	private int notaFinal;

	public Materia(String nombre, int notaFinal) {
		this.nombre = nombre;
		setNotaFinal(notaFinal);
		;
	}

	public void setNotaFinal(int notaFinal) {
		if (notaFinal >= 1 && notaFinal <= 10) {
			this.notaFinal = notaFinal;
		} else {
			this.notaFinal = 0;
			System.out.println("Nota fuera de rango");
		}
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public boolean comparaNombre(String nombreMateria) {
		return this.nombre.equals(nombreMateria);
	}
}
