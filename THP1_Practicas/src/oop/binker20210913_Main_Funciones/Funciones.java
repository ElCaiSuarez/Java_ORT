package oop.binker20210913_Main_Funciones;

import java.util.Scanner;

public class Funciones {
	//Variables estaticas para usar fuera del MAIN en la funcion pedirString
	static final String ERROR = "ERROR";
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Se ingresa nombre, apellido y mail de una persona. (no pueden ser vacios)
		// Se ingresa un telefono, validar e informar si es valido (por lo menos 8 caracteres)
		// Mostrar los datos
		// final String ERROR = "ERROR";
		// Scanner input = new Scanner(System.in);
		String nombre, apellido, mail, telefono;
		
		nombre = pedirString("nombre");
		apellido = pedirString("apellido");
		mail = pedirString("mail");
		do {
			telefono = pedirString("telefono");
			System.out.println(esTelefono(telefono) ? "Telefono valido" : "NO es un telefono valido");
		} while (!esTelefono(telefono));
		
		input.close();
		mostrarDatos(nombre,apellido);
		mostrarDatos(nombre,apellido,mail, telefono);
		
		/*
		do {
			System.out.println("Ingrese su nombre: ");
			nombre = input.nextLine();
			if (nombre.isEmpty()) {
				System.out.println(ERROR);
			}
		} while (nombre.isEmpty());
		do {
			System.out.println("Ingrese su apellido: ");
			apellido = input.nextLine();
			if (apellido.isEmpty()) {
				System.out.println(ERROR);
			}
		} while (apellido.isEmpty());
		do {
			System.out.println("Ingrese su mail: ");
			mail = input.nextLine();
			if (mail.isEmpty()) {
				System.out.println(ERROR);
			}
		} while (mail.isEmpty());
		input.close();
		System.out.println("SUS DATOS:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Mail: " + mail);
		*/
	
	}
	/**
	 * Pide una cadena (NO VACIA) por teclado al usuario
	 * @param mensaje
	 * 		El dato a solicitar
	 * @return
	 * 		La cadena ingresada por el usuario
	 */
	static String pedirString(String mensaje){
		//Funcion pedirString 
		//Una funcion dentro del MAIN siembre lleva STATIC
		String texto;
		do {
			System.out.println("Ingrese su " + mensaje + ": ");
			texto = input.nextLine();
			if (texto.isEmpty()) {
				System.out.println(ERROR);
			}
		} while (texto.isEmpty());
		return texto;
	}
	/**
	 * Muestro los datos solicitados por pantalla
	 * @param nombre
	 * @param apellido
	 * @param mail
	 * @param telefono
	 */
	static void mostrarDatos(String nombre, String apellido, String mail, String telefono){
		System.out.println("SUS DATOS:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Mail: " + mail);
		System.out.println("Telefono: " + telefono);
	
	}
	/**
	 * Ejemplo de SOBRECARGA - Muestro solo 2 datos solicitados por pantalla 
	 * @param nombre
	 * @param apellido
	 */
	static void mostrarDatos(String nombre, String apellido){
		System.out.println("SUS DATOS:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);

	
	}
	/**
	 * Verifica si la cadena es un numero de telefono (Mayor a 8 caracteres)
	 * @param telefono
	 * @return
	 * 		true si es un telefono valido
	 */
	static boolean esTelefono(String telefono){
		return telefono.length() >= 8;
		/*
		if(telefono.length() >= 8){
			return true;
		}else {
			return false;
		}
		*/
	}
	/**
	 * Ejemplo de SOBRECARGA - Verifica si la cadena es un numero de telefono (Mayor a N digitos)
	 * @param telefono
	 * @param digitos
	 * @return
	 * 		true si es un telefono valido
	 */
	static boolean esTelefono(String telefono, int digitos){
		return telefono.length() >= digitos;
	}
}
