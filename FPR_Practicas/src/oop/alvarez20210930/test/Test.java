package oop.alvarez20210930.test;

import java.util.Scanner;

import oop.alvarez20210930.persona.Persona;


public class Test extends Object {
	final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Persona persona = new Persona();
		
		
		Computadora miCompu = new Computadora();
		miCompu.setMarca("Dell");
		miCompu.setTipo(TipoComputadora.LAPTOP);
		
//		Fecha fechaNacimiento = new Fecha(25,12,1970);
//		
//		Persona persona1 = new Persona();
//		persona1.setNombre("Juan");
//		persona1.setApellido("Perez");
//		persona1.setFechaNacimiento(fechaNacimiento);
//		
//		//System.out.println(persona1);
//		//System.out.println(persona1.toString());
//		
//		//persona1.mostrar();
//		
//		Fecha fechaNac2 = new Fecha(30,9,1991);
//		//System.out.println(fechaNac2.toString());
//		//System.out.println(fechaNac2);
//		
//		Persona persona2 = new Persona("Pedro","Gomez");
//		persona2.setFechaNacimiento(new Fecha(1,1,2000));
//		//persona2.mostrar();
//		
//		System.out.println("Persona 1: " + persona1);
//		System.out.println("Persona 2: " + persona2);
//		
//		Persona persona3 = new Persona("Raul", "Alfonsin", new Fecha(20,3,1920));
//		//persona3.mostrar();
//		
//		
//		//persona1 = persona2;
//		persona1 = persona2.clonar();
//
//		System.out.println("Persona 1 bis: " + persona1);
//		System.out.println("Persona 2 bis: " + persona2);
//
//		persona2.setNombre("Leo");
//		System.out.println(persona1.getNombre());
//		
//		//Persona p =  new Persona()
//		
//		int num = 5;
//		int num2 = 4;
//		
//		num = num2;
//		num2 = 10;
//		
//		
//		
//		
//		//System.out.println(num);
//		
////		
////		
////		int num;
////		num = 4;
////		
////		//input.
////		
////		Fecha fechaHoy;
////		fechaHoy = new Fecha();
////		
////		fechaHoy.mostrarComoCadena("/");
////		
////		//fechaHoy.dia = 55;
////		//fechaHoy.mes = 9;
////		//fechaHoy.anio = 2021;
////		/*
////		fechaHoy.setDia(23);
////		fechaHoy.setMes(9);
////		fechaHoy.setAnio(2021);
////		
////		fechaHoy.setDia(55);
////		*/
////		
////		fechaHoy.setFecha(23, 9, 2021);
////		
////		System.out.println("Mostrar como cadena con - :");
////		fechaHoy.mostrarComoCadena("-");
////
////		System.out.println("Mostrar como cadena SIN parametros :");
////		fechaHoy.mostrarComoCadena();
////		String fechaEnFormatoString;
////		fechaEnFormatoString = fechaHoy.obtenerComoCadena("-");
////		System.out.println(fechaEnFormatoString);
////		
////		//Fecha fechaPrimavera = new Fecha();
////		
////		Fecha fechaPrimavera = new Fecha(21,9,2021);
////		//fechaPrimavera.dia = 21;
////		//fechaPrimavera.mes = 9;
////		//fechaPrimavera.anio = 2021;
////		/*
////		fechaPrimavera.setDia(21);
////		fechaPrimavera.setMes(9);
////		fechaPrimavera.setAnio(2021);
////		*/
////		
////		fechaPrimavera.mostrarComoCadena("/");
////		System.out.println(fechaPrimavera.obtenerComoCadena("-"));
////		
////		Fecha fechaRevolucion = new Fecha(125,5,1810);
////		fechaRevolucion.mostrarComoCadena("-");
////		
////		Fecha fecha = new Fecha(2010);
////		fecha.mostrarComoCadena("/");
////		
////		
////		//System.out.println();
//
//
	}

}
