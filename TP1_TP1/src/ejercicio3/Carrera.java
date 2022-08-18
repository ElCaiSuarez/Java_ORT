package ejercicio3;

import java.util.ArrayList;

public class Carrera {
	private ArrayList<Atleta> listaAtletas;
	private int distancia;

	public Carrera(int distancia) {
		super();
		setListaAtletas();
		setDistancia(distancia);
	}

	public ArrayList<Atleta> getListaAtletas() {
		return listaAtletas;
	}

	public int getDistancia() {
		return distancia;
	}

	private void setListaAtletas() {
		this.listaAtletas = new ArrayList<>();
	}

	private void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public boolean agregarAtleta(String nombre, double tiempo) {
		boolean pudeAgregar = false;
		if (buscarAtleta(nombre) == null) {
			pudeAgregar = listaAtletas.add(new Atleta(nombre, tiempo));
		}
		return pudeAgregar;
	}

	private Atleta buscarAtleta(String nombre) {
		int i = 0;
		Atleta atletaAux = null;
		while (i < listaAtletas.size() && atletaAux == null) {
			if (listaAtletas.get(i).comparaNombre(nombre)) {
				atletaAux = listaAtletas.get(i);
			} else {
				i++;
			}
		}
		return atletaAux;
	}

	private ArrayList<Atleta> getGanadores() {
		ArrayList<Atleta> listaGanadores = new ArrayList<>();
		double minTiempo = Integer.MAX_VALUE;
		for (Atleta atleta : listaAtletas) {
			double temporal = atleta.getTiempo();
			if (temporal <= minTiempo) {
				if (temporal < minTiempo) {
					listaGanadores.clear();
					minTiempo = temporal;
				}
				listaGanadores.add(atleta);
			}
		}
		return listaGanadores;
	}

	private ArrayList<Atleta> getGanadores(double mejorTiempo) {
		ArrayList<Atleta> listaSegundosOTerceros = new ArrayList<>();
		double minTiempo = Integer.MAX_VALUE;
		for (Atleta atleta : listaAtletas) {
			double temporal = atleta.getTiempo();
			if (temporal > mejorTiempo) {
				if (temporal <= minTiempo) {
					if (temporal < minTiempo) {
						listaSegundosOTerceros.clear();
						minTiempo = temporal;
					}
					listaSegundosOTerceros.add(atleta);
				}
			}
		}
		return listaSegundosOTerceros;
	}

	public void mostrarGanadores() {
		double tiempoPrimerPuesto = Integer.MAX_VALUE;
		double tiempoSegundoPuesto = Integer.MAX_VALUE;
		for (Atleta atleta : getGanadores()) {
			System.out.println("El/los ganador/es : " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo());
			tiempoPrimerPuesto = atleta.getTiempo();
		}
		for (Atleta atleta : getGanadores(tiempoPrimerPuesto)) {
			System.out.println("El/los segundo/s : " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo());
			tiempoSegundoPuesto = atleta.getTiempo();
		}
		for (Atleta atleta : getGanadores(tiempoSegundoPuesto)) {
			System.out.println("El/los tercero/s : " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo());
		}
	}

	public void mostrarAtletas() {
		System.out.println("Para la distancia: " + this.distancia + " los atletas fueron: ");
		for (Atleta atleta : listaAtletas) {
			System.out.println("Nombre atleta: " + atleta.getNombre() + " Tiempo: " + atleta.getTiempo());

		}
	}

}
