package i.thp.tp3.actividad1.Ejercicio9_Candidatos;

public class Informe {
	private String nombre;
	private String mail;

	public Informe(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "Mail: " + mail + "\n";
	}

}
