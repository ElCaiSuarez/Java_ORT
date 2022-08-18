package parcial;

import java.util.ArrayList;

public class Pedido implements Certificable, Mostrable {

	private ArrayList<Integer> cantidades;
	private TipoPedido tipo;
	private ArrayList<Producto> productos;

	public Pedido(TipoPedido tipo) {
		super();
		this.tipo = tipo;
		productos = new ArrayList<>();
		cantidades = new ArrayList<>();
	}// OK

	@Override
	public boolean isCertificadoSinTACC() {
		boolean esCertificado = true;
		int i = 0;
		while (i < productos.size() && esCertificado) {
			Producto productoAux = productos.get(i);
			if (productoAux instanceof ProductoConTacc) {
				esCertificado = false;
			} else {
				i++;
			}
		}
		return esCertificado;
	}

	public void agregarProducto(Producto producto, Integer cantidad) {
		int indiceProducto = buscarProducto(producto);
		if (indiceProducto >= 0) {
			Integer aux = cantidadProducto(producto) + cantidad; // SUMAR CANTIDAD ADICIONAL
			cantidades.set(indiceProducto, aux);
		} else {
			productos.add(producto);
			cantidades.add(cantidad);
		}
	}

	public void sacarProducto(Producto producto, int cantidad) {
		int indiceProducto = buscarProducto(producto);
		if (indiceProducto >= 0) {
			Integer cantidadAux = cantidadProducto(producto);
			if (cantidadAux >= cantidad) {
				cantidadAux -= cantidad;
				cantidades.set(indiceProducto, cantidadAux);
			} else {
				cantidades.remove(indiceProducto);
				productos.remove(indiceProducto);
			}
		}
	}

	private int buscarProducto(Producto producto) {
		int idx = -1;
		int i = 0;
		while (i < productos.size() && i == -1) {
			if (productos.get(i).compararProducto(producto)) {
				idx = i;
			} else {
				i++;
			}
		}
		return idx;
	}

	private int cantidadProducto(Producto producto) {
		int indiceProducto = buscarProducto(producto);
		int cantidadAux = 0;
		if (indiceProducto >= 0) {
			cantidadAux = cantidades.get(indiceProducto);
		}
		return cantidadAux;
	}

	private ArrayList<LineaPedido> getTablaProductosPedidos() {
		ArrayList<LineaPedido> lineasPedido = new ArrayList<>();

		for (int i = 0; i < productos.size(); i++) {
			lineasPedido.add(new LineaPedido(productos.get(i), cantidades.get(i)));
		}

		return lineasPedido;
	}

	private float calcularImportePedido() {
		float importeAux = 0.0f;

		for (LineaPedido lineaPedido : getTablaProductosPedidos()) {
			importeAux += lineaPedido.getPrecioLineaPedido(tipo);
		}

		return importeAux;
	}

	@Override
	public void mostrar() {
		System.out.printf(FORMATO_ENCABEZADO_CONSOLA, "Cantidad", "Nombre", "Tipo de Producto", "Precio Unitario",
				"Tipo de Producto\n");
		// float importePedidoAux = 0.0f;
		for (LineaPedido lineaPedido : getTablaProductosPedidos()) {
			lineaPedido.mostrar();
			// importePedidoAux += leniaPedido.getPrecioLineaPedido();
			// TODO
		}
		System.out.println("---------------------------------------------------------");
		boolean esCertificado = isCertificadoSinTACC();
		System.out.println("El pedido " + (esCertificado ? "" : "NO") + " es certificado sin Tacc");
		System.out.println("---------------------------------------------------------");
		System.out.printf("El Precio total del pedido es: $ %.02f", calcularImportePedido());

	}

}
