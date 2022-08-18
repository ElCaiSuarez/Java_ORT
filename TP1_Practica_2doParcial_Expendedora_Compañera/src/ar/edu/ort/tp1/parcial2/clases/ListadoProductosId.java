package ar.edu.ort.tp1.parcial2.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListadoProductosId extends ListaOrdenadaNodos<Integer, Producto> implements Listable{
	
	public int compare(Producto prod1, Producto prod2) {
		return prod1.getId() - prod2.getId();
	}
	
	public int compareByKey(Integer id, Producto prod) {
		return id - prod.getId();
	}
	
	public void listar() {
		System.out.println("listar prod por id: ");
		for (Producto prod : this) {
			System.out.println(prod);
		}
	}

}
