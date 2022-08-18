package ar.edu.ort.tp1.parcial2;

import ar.edu.ort.tp1.parcial2.clases.Actualizacion;
import ar.edu.ort.tp1.parcial2.clases.ActualizacionPorMonto;
import ar.edu.ort.tp1.parcial2.clases.ActualizacionPorcentual;
import ar.edu.ort.tp1.parcial2.clases.ActualizacionDirecta;
import ar.edu.ort.tp1.parcial2.clases.Expendedora;
import ar.edu.ort.tp1.parcial2.clases.Producto;

public class Parcial2 {

	private static final Actualizacion ActualizacionPorcentual = null;

	public static void main(String[] args) {
		
		try {
			Expendedora maquina = new Expendedora("Super Hiper Vendedora");

			System.out.println("--- Agregado de productos... ---");
			agregarProductos(maquina);

			System.out.println("--- Aplicando actualizaciones de precio... ---");
			actualizarPrecio(maquina);

			System.out.println("--- Listados ---");
			maquina.mostrarHistoricoActualizaciones();
			maquina.mostrarErrores();
			// Descomentar segun la lista que te haya tocado implementar.
			maquina.listarProductosPorNombre();
			maquina.listarProductosPorId();
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
			// TODO: handle exception
		}

		
	}

	private static void agregarProductos(Expendedora maquina) {
		agregar(maquina, new Producto(1,100,"Bidu-Cola"));
		agregar(maquina, new Producto(2,200,"Dos Gambas Light"));
		agregar(maquina, new Producto(3,500,"Milki 1kg"));
		agregar(maquina, new Producto(3,500,"Miko-Moko"));
		// TODO - Agregar los siguientes productos usando el metodo agregar que
		// figura al final de la clase
		// ID Producto, precio inicial, nombre
		// 1, 100.0, "Bidu-Cola"
		// 2, 200.0, "Dos Gambas Light";
		// 3, 500.0, "Milki 1Kg";
		// 3, 500.0, "Miko-Moko"
	}

	private static void actualizarPrecio(Expendedora maquina) {
		maquina.ajustarPrecio(1, null);
		maquina.ajustarPrecio(1, new ActualizacionPorcentual(10));
		maquina.ajustarPrecio(2, new ActualizacionPorMonto(20));
		maquina.ajustarPrecio(2, new ActualizacionPorMonto(-2500));
		maquina.ajustarPrecio(1, new ActualizacionDirecta(-1));
		
		// TODO - Aplicar las siguientes actualizaiones de precio
		// ID Producto, Tipo de Actualizacion, valor
		// 1, null
		// 1, Porcentual, 10
		// 2, Por Monto, 20
		// 2, Por Monto, -2500
		// 1, Directa, -1;
	}

	private static void agregar(Expendedora maquina, Producto producto) {
		try {
			maquina.agregarProducto(producto);
		} catch (RuntimeException re) {
			System.out.println("El producto no se pudo crear por: " + re.getMessage());
		}
		// TODO Completar
	}

}
