package practica2doParcial_OrtMusic;

import java.util.ArrayList;

public class Cuenta {
	private int idUsuario;
	private String nombreUsuario;
	private ArrayList<Tema> listaTemas;

	public Cuenta(int idUsuario, String nombreUsuario) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.listaTemas = new ArrayList<>();
	}

	public boolean agregarTema(String titulo, String autor, int anio, String genero) {
		boolean pudeAgregar = false;
		if (buscarTema(titulo) == null) {
			pudeAgregar = this.listaTemas.add(new Tema(titulo, autor, anio, genero));
		}
		return pudeAgregar;
	}

	private Tema buscarTema(String titulo) {
		int i = 0;
		Tema temaAux = null;
		while (i < listaTemas.size() && temaAux == null) {
			if (listaTemas.get(i).compararTitulo(titulo)) {
				temaAux = listaTemas.get(i);
			} else {
				i++;
			}
		}
		return temaAux;
	}

	public boolean reproducirTema(String titulo) {
		boolean pudeReproducir = false;
		Tema temaAux = buscarTema(titulo);
		if (temaAux != null) {
			temaAux.sumarReproduccion();
		}
		return pudeReproducir;
	}

	public void listarTemas(String genero) {
		for (Tema tema : listaTemas) {
			if (tema.getGenero().equals(genero)) {
				System.out.println(tema);
			}
		}
	}

	public void temaMasReproducido(String genero) {
		int maximoAux = 1;// PARA QUE NO MUESTRE LOS TEMAS NO REPRODUCIDOS NUNCA
		ArrayList<Tema> listaTemasAux = new ArrayList<>();
		for (Tema tema : listaTemas) {
			if (tema.getGenero() == genero) {
				if (tema.getCantidadReproducciones() > maximoAux) {
					listaTemasAux.clear();
					listaTemasAux.add(tema);
					maximoAux = tema.getCantidadReproducciones();
				} else if (tema.getCantidadReproducciones() == maximoAux) {
					listaTemasAux.add(tema);
				}
			}
		}
		if (listaTemasAux.size() > 0) {
			for (Tema tema : listaTemasAux) {
				System.out.println("El tema del genero " + genero + " con mas Reproducciones es " + tema.getTitulo()
						+ " con " + maximoAux + " Reproducciones");
			}
		}

	}

}
