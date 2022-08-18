package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio35_FinDeDatos_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final String FIN_CARGA = "*";
		String nombrePersona, nombreMasJoven;
		int edad, edadMinima;
		boolean edadValida;
		nombreMasJoven = "";
		edadMinima = Integer.MAX_VALUE;
		
		System.out.println("Ingrese el nombre de la persona: (* para fin de carga)");
		nombrePersona = input.nextLine();
		
		while (!nombrePersona.equals(FIN_CARGA)) {
			
			do {
				System.out.println("Ingrese la edad: ");
				edad = Integer.parseInt(input.nextLine());
				edadValida = edad < 0;
				System.out.println(edadValida ? "Edad Invalida " + nombrePersona : "Edad Valida para " + nombrePersona);
			} while (edadValida);
			
			if (edad < edadMinima) {
				edadMinima = edad;
				nombreMasJoven = nombrePersona;
			}
			
			System.out.println("Ingrese el nombre de la persona: (* para fin de carga)");
			nombrePersona = input.nextLine();
		}
		
		System.out.println(edadMinima!=Integer.MAX_VALUE ? "La persona mas joven tiene " + edadMinima + " y se llama " + nombreMasJoven : "No se ingresaron datos");
		//if (edadMinima!=Integer.MAX_VALUE) {
		//	System.err.println("La persona mas joven tiene " + edadMinima + " y se llama " + nombreMasJoven);
		//}else {
		//	System.out.println("No se ingresaron datos");
		//}
		input.close();
		System.out.println("FIN");
	}

}
