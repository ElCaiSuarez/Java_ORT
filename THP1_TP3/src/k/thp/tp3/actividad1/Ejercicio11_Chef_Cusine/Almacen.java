package k.thp.tp3.actividad1.Ejercicio11_Chef_Cusine;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto> listaProductos;

	public Almacen() {
		this.listaProductos = new ArrayList<>();

	}

	public boolean estaVencido(Producto producto) {
		return producto.estaVencido();
	}

	public Producto buscarProducto(String nombre) {
		Producto productoAux = null;
		int i = 0;
		while (i < listaProductos.size() && productoAux == null) {
			if (listaProductos.get(i).comparaNombre(nombre)) {
				productoAux = listaProductos.get(i);
			} else {
				i++;
			}
		}
		return productoAux;
	}

	public boolean agregarProducto(String nombre, int diasVencimiento) {
		Producto productoAux = buscarProducto(nombre);
		boolean pudeAgregar = false;
		if (productoAux == null) {
			pudeAgregar = listaProductos.add(new Producto(nombre, diasVencimiento));
		}
		return pudeAgregar;
	}

	public ArrayList<Producto> removerProductoVencido() {
		ArrayList<Producto> listaProductosVencidos = new ArrayList<>();
		Producto productoAux;
		int i = 0;
		while (i < listaProductos.size()) {
			if (listaProductos.get(i).estaVencido()) {
				productoAux = listaProductos.remove(i);
				listaProductosVencidos.add(productoAux);
			} else {
				i++;
			}
		}
		return listaProductosVencidos;
	}

	@Override
	public String toString() {
		return "  ListaProductos: \n" + listaProductos;
	}

}
