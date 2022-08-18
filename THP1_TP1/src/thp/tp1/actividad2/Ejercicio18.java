package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		int nroA, nroB, mayor, menor;
		boolean esDivisible;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un nro: ");
		nroA = Integer.parseInt(input.nextLine());
		System.out.println("Ingresa otro numero: ");
		nroB = Integer.parseInt(input.nextLine());
		if (nroA > nroB) {
			mayor = nroA;
			menor = nroB;
			
		}else {
			mayor = nroB;
			menor = nroA;
		}
		esDivisible = mayor % menor == 0;
			if (esDivisible) {
				System.out.println(mayor + " es divisible por " + menor);
			}else {
				System.out.println(mayor + " no es divisible por " + menor);
			}
				
			input.close();
	}

}
