package practica2doParcial_AmigosClub_Reutilizacion;

import java.util.ArrayList;

public class Socio {
	private String nombreSocio;
	private int edadSocio;
	private ArrayList<Socio> listaSocio;

	public Socio(String nombreSocio, int edadSocio) {
		this.nombreSocio = nombreSocio;
		this.edadSocio = edadSocio;
		this.listaSocio = new ArrayList<>();
	}

	public boolean compararNombreSocio(String nombreSocio) {
		return this.nombreSocio.equals(nombreSocio);
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	public int getEdadSocio() {
		return edadSocio;
	}

	public Socio buscarAmigo(String nombreAmigo) {
		int i = 0;
		Socio amigoAux = null;
		while (i < listaSocio.size() && amigoAux == null) {
			if (listaSocio.get(i).compararNombreSocio(nombreAmigo)) {
				amigoAux = listaSocio.get(i);
			} else {
				i++;
			}
		}
		return amigoAux;
	}

	public boolean agregarAmigo(String amigo, int edadAmigo) {
		return this.listaSocio.add(new Socio(amigo, edadAmigo));

	}

	public boolean eliminarAmigo(String nombreAmigo) {
		boolean pudeEliminiar = false;
		Socio amigoAux = buscarAmigo(nombreAmigo);
		if (amigoAux != null) {
			pudeEliminiar = listaSocio.remove(amigoAux);
		}
		return pudeEliminiar;
	}

	public double obtenerPromedio() {
		int acumulador = 0, contador = 0;
		for (Socio amigo : listaSocio) {
			acumulador += amigo.getEdadSocio();
			contador++;
		}
		return (double) acumulador / (double) contador;
	}

	@Override
	public String toString() {
		return "Socio [nombreSocio=" + nombreSocio + ", edadSocio=" + edadSocio + ", listaAmigos=" + listaSocio + "]";
	}

}
