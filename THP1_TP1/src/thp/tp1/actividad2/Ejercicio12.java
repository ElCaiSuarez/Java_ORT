package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		double num1, num2, maximo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero:");
		num1 = teclado.nextDouble();
		System.out.println("Ingrese el segundo numero:");
		num2 = teclado.nextDouble();
		
		if(num1 == num2){
			System.out.println("Son Iguales");
		}else if(num1 > num2) {
			maximo = num1;
			System.out.println("El maximo es: " + maximo);
		}else {
			maximo = num2;
			System.out.println("El maximo es: " + maximo);
		} 
		teclado.close();
		System.out.println("FIN");
		
	}

}
