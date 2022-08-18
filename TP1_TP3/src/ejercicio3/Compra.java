package ejercicio3;

import java.util.ArrayList;

public class Compra {
	private ArrayList<Electrodomestico> carrito;
	
	public Compra() {
		 carrito = new ArrayList<Electrodomestico>();
	}
	
	public void agregarProducto(Electrodomestico producto) {
		carrito.add(producto);
	}

	public ArrayList<Electrodomestico> getCarrito() {
		return carrito;
	}
	
	public boolean hayProductos() {
		return !carrito.isEmpty();
	}
	
	public Ticket finalizarCompra() {
		return new Ticket(carrito);
	}
}
