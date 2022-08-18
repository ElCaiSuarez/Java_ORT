package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		int num1, num2;
		double resultado = 0;
		final char SUMA = '+', RESTA = '-', PRODUCTO = '*', COCIENTE = '/';
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese la operacion a realizar (" + SUMA + ", " + RESTA + ", " + PRODUCTO + ", " + COCIENTE + ")");
		char operador = input.next().charAt(0);

		System.out.println("Ingrese el 1er numero entero: ");
		num1 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese el 2do numero entero: ");
		num2 = input.nextInt();
		input.nextLine();

		input.close();
/*
		if (operador == '/' && num2 != 0) {
			resultado = num1 / num2;
		}
		if (operador == '+') {
			resultado = num1 + num2;
		}
		if (operador == '-') {
			resultado = num1 - num2;
		}
		if (operador == '*') {
			resultado = num1 * num2;
		}
*/
		boolean huboError = false;
		switch (operador) {
		case SUMA: 
			resultado = num1 + num2;			
			break;
		case RESTA: 
			resultado = num1 - num2;			
			break;
		case PRODUCTO: 
			resultado = num1 * num2;			
			break;
		case COCIENTE: 
			if (num2 != 0){
				//CASTEO DE 2 NUMEROS ENTEROS A UNA VARIABLE DOUBLE
				resultado = (double) num1 / (double) num2;		
			}else if (num2 == 0) {
				huboError = true;
			}
			break;
		default:
			huboError = true;
			break;
		}
		if (huboError) {
			System.out.println("ERROR");
		}else {
			System.out.println("El resultado es: " + resultado);			
		}

		System.out.println("FIN");

	}

}