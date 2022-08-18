package h.thp.tp3.actividad1.Ejercicio8_Recetario;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> listaRecetas;

	public Recetario() {
		this.listaRecetas = new ArrayList<>();
	}

	private Receta buscarReceta(String nombreReceta) {
		int i = 0;
		Receta RecetaAux = null;
		while (i < listaRecetas.size() && RecetaAux == null) {
			if (listaRecetas.get(i).compararNombreReceta(nombreReceta)) {
				RecetaAux = listaRecetas.get(i);
			} else {
				i++;
			}
		}
		return RecetaAux;
	}

	public boolean agregarReceta(String codigo, String nombreReceta) {
		boolean pudeAgregar = false;
		if (buscarReceta(nombreReceta) == null) {
			pudeAgregar = listaRecetas.add(new Receta(codigo, nombreReceta));
		}
		return pudeAgregar;
	}

	public boolean agregarIngrediente(String nombreReceta, String nombreIngrediente, int cantidadNecesaria,
			boolean esRefrigerado) {
		boolean pudeAgregar = false;
		Receta recetaAux = buscarReceta(nombreReceta);
		if (recetaAux != null) {
			pudeAgregar = recetaAux.agregarIngrediente(nombreIngrediente, cantidadNecesaria, esRefrigerado);
		}
		return pudeAgregar;
	}

	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreReceta, int cantidadPorciones, Heladera heladera,
			Alacena alacena) {
		ArrayList<Ingrediente> listaIngredientesAux = new ArrayList<>();
		if (heladera != null || alacena != null) {
			Receta recetaBuscada = buscarReceta(nombreReceta);
			if (recetaBuscada != null) {
				for (Ingrediente ingrediente : recetaBuscada.getListaIngredientes()) {
					int cantidadProductosNecesarios = ingrediente.getCantidadNecesaria() * cantidadPorciones;
					Producto productoAux = null;
					if (ingrediente.isEsRefrigerado()) {
						productoAux = heladera.buscarProducto(ingrediente.getNombreIngrediente());
					} else {
						productoAux = alacena.buscarProducto(ingrediente.getNombreIngrediente());
					}
					if (productoAux != null && productoAux.noEstaVencido()) {
						cantidadProductosNecesarios -= productoAux.getCantidadDisponible();
					}
					listaIngredientesAux.add(new Ingrediente(ingrediente.getNombreIngrediente(),
							cantidadProductosNecesarios, ingrediente.isEsRefrigerado()));
				}
			} else {
				System.out.println("ERROR: RECETA INEXISTENTE");
			}
		}
		return listaIngredientesAux;
	}

	public ArrayList<Receta> recetasPosiblesAPreparar(Heladera heladera, Alacena alacena, int cantidadPorciones) {
		ArrayList<Receta> listaRecetaAux = new ArrayList<>();
		if (heladera != null || alacena != null) {
			for (int j = 0; j < listaRecetas.size(); j++) {
				boolean alcanzanProductos = false;
				for (Ingrediente ingrediente : this.listaRecetas.get(j).getListaIngredientes()) {
					int cantidadProductosNecesarios = ingrediente.getCantidadNecesaria() * cantidadPorciones;
					Producto productoAux = null;
					if (ingrediente.isEsRefrigerado()) {
						productoAux = heladera.buscarProducto(ingrediente.getNombreIngrediente());
					} else {
						productoAux = alacena.buscarProducto(ingrediente.getNombreIngrediente());
					}
					if (productoAux != null && productoAux.noEstaVencido()) {
						alcanzanProductos = (cantidadProductosNecesarios < productoAux.getCantidadDisponible());
					}
				}
				if (alcanzanProductos) {
					listaRecetaAux.add(listaRecetas.get(j));
				}
			}
		}
		return listaRecetaAux;
	}

}
