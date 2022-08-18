package oop.binker20211025_TP3Ejercicio0_Array;

import java.util.ArrayList;


public class Listas {

	public static void main(String[] args) {
		// No hace falta en el instanciado new ArrayList<>(); poner el tipo de dato
		ArrayList<String> palabrasArrayList = new ArrayList<>();

		// Agregamos elementos
		palabrasArrayList.add("bokita"); // Agrega al final del Array
		palabrasArrayList.add(0, "scaloneta"); // Agrega en la posicion 0 del ArrayList (NO SE USA XQ TIRA ERROR)
		palabrasArrayList.add("bitcoin");
		palabrasArrayList.size(); // Cantidad de elementos que tiene una lista

		// FOR Cuando necesito recorrer toda la ArrayList 
		// y necesito usar el indice para iterar
		for (int i = 0; i < palabrasArrayList.size(); i++) {
			String palabra = palabrasArrayList.get(i);
			if (palabra.length() > 7) // En un IF con 1 sola instruccion no hace falta los {}
				System.out.println(palabra);

		}
		// FOR EACH Cuando necesito recorrer toda la ArrayList y NO necesito usar el
		// indice para iterar
		// (Va pisando en cada iteracion la variable temporal del mismo tipo de los
		// registros del ArrayList)
		for (String string : palabrasArrayList) {
			if (string.length() > 7)
				System.out.println(string);
		}
		palabrasArrayList.remove("bokita"); // Borra el elemento String "bokita" y devuelve False si no existe
		palabrasArrayList.remove(0); // Borra el elemento en la posicion 0 del ArrayList (Puede tirar error OUT OF
										// BOUND)

		String palabraPisada = palabrasArrayList.set(0, "juancito"); // NO SE USA Reemplaza el elemento en la posicion 0
																		// del ArrayList y devuelve el elemento
																		// reemplazado
		System.out.println("pise en la lista a " + palabraPisada);

	}

}
