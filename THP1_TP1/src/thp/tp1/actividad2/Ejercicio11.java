package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int num1, resto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		num1 = teclado.nextInt();
		
		resto = num1 % 2;
		if(resto == 0){
			System.out.println("El numero es Par");
		}else{
			System.out.println("El numero es Impar");
		}
		
		teclado.close();
		System.out.println("FIN");

	}

}
