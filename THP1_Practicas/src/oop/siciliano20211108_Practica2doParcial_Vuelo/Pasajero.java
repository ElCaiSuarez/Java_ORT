package oop.siciliano20211108_Practica2doParcial_Vuelo;

public class Pasajero {
	int dni;
	int telefono;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Pasajero(int dni, int telefono) {
		super();
		this.dni = dni;
		this.telefono = telefono;
	}
	
	
}
