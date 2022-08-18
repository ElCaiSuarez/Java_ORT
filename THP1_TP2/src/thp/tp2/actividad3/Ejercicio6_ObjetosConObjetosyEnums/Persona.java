package thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private Fecha fechaNacimiento;
	private Domicilio domicilio;

	public Persona(int dni, String nombre, String apellido, Fecha fechaNacimiento, Domicilio domicilio) {
		// super();
		// this.dni = dni;
		setDni(dni);
		// this.nombre = nombre;
		setNombre(nombre);
		// this.apellido = apellido;
		setApellido(apellido);
		// this.fecha = fecha;
		setFecha(fechaNacimiento);
		// this.domicilio = domicilio;
		setDomicilio(domicilio);
	}

	public int getDni() {
		return dni;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Fecha getFecha() {
		return fechaNacimiento;
	}

	private void setFecha(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	private void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", domicilio=" + domicilio + "]";
	}

}
