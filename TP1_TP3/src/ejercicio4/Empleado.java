package ejercicio4;

public abstract class Empleado {

	private String nombreYApellido;
	private String horaIngreso;
	private String horaSalida;

	public Empleado() {
		nombreYApellido = "Sin definir";
		horaIngreso = "Sin definir";
		horaSalida = "Sin definir";
	}

	public Empleado(String nombreYApellido, String horaIngreso, String horaSalida) {
		this.nombreYApellido = nombreYApellido;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
}
