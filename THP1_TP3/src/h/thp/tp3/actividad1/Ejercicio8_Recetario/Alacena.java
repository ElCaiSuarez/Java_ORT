package h.thp.tp3.actividad1.Ejercicio8_Recetario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alacena {
	private String fabricante;
	private ArrayList<Producto> listaProductos;

	public Alacena(String fabricante) {
		this.fabricante = fabricante;
		this.listaProductos = new ArrayList<>();
	}

	public Producto buscarProducto(String nombreProducto) {
		int i = 0;
		Producto productoAux = null;
		while (i < listaProductos.size() && productoAux == null) {
			if (listaProductos.get(i).compararNombreProducto(nombreProducto)) {
				productoAux = listaProductos.get(i);
			} else {
				i++;
			}
		}
		return productoAux;
	}

	public boolean agregarProducto(String nombreProducto, int cantidadDisponible, LocalDate fechaVencimiento) {
		boolean pudeAgregar = false;
		if (buscarProducto(nombreProducto) == null) {
			pudeAgregar = listaProductos.add(new Producto(nombreProducto, cantidadDisponible, fechaVencimiento));
		}
		return pudeAgregar;
	}

	@Override
	public String toString() {
		return "Alacena [fabricante=" + fabricante + ", listaProductos=" + listaProductos + "]";
	}

}
