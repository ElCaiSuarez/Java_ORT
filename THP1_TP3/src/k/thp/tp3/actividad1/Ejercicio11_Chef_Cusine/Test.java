package k.thp.tp3.actividad1.Ejercicio11_Chef_Cusine;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		/**
		 * Fecha fechaHoy = new Fecha(); System.out.println(fechaHoy); int dias = 20;
		 * LocalDate fecha2 = LocalDate.of(2021, 12, 25); LocalDate fechaAux =
		 * fechaHoy.descontarDias(fecha2, dias); System.out.println(fechaAux);
		 * System.out.println(fechaHoy.esFechaMenor(fechaAux));
		 **/

		Chef empresa = new Chef();
		// System.out.println(empresa);
		empresa.agregarProducto("Producto1", 20, false);// No Refrigerado 1
		empresa.agregarProducto("Producto2", 20, false);// No Refrigerado 2
		empresa.agregarProducto("Producto3", 20, false);// No Refrigerado 3
		empresa.agregarProducto("Producto4", 20, false);// No Refrigerado 4
		empresa.agregarProducto("Producto5", 20, false);// No Refrigerado 5
		empresa.agregarProducto("Producto6", 20, true);// Refrigerado 1
		empresa.agregarProducto("Producto7", 20, true);// Refrigerado 2
		empresa.agregarProducto("Producto8", 20, true);// Refrigerado 3
		empresa.agregarProducto("Producto9", 20, true);// Refrigerado 4
		empresa.agregarProducto("Producto10", 20, true);// Refrigerado 5
		// System.out.println(empresa);
		System.out.println(empresa.chequearProducto("Producto1", false));// FRESCO
		System.out.println(empresa.chequearProducto("Producto1", true));// NO ENCONTRADO
		Fecha fechaVencida = new Fecha(LocalDate.of(2021, 11, 10));
		Producto producto2 = empresa.obtenerProducto("Producto2", false);
		// System.out.println(producto2);
		producto2.setFechaAlmacenamiento(fechaVencida);
		// System.out.println(empresa);
		System.out.println(empresa.chequearProducto("Producto2", false));// VENCIDO
		// System.out.println(empresa);
		ArrayList<Producto> listaProductosRemovidos = empresa.extraerProductosVencidos(); // REMUEVO PRODUCTO VENCIDO
		System.out.println(listaProductosRemovidos);// MUESTRO PRODUCTO REMOVIDO
		System.out.println(empresa);// MUESTRO PRODUCTOS FRESCOS RESTANTES
	}

}
