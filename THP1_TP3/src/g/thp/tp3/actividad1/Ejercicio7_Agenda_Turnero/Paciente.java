package g.thp.tp3.actividad1.Ejercicio7_Agenda_Turnero;

public class Paciente {
	private String dni, nombre, apellido, telefono;

	public Paciente(String dni, String nombre, String apellido, String telefono) {
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		setTelefono(telefono);
	}

	private void setDni(String dni) {
		if (!dni.isEmpty()) {
			this.dni = dni;
		}
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean compararDni(String dni) {
		return this.dni.equals(dni);
	}
	
	@Override
	public String toString() {
		return "dni: " + dni + ", nombre: " + nombre + ", apellido: " + apellido + ", telefono: " + telefono;
	}

}
