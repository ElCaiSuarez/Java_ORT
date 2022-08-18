package ar.edu.ort.tp1.final1.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class LOMotosPorPatente extends ListaOrdenadaNodos<String, Vehiculo>{

	@Override
	public int compare(Vehiculo dato1, Vehiculo dato2) {
		return dato1.getPatente().compareTo(dato2.getPatente());
	}

	@Override
	public int compareByKey(String clave, Vehiculo elemento) {
		return clave.compareTo(elemento.getPatente());
	}

}
