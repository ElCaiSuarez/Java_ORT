package g.thp.tp3.actividad1.Ejercicio7_Agenda_Turnero;

public class Turno {
	private boolean presente;
	private Paciente paciente;

	public Turno(String dni, String nombre, String apellido, String telefono) {
		setPresente(presente);
		setPaciente(dni, nombre, apellido, telefono);
	}

	private void setPresente(boolean presente) {
		this.presente = false;
	}

	private void setPaciente(String dni, String nombre, String apellido, String telefono) {
		this.paciente = new Paciente(dni, nombre, apellido, telefono);
	}

	public boolean isPresente() {
		return presente;
	}
	
	public boolean darPresente() {
		return this.presente = true;
	}

	public boolean compararDni(String dni) {
		return paciente.compararDni(dni);
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Override
	public String toString() {
		return "Paciente=" + paciente + ", sePresento:" + presente;
	}

}
