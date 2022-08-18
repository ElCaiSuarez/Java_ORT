package oop.siciliano20211018_CarritoDeCompras_Array;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private String usuario;
	// Atributo privado listaDeItemsDeCompra de tipo lista de Array (ArrayList) y
	// subtipo de clase ItemDeCompra
	private List<ItemDeCompra> listaDeItemsDeCompra = new ArrayList<ItemDeCompra>();

	public Carrito(String usuario) {
		super();
		this.usuario = usuario;
		this.listaDeItemsDeCompra = new ArrayList<ItemDeCompra>();
	}

	// ALTA o MODIFICA DE ITEM
	public void agregarItemDeCompra(Producto producto, int cantidad) {
		ItemDeCompra itemBuscado = devolverItemDeCompraDeProducto(producto);
		// Si itemBuscado es Distinto de Null o sea que hay un item en la lista con el
		// mismo nombre de producto entonces SUMO a la cantidad existente
		if (itemBuscado != null) {
			itemBuscado.setCantidad(itemBuscado.getCantidad() + cantidad);
			// Sino Agrego el nuevo Item a la lista (Producto, cantidad)
		} else {
			listaDeItemsDeCompra.add(new ItemDeCompra(producto, cantidad));
		}
	}

	// BUSQUEDA con Objeto
	public ItemDeCompra devolverItemDeCompraDeProducto(Producto producto) {
		// Los indices siempre arrancan en 0
		int indice = 0;
		ItemDeCompra itemAux = null;
		// Busco en la lista si el produco existe
		// Se usa While ya que no sabemos la cantidad de veces que repetiremos
		while (indice < listaDeItemsDeCompra.size() && itemAux == null) {
			//
			if (listaDeItemsDeCompra.get(indice).getProducto().equals(producto)) {
				itemAux = listaDeItemsDeCompra.get(indice);
			}
			indice++;
		}
		return itemAux;
	}

	public double calcularTotal() {
		double total = 0;
		/*
		 * for (int i = 0; i<listaDeItemsDeCompra.size(); i++){ ItemDeCompra itemAux =
		 * listaDeItemsDeCompra.get(i); total +=
		 * itemAux.getProducto().getPrecioUnitario() * itemAux.getCantidad(); }
		 */

		// Foreach
		for (ItemDeCompra item : listaDeItemsDeCompra) {
			total += item.calcularSubTotal();
		}

		return total;
	}

	// BAJA DE ITEM
	public void borrarDeLaListaProducto(Producto producto) {
		ItemDeCompra itemDeProductoBuscado = devolverItemDeCompraDeProducto(producto);
		if (itemDeProductoBuscado != null) {
			listaDeItemsDeCompra.remove(itemDeProductoBuscado);
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<ItemDeCompra> getListaDeItemsDeCompra() {
		return listaDeItemsDeCompra;
	}

	/*
	 * public void setListaDeItemsDeCompra(ArrayList<ItemDeCompra>
	 * listaDeItemsDeCompra) { this.listaDeItemsDeCompra = listaDeItemsDeCompra; }
	 */

	@Override
	public String toString() {
		return "Carrito [usuario=" + usuario + ", listaDeItemsDeCompra=" + listaDeItemsDeCompra + "]";
	}
}
