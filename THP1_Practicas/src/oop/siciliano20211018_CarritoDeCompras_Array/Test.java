package oop.siciliano20211018_CarritoDeCompras_Array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se pide hacer un carrito de compras donde un usuario va a poder comprar X cantidad de unidades de un
		//producto, del producto se sabe su nombre y precio unitario. Del carrito sabemos que tiene items.
		//Cada item de compra es un producto más una cantidad (por ejemplo 2 unidades del producto alfajor)
		//Se pide que un usuario pueda agregar productos en un carrito de compras con su cantidad
		//Que los pueda borrar y que pueda editar su cantidad (por ejemplo agrego 1 unidad y luego decide agregar 2 más)
		
		Carrito carrito = new Carrito("Gustavo");
		Producto alfajor = new Producto("Alfajor", 20);
		Producto leche = new Producto("Leche", 25);
		
		System.out.println("Lista vacia");
		System.out.println(carrito.getListaDeItemsDeCompra());
		System.out.println(carrito);
		// \n salto de linea
		System.out.println("\nLista con objetos");
		carrito.agregarItemDeCompra(alfajor, 2);
		carrito.agregarItemDeCompra(leche, 3);
		System.out.println(carrito.getListaDeItemsDeCompra());
		
		System.out.println("\nLista con un agregado mas");
		carrito.agregarItemDeCompra(alfajor, 9);
		System.out.println(carrito.getListaDeItemsDeCompra());
		
		System.out.println("\nBusco producto 'Alfajor'");
		System.out.println(carrito.devolverItemDeCompraDeProducto(alfajor));
		
		System.out.println("\nBorro producto 'Alfajor'");
		carrito.borrarDeLaListaProducto(alfajor);
		System.out.println(carrito.getListaDeItemsDeCompra());
		
		//Se pide tener un método en la clase compra para calcular el total de la venta
		System.out.println("\nEl Total es:");
		System.out.println(carrito.calcularTotal());
		//Se pide que la clase ItemDeCompra pueda calcular su subtotal
		//Desarrollar por parte de la/os estudiantes
	}

}
