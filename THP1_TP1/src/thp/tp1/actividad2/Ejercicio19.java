package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;
		System.out.println("Ingresa un nro entero: ");
		numero = Integer.parseInt(input.nextLine());
		esDeUnSoloDigito = numero < 10;
		esImpar = numero % 2 == 1;
		estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		noEstaEnNingunGrupo = !(esDeUnSoloDigito || esImpar);
		System.out.println("numero ingresado: " + numero);
		System.out.println("Es de un solo digito: " + esDeUnSoloDigito);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Es impar de un solo digito: " + estaEnAmbosGrupos);
		System.out.println("No es impar ni es de un digito: " + noEstaEnNingunGrupo);
		input.close();
		System.out.println("FIN");
		
	}

}
