package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private static final String TXT_CANTIDADES = "Han sido fabricado: %d mesas, %d sillas y %d sillones\n";
	private ArrayList<Mueble> listaMuebles;
	private String nombre;

	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.listaMuebles = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		if (m != null) {
			System.out.println("Fabricando el mueble: ");
			m.mostrar();
			retorno = listaMuebles.add(m);
		}
		return retorno;
	}

	@Override
	public void mostrar() {
		int cantMesas = 0;
		int cantSillas = 0;
		int cantSillones = 0;
		float acumVentas = 0;
		System.out.println("Fabrica de muebles: " + nombre);

		for (Mueble mueble : listaMuebles) {
			if (mueble instanceof Mesa) {
				cantMesas++;
			} else if (mueble instanceof Silla) {
				cantSillas++;
			} else {
				cantSillones++;
			}
			acumVentas += mueble.calcularPrecioVenta();
		}

		System.out.printf(TXT_CANTIDADES, cantMesas, cantSillas, cantSillones);
		System.out.println("La venta total fue: $" + acumVentas);
	}

	public boolean seHaFabricado(String modelo) {

		boolean seHaFabricado = false;
		int i = 0;
		while (i < listaMuebles.size() && !seHaFabricado) {
			if (listaMuebles.get(i).modeloCorrecto(modelo)) {
				seHaFabricado = true;
			} else {
				i++;
			}
		}
		return seHaFabricado;
	}

}
