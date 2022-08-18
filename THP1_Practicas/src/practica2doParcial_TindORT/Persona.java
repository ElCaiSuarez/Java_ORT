package practica2doParcial_TindORT;

public class Persona {
	private String nombrePersona;
	private String mail;
	private TipoGenero genero;
	private int edad;
	private TipoGenero generoDeseado;
	private int edadMinDedeada;
	private int edadMaxDeseada;

	public Persona(String nombrePersona, String mail, TipoGenero genero, int edad, TipoGenero generoDeseado,
			int edadMinDedeada, int edadMaxDeseada) {
		this.nombrePersona = nombrePersona;
		this.mail = mail;
		this.genero = genero;
		this.edad = edad;
		this.generoDeseado = generoDeseado;
		this.edadMinDedeada = edadMinDedeada;
		this.edadMaxDeseada = edadMaxDeseada;
	}

	public TipoGenero getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	public TipoGenero getGeneroDeseado() {
		return generoDeseado;
	}

	public int getEdadMinDedeada() {
		return edadMinDedeada;
	}

	public int getEdadMaxDeseada() {
		return edadMaxDeseada;
	}

	public boolean compararNombre(String nombre) {
		return this.nombrePersona.equals(nombre);
	}

	public boolean compararMail(String maail) {
		return this.mail.equals(maail);
	}

	@Override
	public String toString() {
		return "NombrePersona: " + nombrePersona + ", mail: " + mail + ", genero: " + genero + ", edad: " + edad
				+ ", generoDeseado: " + generoDeseado + ", edadMinDedeada: " + edadMinDedeada + ", edadMaxDeseada: "
				+ edadMaxDeseada;
	}

}
