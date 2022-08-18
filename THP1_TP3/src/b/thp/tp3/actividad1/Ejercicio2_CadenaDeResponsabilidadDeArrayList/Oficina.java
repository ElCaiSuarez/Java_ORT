package b.thp.tp3.actividad1.Ejercicio2_CadenaDeResponsabilidadDeArrayList;

import java.util.ArrayList;

public class Oficina {
	private String nombreOficina;
	private ArrayList<Empleado> listaEmpleados;

	public Oficina(String nombreOficina) {
		setNombreOficina(nombreOficina);
		setListaEmpleados(listaEmpleados);
	}

	private void setNombreOficina(String nombreOficina) {
		this.nombreOficina = nombreOficina;
	}

	private void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = new ArrayList<>();
	}

	private String getNombreOficina() {
		return this.nombreOficina;
	}

	// Muestra nombre Oficina y llama al toString de Empleado
	public void mostrarListaConcatenada() {
		System.out.println(getNombreOficina());
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
	}

	public boolean compararNombre(String nombreOficina) {
		return this.nombreOficina.equals(nombreOficina);
	}

	private Empleado buscarEmpleado(String nombreEmpleado) {
		int i = 0;
		Empleado empleadoAux = null;
		while (i < listaEmpleados.size() && empleadoAux == null) {
			if (listaEmpleados.get(i).compararNombre(nombreEmpleado)) {
				empleadoAux = listaEmpleados.get(i);
			} else {
				i++;
			}
		}
		return empleadoAux;
	}

	public boolean agregarEmpleado(String nombreEmpleado) {
		boolean pudeAgregar = false;
		if (buscarEmpleado(nombreEmpleado) == null) {
			listaEmpleados.add(new Empleado(nombreEmpleado));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

}
