package a.thp.tp3.actividad1.Ejercicio1_Array_ABM;

public class Persona {
	private String dni, apellido, domicilio;

	public Persona(String dni, String apellido, String domicilio) {
		super();
		setDni(dni);
		setApellido(apellido);
		setDomicilio(domicilio);
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	//RESPONSABILIDAD: Agregamos esta metodo para no hacer la comparacion de dni en AGENDA
	public boolean compararDni(String dniComparado) {
		return this.dni.equals(dniComparado);
		/*
		 * boolean existeDni = false; if (this.dni == dniBuscado) { existeDni = true; }
		 * return existeDni;
		 */
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellido=" + apellido + ", domicilio=" + domicilio + "]";
	}

}
