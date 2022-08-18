package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double ancho, largo, valorM2, valorTotal, metrosAlambre;
		Scanner teclado = new Scanner(System.in);
		
		System.err.println("Ingrese el ancho del campo:");
		ancho = teclado.nextDouble();
		System.out.println("Ingrese el largo del campo:");
		largo = teclado.nextDouble();
		System.out.println("Ingrese el valor del metro cuadrado del campo:");
		valorM2 = teclado.nextDouble();
		
		valorTotal = (ancho * largo) * valorM2;
		System.out.println("El valor total del campo es: " + valorTotal);
		metrosAlambre = ((ancho * 2) + (largo * 2)) * 3;
		System.out.println("La cantidad de metros de alambre es: " + metrosAlambre);
		
		teclado.close();
		System.out.println("FIN");
		
	}

}
