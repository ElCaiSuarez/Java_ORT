package z.thp.tp3.actividad1.Ejercicio2_ArrayListConArrayList_Siciliano;

import java.util.ArrayList;

public class Oficina {
	private String direccion;
	private ArrayList<Empleado> empleados;

	public Oficina(String direccion) {
		setDireccion(direccion);
		setEmpleados(empleados);

	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = new ArrayList<Empleado>();
	}

	public boolean agregarEmpleado(Empleado empleado) {
		return empleados.add(empleado);
	}

	public void devolverInfoEMpleados() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}

	@Override
	public String toString() {
		return "Oficina [direccion=" + direccion + ", empleados=" + empleados + "]";
	}

}
