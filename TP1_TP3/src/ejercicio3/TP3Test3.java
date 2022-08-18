package ejercicio3;

import java.util.Scanner;

public class TP3Test3 {

	private static final String MSG_NO_HAY_PRODUCTOS_SELECCIONADOS = "No hay productos seleccionados.";
	private static final String MSG_CONFIRMA_SELECCION = "\n Confirma la seleccion del producto? (S para confirmar y N para salir)";
	private static final String MSG_LISTADO_DE_PRODUCTOS_DISPONIBLES = "Listado de productos disponibles:";
	private static final String MSG_CARACTER_NO_VALIDO = "Caracter no v�lido, vuelva a ingresarlo.";
	private static final int CARACTER_FIN = 0;
	private static final String MSG_SELECCIONAR = "Seleccione el numero del producto deseado (0 para terminar):";
	static Scanner entradaEscaner;

	public static void main(String[] args) {

		Empresa empresa;
		Compra compra;
		int entradaTecladoInt;
		String entradaTecladoString;
		boolean fin;
		//int total;

		entradaEscaner = new Scanner(System.in);
		empresa = new Empresa("Garbarino");
		compra = new Compra();
		fin = false;
		//total = 0;

		cargarProductos(empresa);

		do {
			System.out.println(MSG_LISTADO_DE_PRODUCTOS_DISPONIBLES);
			System.out.println(empresa.getListadoDeElectrodomesticos());
			entradaTecladoInt = pedirInt(MSG_SELECCIONAR, empresa.getCantidadElectrodomesticos());
			fin = validarIngresoFin(entradaTecladoInt);
			if (!fin) {
				System.out.print(empresa.getElectrodomestico(entradaTecladoInt - 1).toString());
				entradaTecladoString = pedirString(MSG_CONFIRMA_SELECCION);
				if (entradaTecladoString.equalsIgnoreCase("S")) {
					compra.agregarProducto(empresa.getElectrodomestico(entradaTecladoInt-1));
				}
			}
		} while (!fin);
		
		if (compra.hayProductos()) {
			System.out.println(compra.finalizarCompra());
		} else {
			System.out.println(MSG_NO_HAY_PRODUCTOS_SELECCIONADOS);
		}

		entradaEscaner.close();
	}

	private static void cargarProductos(Empresa empresa) {
		empresa.agregarElectrodomestico(new Heladera("Whirlpool", "H2745", 23332, 220, false, 14999, 250, true));
		empresa.agregarElectrodomestico(new Televisor("Philips", "49PGFS", 6565454, 220, false, 14370, 49, true));
		empresa.agregarElectrodomestico(new Lavarropa("Drean", "CONCEPT 5.05", 334242, 220, false, 6799, 6, false));
		empresa.agregarElectrodomestico(new Licuadora("Braun", "K34", 12320343, 220, false, 7000, 300, 5));
	}

	private static int pedirInt(String msg, int caracterMaximo) {
		int retorno;
		System.out.println(msg);
		retorno = ingresarInt();
		while (!validarCaracterIngresado(retorno, caracterMaximo)) {
			System.out.println(MSG_CARACTER_NO_VALIDO);
			retorno = ingresarInt();
		}
		return retorno;
	}

	private static int ingresarInt() {
		return Integer.parseInt(entradaEscaner.nextLine());
	}
	
	private static String pedirString(String msg) {
		String retorno;
		System.out.println(msg);
		retorno = ingresarString();
		while (!validarSiNo(retorno)) {
			System.out.println(MSG_CARACTER_NO_VALIDO);
			retorno = ingresarString();
		}
		return retorno;
	}

	private static boolean validarSiNo(String retorno) {
		return retorno.equalsIgnoreCase("S") || retorno.equalsIgnoreCase("N");
	}

	private static String ingresarString() {
		return entradaEscaner.nextLine();
	}

	private static boolean validarCaracterIngresado(int entradaTeclado, int cantidadElectrodomesticos) {
		return entradaTeclado >= CARACTER_FIN && entradaTeclado <= cantidadElectrodomesticos;
	}

	private static boolean validarIngresoFin(int entradaTeclado) {
		return entradaTeclado == CARACTER_FIN;
	}
}
