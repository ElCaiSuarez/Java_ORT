package b.thp.tp3.actividad1.Ejercicio2_CadenaDeResponsabilidadDeArrayList;

import java.util.ArrayList;

public class Compania {
	private String nombreCompania;
	private ArrayList<Area> listaAreas;

	public Compania(String nombreCompania) {
		setNombreCompania(nombreCompania);
		setListaAreas(listaAreas);
	}

	private void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	private void setListaAreas(ArrayList<Area> listaAreas) {
		this.listaAreas = new ArrayList<>();
	}

	private String getNombreCompania() {
		return this.nombreCompania;
	}

	// Muestra nombre Compania y llama al metodo concatenado de Area
	public void mostrarListaConcatenada() {
		System.out.println(getNombreCompania());
		for (Area area : listaAreas) {
			area.mostrarListaConcatenada();
		}
	}

	private Area buscarArea(String nombreArea) {
		int i = 0;
		Area areaAux = null;
		while (i < listaAreas.size() && areaAux == null) {
			if (listaAreas.get(i).compararNombre(nombreArea)) {
				areaAux = listaAreas.get(i);
			} else {
				i++;
			}
		}
		return areaAux;
	}

	private boolean agregarArea(String nombreArea) {
		boolean pudeAgregar = false;
		if (buscarArea(nombreArea) == null) {
			listaAreas.add(new Area(nombreArea));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public boolean agregarEmpleado(String nombreEmpleado, String nombreArea, String nombreOficina) {
		boolean pudeAgregar = false;
		Area areaAux = buscarArea(nombreArea);
		if (areaAux != null) {
			pudeAgregar = areaAux.agregarEmpleado(nombreEmpleado, nombreOficina);
		} else {
			agregarArea(nombreArea);
			areaAux = buscarArea(nombreArea);
			pudeAgregar = areaAux.agregarEmpleado(nombreEmpleado, nombreOficina);
		}
		return pudeAgregar;
	}
}
