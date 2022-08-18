package practica20220315_ORTBuster;

import java.util.ArrayList;

public class Cine {
	private String nombre;
	private String pelicula;
	private ArrayList<Funcion> listaFunciones;
	// private ArrayList<Entrada> listaEntradas; Relacion de USO

	public Cine(String nombre, String pelicula) {
		setNombre(nombre);
		setPelicula(pelicula);
		setLitsaFunciones();
		// this.listaEntradas = new ArrayList<>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	private void setLitsaFunciones() {
		this.listaFunciones = new ArrayList<>();
	}

	public boolean agregarFuncion(String dia, String hora) {
		boolean pudeAgregar = false;
		Funcion funcionAux = buscarFuncion(dia, hora);
		if (funcionAux == null) {
			pudeAgregar = listaFunciones.add(new Funcion(dia, hora));
		}
		return pudeAgregar;
	}

	private Funcion buscarFuncion(String dia, String hora) {
		Funcion funcionAux = null;
		int i = 0;
		while (i < listaFunciones.size() && funcionAux == null) {
			if (listaFunciones.get(i).compararFuncion(dia, hora)) {
				funcionAux = listaFunciones.get(i);
			} else {
				i++;
			}
		}
		return funcionAux;
	}

	public void mostrarFunciones() {
		System.out.println("Cine: " + nombre + "\n Pelicula: " + pelicula);
		for (Funcion funcion : listaFunciones) {
			funcion.mostrarAsientos();
		}

	}

	public boolean procesarEntradas(ArrayList<Entrada> listaEntradas) {
		boolean pudeProcesar = false, entradaCorrectas = true;
		int i = 0;
		ArrayList<Asiento> listaAsientosAux = new ArrayList<>();
		while (i < listaEntradas.size() && entradaCorrectas) {
			Funcion funcionAux = buscarFuncion(listaEntradas.get(i).getDia(), listaEntradas.get(i).getHora());
			if (funcionAux != null) {
				Asiento asientoAux = funcionAux.buscarAsiento(listaEntradas.get(i).getLetra(),
						listaEntradas.get(i).getfila());
				if (asientoAux != null) {
					asientoAux.reservar(); // PARA SIMULAR QUE LA ENTRADA ESTA RESERVADA
					if (asientoAux.getEstado() == Estado.RESERVADO) {
						listaAsientosAux.add(asientoAux);
						entradaCorrectas = true;
					} else {
						entradaCorrectas = false;
						System.out.println("ASIENTO NO RESERVADO");
					}
				} else {
					entradaCorrectas = false;
					System.out.println("ASIENTO INEXISTENTE");
				}
			} else {
				entradaCorrectas = false;
				System.out.println("FUNCION INEXISTENTE");
			}
			i++;
		}
		if (entradaCorrectas) {
			pudeProcesar = cumplirAsientos(listaAsientosAux);
		}
		System.out.println(pudeProcesar ? "ENTRADAS PROCESADAS CORRECTAMENTE" : "ENTRADAS NO PROCESADAS");
		return pudeProcesar;
	}

	private boolean cumplirAsientos(ArrayList<Asiento> listaAsientos) {
		boolean pudeCumplir = false;
		for (Asiento asiento : listaAsientos) {
			pudeCumplir = asiento.cumlpir();
		}
		return pudeCumplir;
	}

}
