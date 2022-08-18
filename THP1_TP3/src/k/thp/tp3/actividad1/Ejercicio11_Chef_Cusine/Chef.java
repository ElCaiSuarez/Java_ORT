package k.thp.tp3.actividad1.Ejercicio11_Chef_Cusine;

import java.util.ArrayList;

public class Chef {
	private Almacen refrigerados;
	private Almacen noRefrigerados;

	public Chef() {
		this.refrigerados = new Almacen();
		this.noRefrigerados = new Almacen();
	}

	public TipoEstado chequearProducto(String nombre, boolean esRefrigerado) {
		TipoEstado estadoAux = TipoEstado.NO_ENCONTRADO;
		Producto productoAux = null;
		if (esRefrigerado) {
			productoAux = buscarProducto(refrigerados, nombre);
		} else {
			productoAux = buscarProducto(noRefrigerados, nombre);
		}
		if (productoAux != null && productoAux.estaVencido()) {
			estadoAux = TipoEstado.PARA_DESCARTE;
		} else if (productoAux != null && !productoAux.estaVencido()) {
			estadoAux = TipoEstado.FRESCO;
		}
		return estadoAux;
	}

	private Producto buscarProducto(Almacen almacen, String nombre) {
		Producto productoAux = almacen.buscarProducto(nombre);
		return productoAux;
	}

	public Producto obtenerProducto(String nombre, boolean esRefrigerado) {
		Producto productoAux = null;
		if (esRefrigerado) {
			productoAux = buscarProducto(refrigerados, nombre);
		} else {
			productoAux = buscarProducto(noRefrigerados, nombre);
		}
		return productoAux;
	}

	public ArrayList<Producto> extraerProductosVencidos() {
		ArrayList<Producto> listaProductosExtraidos = new ArrayList<>();
		removerProductosVencidos(refrigerados, listaProductosExtraidos);
		removerProductosVencidos(noRefrigerados, listaProductosExtraidos);
		return listaProductosExtraidos;
	}

	public void removerProductosVencidos(Almacen almacen, ArrayList<Producto> listaProductosExtraidos) {
		ArrayList<Producto> listaProductosRemovidosAux = almacen.removerProductoVencido();
		for (Producto producto : listaProductosRemovidosAux) {
			listaProductosExtraidos.add(producto);
		}

	}

	public boolean agregarProducto(String nombre, int diasVencimiento, boolean esRefrigerado) {
		boolean pudeAgregar = false;
		if (esRefrigerado) {
			pudeAgregar = refrigerados.agregarProducto(nombre, diasVencimiento);
		} else {
			pudeAgregar = noRefrigerados.agregarProducto(nombre, diasVencimiento);
		}
		return pudeAgregar;
	}

	@Override
	public String toString() {
		return "\nChef\n" + "listaRefrigerados: \n" + refrigerados + "\nlistaNoRefrigerados: \n" + noRefrigerados;
	}

}
