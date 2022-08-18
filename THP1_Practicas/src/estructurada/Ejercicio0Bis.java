package estructurada;

import java.util.Scanner;

public class Ejercicio0Bis {
	
	public static void main(String[] args) {
		
			int numero1, numero2; 
			Scanner input = new Scanner(System.in);
			
			System.out.println("Ingrese el primer numero:");
			numero1 = input.nextInt();
			System.out.println("Ingrese el segundo numero:");
			numero2 = input.nextInt();
			
			input.close();
			
			System.out.println("El producto es: " + numero1 * numero2);
		
	}
}
