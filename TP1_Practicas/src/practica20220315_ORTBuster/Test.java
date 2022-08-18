package practica20220315_ORTBuster;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Cine cine = new Cine("ORT Buster", "Toy Story 4"); // INSTANCIO Clase Cine
		cine.agregarFuncion("viernes", "17hs"); // Agrego una Funcion
		// cine.agregarFuncion("viernes", "20hs");
		// cine.agregarFuncion("sabado", "20hs");
		// cine.agregarFuncion("sabado", "23hs");
		// cine.agregarFuncion("domingo", "20hs");

		//LISTA CON ERRORES
		/*
		 * ArrayList<Entrada> listaEntradas = new ArrayList<>();
		 * listaEntradas.add(new Entrada("lunes", "17hs", 1, "A"));//FUNCION INEXISTENTE
		 * listaEntradas.add(new Entrada("viernes", "17hs", 1, "Z"));//ASIENTO
		 * INEXISTENTE 
		 * listaEntradas.add(new Entrada("viernes", "17hs", 1,"C"));//ASIENTO NO RESERVADO
		 * System.out.println(cine.procesarEntradas(listaEntradas));
		 */
		
		//LISTA CORRECTA
		// Habilitar asientoAux.reservar(); en el metodo procesarEntradas() de la clase
		// Cine

		ArrayList<Entrada> listaEntradas2 = new ArrayList<>();
		listaEntradas2.add(new Entrada("viernes", "17hs", 1, "A"));
		listaEntradas2.add(new Entrada("viernes", "17hs", 1, "B"));
		listaEntradas2.add(new Entrada("viernes", "17hs", 1, "C"));
		cine.procesarEntradas(listaEntradas2);

		
		cine.mostrarFunciones();
	}

}
