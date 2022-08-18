package b.thp.tp3.actividad1.Ejercicio2_CadenaDeResponsabilidadDeArrayList;

import java.util.ArrayList;

public class Area {
	private String nombreArea;
	private ArrayList<Oficina> listaOficinas;

	public Area(String nombreArea) {
		setNombreArea(nombreArea);
		setListaOficinas(listaOficinas);
	}

	private void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	private void setListaOficinas(ArrayList<Oficina> listaOficinas) {
		this.listaOficinas = new ArrayList<>();
	}

	private String getNombreArea() {
		return this.nombreArea;
	}

	// Muestra nombre Area y llama al metodo concatenado de Oficina
	public void mostrarListaConcatenada() {
		System.out.println(getNombreArea());
		for (Oficina oficina : listaOficinas) {
			oficina.mostrarListaConcatenada();
		}
	}

	public boolean compararNombre(String nombreArea) {
		return this.nombreArea.equals(nombreArea);

	}

	private Oficina buscarOficina(String nombreOficina) {
		int i = 0;
		Oficina oficinaAux = null;
		while (i < listaOficinas.size() && oficinaAux == null) {
			if (listaOficinas.get(i).compararNombre(nombreOficina)) {
				oficinaAux = listaOficinas.get(i);
			} else {
				i++;
			}
		}
		return oficinaAux;
	}

	private boolean agregarOficina(String nombreOficina) {
		boolean pudeAgregar = false;
		if (buscarOficina(nombreOficina) == null) {
			listaOficinas.add(new Oficina(nombreOficina));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public boolean agregarEmpleado(String nombreEmpleado, String nombreOficina) {
		boolean pudeAgregar = false;
		Oficina OficinaAux = buscarOficina(nombreOficina);
		if (OficinaAux != null) {
			pudeAgregar = OficinaAux.agregarEmpleado(nombreEmpleado);
		} else {
			agregarOficina(nombreOficina);
			OficinaAux = buscarOficina(nombreOficina);
			pudeAgregar = OficinaAux.agregarEmpleado(nombreEmpleado);
		}
		return pudeAgregar;
	}
}
