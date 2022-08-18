package segundo.parcial;

import java.util.ArrayList;

public class Tren {
	private int numeroTren;
	private ArrayList<Vagon> listaVagones;
	private final static int MAX_VAGONES = 30;

	public Tren(int numeroTren) {
		this.numeroTren = numeroTren;
		this.listaVagones = new ArrayList<>();
	}

	public boolean compararTren(int numeroTren) {
		return this.numeroTren == numeroTren;
	}

	public boolean agregarVagones(int cantidadVagones, TipoVagon tipoVagon) {
		boolean pudeAgregar = false;
		if ((listaVagones.size() + cantidadVagones) < MAX_VAGONES) {
			for (int i = 0; i < cantidadVagones; i++) {
				listaVagones.add(new Vagon(tipoVagon));
			}
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public int calcularCapacidadDisponible() {
		int acumCapacidadDisponible = 0;
		for (Vagon vagon : listaVagones) {
			acumCapacidadDisponible += vagon.getCapacidad();
		}
		return acumCapacidadDisponible;
	}

	public boolean cargarVagones(int cantidadToneladas) {
		boolean pudeAgregar = false;
		int i = 0;
		while (i < listaVagones.size() && cantidadToneladas != 0) {
			cantidadToneladas = listaVagones.get(i).restarCapacidad(cantidadToneladas);
			i++;
		}
		if (cantidadToneladas == 0) {
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	private int obtenerCapacidadMaxima() {
		int acumAux = 0;
		for (Vagon vagon : listaVagones) {
			acumAux += vagon.obtenerCapacidadVagon();
		}
		return acumAux;
	}

	public void listarCapacidadDisponible() {
		double porcentaje = (double) calcularCapacidadDisponible() * 100 / (double) obtenerCapacidadMaxima();
		System.out.println("Tren: " + this.numeroTren + " Espacio Libre: " + porcentaje + "%");
	}

	public int sacarVagonesVacios() {
		int contadorVagones = 0;
		int i = 0;
		while (i < listaVagones.size()) {
			if (listaVagones.get(i).getCapacidad() == listaVagones.get(i).obtenerCapacidadVagon()) {
				contadorVagones++;
				listaVagones.remove(i);
			} else {
				i++;
			}
		}
		return contadorVagones;
	}

}
