package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio24 {
	
	final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int desde, hasta, aux;
			
		System.out.println("Ingrese el desde: ");
		desde = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el hasta: ");
		hasta = Integer.parseInt(input.nextLine());
		
		//Normaliza que el desde sea menor al hasta
		if(desde > hasta){
			aux = desde;
			desde = hasta;
			hasta = aux;
		}
		
		
		
	}

}
