package h.thp.tp3.actividad1.Ejercicio8_Recetario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Heladera heladera = new Heladera("Heladera1");
		Alacena alacena = new Alacena("Alacena1");
		Recetario recetario = new Recetario();
		System.out.println(recetario.agregarReceta("Codigo1", "NombreReceta1"));//Agrego receta 1
		System.out.println(recetario.agregarReceta("Codigo2", "NombreReceta2"));//Agrego receta 2
		System.out.println(recetario.agregarIngrediente("NombreReceta1", "Ingrediente1", 5, true));//Agrego Ingrediente 1 a la Receta 1
		System.out.println(recetario.agregarIngrediente("NombreReceta1", "Ingrediente2", 10, false));//Agrego Ingrediente 2 a la Receta 1
		System.out.println(recetario.agregarIngrediente("NombreReceta2", "Ingrediente1", 1, true));//Agrego Ingrediente 1 a la Receta 2
		System.out.println(recetario.agregarIngrediente("NombreReceta2", "Ingrediente2", 2, false));//Agrego Ingrediente 2 a la Receta 2
		System.out.println(recetario.agregarIngrediente("NombreRecetaX", "Ingrediente1", 5, true));//Agrego Ingrediente 1 a la Receta INEXISTENTE
		System.out.println("Lista de Compra con Heladera y Alacena vacias");
		ArrayList<Ingrediente> listaIngredientes = recetario.prepararListadoAComprar("NombreReceta1", 2, heladera,
				alacena);
		for (Ingrediente ingrediente : listaIngredientes) {
			System.out.println(ingrediente);
		}
		System.out.println(heladera.agregarProducto("Ingrediente1", 5, LocalDate.of(2021, 12, 15)));//Agrego un producto a la Heladera
		System.out.println(alacena.agregarProducto("Ingrediente2", 5, LocalDate.of(2021, 12, 20)));//Agrego un producto a la Alacena
		System.out.println("Lista de Compra con Heladera y Alacena con Productos");
		ArrayList<Ingrediente> listaIngredientes2 = recetario.prepararListadoAComprar("NombreReceta1", 2, heladera,
				alacena);
		for (Ingrediente ingrediente : listaIngredientes2) {
			System.out.println(ingrediente);
		}
		
		System.out.println();
		System.out.println("Recetas Posibles");
		ArrayList<Receta> listaRecetasPosibles = recetario.recetasPosiblesAPreparar(heladera, alacena, 1);
		for (Receta receta : listaRecetasPosibles) {
			System.out.println(receta);
		}

		// System.out.println(LocalDate.of(2021, 12, 15).isAfter(LocalDate.now()));

	}

}
