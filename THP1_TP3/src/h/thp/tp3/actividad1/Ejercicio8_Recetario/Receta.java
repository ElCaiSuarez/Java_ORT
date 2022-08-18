package h.thp.tp3.actividad1.Ejercicio8_Recetario;

import java.util.ArrayList;

public class Receta {
	private String codigo;
	private String nombreReceta;
	private ArrayList<Ingrediente> listaIngredientes;

	public Receta(String codigo, String nombreReceta) {
		this.codigo = codigo;
		this.nombreReceta = nombreReceta;
		this.listaIngredientes = new ArrayList<>();
	}

	public ArrayList<Ingrediente> getListaIngredientes() {
		return listaIngredientes;
	}

	public boolean compararNombreReceta(String nombreReceta) {
		return this.nombreReceta.equals(nombreReceta);
	}

	private Ingrediente buscarIngrediente(String nombreIngrediente) {
		int i = 0;
		Ingrediente IngredienteAux = null;
		while (i < listaIngredientes.size() && IngredienteAux == null) {
			if (listaIngredientes.get(i).compararNombreIngrediente(nombreIngrediente)) {
				IngredienteAux = listaIngredientes.get(i);
			} else {
				i++;
			}
		}
		return IngredienteAux;
	}

	public boolean agregarIngrediente(String nombreIngrediente, int cantidadNecesaria, boolean esRefrigerado) {
		boolean pudeAgregar = false;
		if (buscarIngrediente(nombreIngrediente) == null) {
			pudeAgregar = listaIngredientes.add(new Ingrediente(nombreIngrediente, cantidadNecesaria, esRefrigerado));
		}
		return pudeAgregar;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Receta: " + nombreReceta + "\nListaIngredientes: " + listaIngredientes;
	}

}
