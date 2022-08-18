package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;
	private int contMesa = 0, contSilla = 0, contSillon = 0;
	private float acumVentas = 0;

	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		if (m != null) {
			retorno = mueblesFabricados.add(m);
			System.out.println("Fabricando el mueble: ");
			m.mostrar();
			acumVentas += m.calcularPrecioVenta();
			contadorTipos(m);
		}
		return retorno;
	}

	private void contadorTipos(Mueble m) {
		if (m instanceof Mesa) {
			contMesa++;
		} else if (m instanceof Silla) {
			contSilla++;
		} else {
			contSillon++;
		}
	}

	@Override
	public void mostrar() {

		System.out.println("Fabrica de muebles: " + this.nombre);
		System.out.printf("Se ha fabricado: %d Mesas, %d Sillas y %d Sillones \n", contMesa, contSilla, contSillon);
		System.out.println("La venta total fue: " + acumVentas);
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		int i = 0;
		while (i < mueblesFabricados.size() && !seHaFabricado) {
			seHaFabricado = mueblesFabricados.get(i).modeloCorrecto(modelo);
			i++;
		}
		return seHaFabricado;
	}

}
