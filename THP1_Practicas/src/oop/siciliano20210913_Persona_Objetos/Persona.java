package oop.siciliano20210913_Persona_Objetos;

public class Persona {
	// Atributos
	private String nombre, apellido;
	private int edad, dni;
	

	// Constructor armado a mano
	/*
	public Practica_20210913_OO_Persona(String nombre2, String apellido2, int edad2, int dni2) {
		nombre = nombre2;
		apellido = apellido2;
		edad = edad2;
		dni = dni2;
	}*/

	//METODOS CONSTRUCTOR ARMADO CON ECLIPSE SOURCE/Generate Constrictor using fields
	public Persona(String nombre, String apellido, int edad, int dni) {
		//super(); TODAVIA NO LO VAMOS A USAR
		setNombre(nombre);
		this.apellido = apellido;
		setEdad(edad);
		this.dni = dni;
	}
	
	
	// Metodo
	// TIENEN 4 PARTES: Visibilidad, tipo de retorno, nombre, parametros que recibe
	// Metodo Void significa que el Metodo no tiene retorno
	public void imprimirNombreCompleto(char imprimirEdad) { //Firma del metodo
			if (imprimirEdad == 'S') {
				System.out.println(nombre + " tiene " + edad + " años");
			}else {
				System.out.println(nombre);
			}
		}
	//Metodo que devuelve un String
	//Visibilidad, tipo de retorno, nombre y parametro que recibe
	public String imprimirNombreCompleto2(char imprimirEdad) { //Firma del metodo
		String resultado = "";
		if (imprimirEdad == 'S') {
				resultado = nombre + " tiene " + edad + " años";
			}else {
				resultado = nombre;
			}
		return resultado;
		}

	//METODOS ARMADOS CON ECLIPSE SOURCE/Generate Getters and Setters
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		if (edad >= 18) {
			this.edad = edad;
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		if (nombre != null){
			this.nombre = nombre;
		}
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		if (apellido != null){
			this.apellido = apellido;
		}
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		if (dni >= 0) {
		this.dni = dni;
		}
	}


	//METODOS ARMADOS A MANO
	/*@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni="
				+ dni + "]";
	}
	*/
	/*
	//Metodo equals que compara los datos de 2 objetos con los mismos datos
	//LoadStoreParameter objetos como tales SignatureMethodParameterSpec son diferentes
	public boolean equals(Persona personaN){
		return this.dni == personaN.getDni();
	}
	*/
	
	//METODOS ARMADOS CON ECLIPSE SOURCE/Generates toString y Generates hashCode and equals
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni
				+ ", getEdad()=" + getEdad() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getDni()=" + getDni() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}
	
}

