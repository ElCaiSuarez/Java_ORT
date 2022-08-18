package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		final int EDAD_MINIMA = 7;
		final double ALTURA_LIMITE = 1.5;
		String nombre;
		int edad;
		double altura;
		boolean puedeEntrar;
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Nombre?: ");
		nombre = input.nextLine();
		System.out.println("¿Edad?: ");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("¿Altura? (,): ");
		
		//Ingresar el valor con , (Con . devuelve error)
		altura = input.nextDouble();
		puedeEntrar = (edad >= EDAD_MINIMA && altura > ALTURA_LIMITE);
		if (puedeEntrar) {
			System.out.println(nombre + " puede entrar");
			
		}else{
			System.out.println(nombre + " no puede entrar");
		}
		input.close();
		System.out.println("FIN");
	}

}
