package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double valorHora, cantHoras, salario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la hora");
		valorHora = teclado.nextDouble();
		System.out.println("Ingrese la cantidad de horas por dia:");
		cantHoras = teclado.nextDouble();

		salario = ((cantHoras * valorHora) * 5) + ((cantHoras /2) * valorHora);
		
		System.out.println("Valor del salario semanal es: " + salario);
		
		teclado.close();
		System.out.println("FIN");
		
		

	}

}
