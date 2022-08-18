package tp4_Excepciones;

import java.util.Scanner;

public class Test_Excepciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inicio...");
		try {
			System.out.println("Ingrese un numero: ");
			int numero = Integer.parseInt(scanner.nextLine());
			System.out.println("El numero es: " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Ingreso un numero incorrecto " + e.getMessage());
		} finally {
			System.out.println("Fin...");
			scanner.close();
		}
		
	}

}
