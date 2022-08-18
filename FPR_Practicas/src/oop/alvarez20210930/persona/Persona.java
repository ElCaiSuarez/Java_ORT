package oop.alvarez20210930.persona;

import oop.alvarez20210930.fecha.Fecha;

public class Persona {
	private String nombre;
	private String apellido;
	private Fecha fechaNacimiento;
	
	
	public Persona() {
		
	}
	
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String nombre, String apellido, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	private Persona(Persona persona) {
		this.nombre = persona.getNombre();
		this.apellido = persona.getApellido();
		this.fechaNacimiento = persona.getFechaNacimiento();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Fecha Nac: " + this.fechaNacimiento.toString("/"));
		/*
		System.out.println("Fecha Nac: " + this.fechaNacimiento.getDia() + "/" +  
										   this.fechaNacimiento.getMes() + "/" +
										   this.fechaNacimiento.getAnio()) ;
		*/
		
	}

	
	/*
	@Override
	public String toString() {
		String datos;
		
		datos = "Nombre: " + this.nombre + "\n";
		datos += "Apellido: " + this.apellido + "\n";
		datos += "Fecha Nac: " + this.fechaNacimiento.toString();

		//return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
		return datos;
	}
	*/
	
	public Persona clonar() {
		/*
		Persona persona = new Persona();
		persona.setNombre(this.getNombre());
		persona.setApellido(this.getApellido());
		persona.setFechaNacimiento(this.getFechaNacimiento());
		*/
		/*
		Persona persona = new Persona(this);
		return persona;
		*/		
		return new Persona(this);
	}
	

}
