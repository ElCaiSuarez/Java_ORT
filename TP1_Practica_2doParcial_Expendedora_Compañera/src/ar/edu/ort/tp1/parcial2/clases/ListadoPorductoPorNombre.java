package ar.edu.ort.tp1.parcial2.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListadoPorductoPorNombre extends ListaOrdenadaNodos<String, Producto> implements Listable {

	public ListadoPorductoPorNombre() {
		this(SIN_LIMITE);
	}
	
	public ListadoPorductoPorNombre(int maxSize) {
		super(maxSize);
	}
	
	public int compare(Producto prod1, Producto prod2) {
		return prod1.getNombre().compareTo(prod2.getNombre());
	}

	public int compareByKey(String nombre, Producto prod) {
		return nombre.compareTo(prod.getNombre());
	}

	public void listar() {
		System.out.println("listar prod por nombre: ");
		for (Producto prod : this) {
			System.out.println(prod);
		}
	}

	
}