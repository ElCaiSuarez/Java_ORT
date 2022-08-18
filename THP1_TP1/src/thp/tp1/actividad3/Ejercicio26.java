package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n, cantidad = 0, i;
		
		do {
			System.out.println("Ingrese un numero natural (entero >= 1): ");
			n = Integer.parseInt(input.nextLine());
		} while (n<1);
		i = 3;
		do {
			if (i % 5 != 0) {
				System.out.println();
				cantidad += 1;
				
			}
			i += 3;
			
		} while (cantidad < n);
		input.close();
		System.out.println("FIN");
	}

}
