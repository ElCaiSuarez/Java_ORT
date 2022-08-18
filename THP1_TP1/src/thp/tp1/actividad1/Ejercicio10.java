package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		double capital1, capital2, capital3, capitalTotal;
		String nombre1, nombre2, nombre3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique el nombre del 1er socio:");
		nombre1 = teclado.nextLine();
		System.out.println("Indique el capital aportado por: " + nombre1);
		capital1 = teclado.nextDouble();
		//capital1 = double.parseDouble(teclado.nextLine());
		teclado.nextLine();

		System.out.println("Indique el nombre del 2do socio:");
		nombre2 = teclado.nextLine();
		System.out.println("Indique el capital aportado por: " + nombre2);
		capital2 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Indique el nombre del 3er socio:");
		nombre3 = teclado.nextLine();
		System.out.println("Indique el capital aportado por: " + nombre3);
		capital3 = teclado.nextDouble();
		teclado.nextLine();
		
		capitalTotal = capital1 + capital2 + capital3;
		System.out.println("El valor total aportado es: " + capitalTotal);
		System.out.println(nombre1 + " Aporto " + (capital1 *100 / capitalTotal) + "%");
		System.out.println(nombre2 + " Aporto " + (capital2 *100 / capitalTotal) + "%");
		System.out.println(nombre3 + " Aporto " + (capital3 *100 / capitalTotal) + "%");
		
		teclado.close();
		System.out.println("FIN");

	}

}
