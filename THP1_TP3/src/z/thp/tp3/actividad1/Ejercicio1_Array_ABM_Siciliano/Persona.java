package z.thp.tp3.actividad1.Ejercicio1_Array_ABM_Siciliano;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	private Fecha fechaNacimiento;

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona(String nombre, String apellido, String dni, Domicilio domicilio, Fecha fechaNacimiento) {
		// super();
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setDomicilio(domicilio);
		setFechaNacimiento(fechaNacimiento);
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

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Nombre y Apellido: " + nombre + " " + apellido + " Dni: " + dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

}
