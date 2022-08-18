package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio29_Validacion_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				final int NOTA_MINIMA = 0, NOTA_MAXIMA = 10;
				int nota;
				
				System.out.println("Ingrese la nota: ");
				nota = Integer.parseInt(input.nextLine());
				
				while(nota < NOTA_MINIMA || nota > NOTA_MAXIMA){
					
					System.out.println("ERROR");
					
					System.out.println("Ingrese la nota: ");
					nota = Integer.parseInt(input.nextLine());
				}
				System.out.println("Nota registrada correctamente");
				input.close();
				System.out.println("FIN");
	}

}
