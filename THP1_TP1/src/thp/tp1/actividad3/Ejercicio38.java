package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio38 {
/*
 * 
 */
	public static void main(String[] args) {
		final String USUARIO = "admin";
		final String PASSWORD = "123456";
		final int TOPE_INTENTOS = 3;
		String usuario, password;
		int cantIntentos = 0;
		boolean esLoginValido;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese el usuario: ");
			usuario = input.nextLine();
			System.out.println("Ingrese el password: ");
			password = input.nextLine();
			cantIntentos ++;
			esLoginValido = (usuario.equals(USUARIO)) && password.equals(PASSWORD);
		} while (!esLoginValido && cantIntentos <= TOPE_INTENTOS);
		
		if (esLoginValido) {
			System.out.println("Acceso concedido");
						
		}else {
			System.out.println("Cuenta Bloqueada");
		}
		input.close();
		
	}
	
}