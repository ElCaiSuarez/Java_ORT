package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class LOJuguetesPorID extends ListaOrdenadaNodos<Integer, Juguete>{

	@Override
	public int compare(Juguete dato1, Juguete dato2) {
		// TODO Auto-generated method stub
		return dato1.getId() - dato2.getId();
	}

	@Override
	public int compareByKey(Integer clave, Juguete elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getId();
	}

}
