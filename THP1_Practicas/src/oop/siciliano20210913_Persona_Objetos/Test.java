package oop.siciliano20210913_Persona_Objetos;

public class Test {

	public static void main(String[] args) {
		
		//Objetos
		Persona persona1 = new Persona("Juan", "Suarez", 39, 29543755);
		System.out.println("Persona 1");
		//Usamos el metodo VOID
		persona1.imprimirNombreCompleto('S');
		//Usamos el metodo con return
		System.out.println(persona1.imprimirNombreCompleto2('S'));
		//Usamos el metodo SET
		persona1.setEdad(39);
		//Usamos los metodos GET
		System.out.println("Ahora la edad de " + persona1.getNombre() +" es " + persona1.getEdad());
		
		
		//Imprime la posicion de memoria del objeto
		//Pero si agregamos el metodo To String en la clase Persona:
		/*@Override
		public String toString() {
			return "Practica_20210913_OO_Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni="
					+ dni + "]";*/
		Persona persona3 = new Persona("Alberto", "Suarez", 46, 19543755);
		System.out.println("Imprimo con metodo ToString " + persona3);
		
		//Metodo que compara los datos de 2 objetos con los mismos datos
		//LoadStoreParameter objetos como tales SignatureMethodParameterSpec son direntes
		Persona persona2 = new Persona("Juan", "Suarez", 39, 29543755);
		
		/*
		if (persona1.equals(persona2)) {
			System.out.println("Los DNI Son Iguales");
			
		}else {
			System.out.println("Los DNI son Diferentes");
		}
		*/
		if (persona1.equals(persona2)) {
			System.out.println("Las personas Son Iguales");
			
		}else {
			System.out.println("Las personas son Diferentes");
		}
		
		/*
		System.out.println("Persona 2");
		persona2.imprimirNombreCompleto('N');

		Practica_20210913_OO_Persona persona3 = new Practica_20210913_OO_Persona("Juan", "Rodriguez", 29, 39543755);
		System.out.println("Persona 3");
		persona3.imprimirNombreCompleto('S');
		*/
		
		
	}


	}


