package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final char SUMA = '+', RESTA = '-', MULT = '*', DIV = '/', FIN = 'F';
		char operador;
		int num1, num2;
		
		do {
			System.out.println("Ingrese un caracter para la operacion (+, -, *, / o F para terminar): ");
			operador = input.nextLine().toUpperCase().charAt(0);
			
		} while (operador != SUMA && operador!=RESTA && operador!=MULT && operador!=DIV && operador!=FIN);
		while (operador != FIN) {
			System.out.println("Ingrese el 1er numero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("INgrese el 2do numero: ");
			num2 = Integer.parseInt(input.nextLine());
			switch (operador) {
			case SUMA:System.out.println(num1+num2);break;
			case RESTA:System.out.println(num1-num2);break;
			case MULT:System.out.println(num1*num2);break;
			case DIV:
				if (num2!=0) {
					System.out.println(num1/num2);
				}else {
					System.out.println("No se puede dividir por 0");
				}
				break;
			default:break;
			}
			do {
				System.out.println("Ingrese un caracter para la operacion (+, -, *, / o F para terminar): ");
				operador = input.nextLine().toUpperCase().charAt(0);
				
			} while (operador != SUMA && operador!=RESTA && operador!=MULT && operador!=DIV && operador!=FIN);
		}
		input.close();
		System.out.println("FIN");
	}

}
