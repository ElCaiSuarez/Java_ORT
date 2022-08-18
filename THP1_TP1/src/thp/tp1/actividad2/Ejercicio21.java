package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DOMINGO = 1, LUNES = 2, MARTES = 3, MIERCOLES = 4, JUEVES = 5, VIERNES = 6, SABADO = 7;
		int numeroDeDia;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un nro de dia de la semana (dia 1 es domingo): ");
		numeroDeDia = Integer.parseInt(input.nextLine());
		switch (numeroDeDia) {
		case DOMINGO:System.out.println("DOMINGO");break;
		case LUNES:System.out.println("LUNES");break;
		case MARTES:System.out.println("MARTES");break;
		case MIERCOLES:System.out.println("MIERCOLES");break;
		case JUEVES:System.out.println("JUEVES");break;
		case VIERNES:System.out.println("VIERNES");break;
		case SABADO:System.out.println("SABADO");break;
		default:System.out.println("ERROR");break;
		}
		input.close();
		System.out.println("FIN");
	}

}
