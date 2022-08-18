package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<Integrante> listaIntegrantes;

	public Grupo(String nombre) {
		super();
		setNombre(nombre);
		setListaIntegrantes();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Integrante> getListaIntegrantes() {
		return listaIntegrantes;
	}

	public int getCantidadIntegrantes() {
		return listaIntegrantes.size();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setListaIntegrantes() {
		this.listaIntegrantes = new ArrayList<>();
	}

	private Integrante buscarIntegrante(String nombre) {
		int i = 0;
		Integrante integranteAux = null;
		while (i < listaIntegrantes.size() && integranteAux == null) {
			if (listaIntegrantes.get(i).compararNombre(nombre)) {
				integranteAux = listaIntegrantes.get(i);
			} else {
				i++;
			}
		}
		return integranteAux;
	}

	public void agregarIntegrante(String nombreintegrante) {
		if (buscarIntegrante(nombreintegrante) == null) {
			listaIntegrantes.add(new Integrante(nombreintegrante));
			System.out.println(nombreintegrante + " Fue asignado al grupo " + nombre);
		}
	}

	// MODIFIQUE LA VISIBILIDAD DEL METODO SEGUN EL ENUNCIADO POR HABER USADO
	// ASOCIACION DE COMPOSICION
	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		boolean pudeEncontrarlo = false;
		while (i < listaIntegrantes.size() && !pudeEncontrarlo) {
			if (listaIntegrantes.get(i).compararNombre(nombreIntegrante)) {
				pudeEncontrarlo = true;
			} else {
				i++;
			}

		}
		if (!pudeEncontrarlo) {
			i = -1;
		}
		return i;
	}

	public String obtenerIntegrante(int posicion) {
		String nombreAux = null;
		if (posicion >= 0) {
			if (listaIntegrantes.size() >= posicion) {
				nombreAux = listaIntegrantes.get(posicion).getNombre();
			}
		}
		return nombreAux;
	}

	public String removerIntegrante(String nombre) {
		Integrante integranteAux = buscarIntegrante(nombre);
		String nombreAux = null;
		if (integranteAux != null) {
			nombreAux = integranteAux.getNombre();
			listaIntegrantes.remove(integranteAux);
		}
		return nombreAux;
	}

	private void mostrarIntegrantes() {
		System.out.println("la cantidad de integrantes del grupo es: " + getCantidadIntegrantes());
		for (Integrante integrante : listaIntegrantes) {
			System.out.println(integrante.getNombre());
		}

	}

	public void mostrar() {
		System.out.println("El nombre del grupo es: " + getNombre());
		mostrarIntegrantes();
	}

	public void vaciar() {
		listaIntegrantes.clear();
	}

	private class Integrante {
		private String nombre;

		public Integrante(String nombre) {
			super();
			setNombre(nombre);
		}

		public String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public boolean compararNombre(String nombre) {
			return this.nombre.equals(nombre);
		}
	}
}
