package b.thp.tp3.actividad1.Ejercicio2_CadenaDeResponsabilidadDeArrayList;

public class Empleado {
	private String nombreEmpleado;

	public Empleado(String nombreEmpleado) {
		setNombreEmpleado(nombreEmpleado);
	}

	private void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public boolean compararNombre(String nombreEmpleado) {
		return this.nombreEmpleado.equals(nombreEmpleado);
	}

	@Override
	public String toString() {
		return "   Empleado: " + nombreEmpleado;
	}

}
