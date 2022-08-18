package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int NOTA_MINIMA = 2, NOTA_MAXIMA = 10;
		int nota;
		
		do {
			System.out.println("Ingrese una nota: ");
			nota = Integer.parseInt(input.nextLine());
		} while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA || nota == 3);
		System.out.println("Nota correcta");
		input.close();
		System.out.println("FIN");
	}

}
