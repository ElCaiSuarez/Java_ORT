package c.thp.tp3.actividad1.Ejercicio3_Inmobiliaria;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Inmobiliaria inmobiliaria1 = new Inmobiliaria("La Inmoboliaria 1");
		inmobiliaria1.mostrarPropiedades();// NO HAY BARRIOS
		inmobiliaria1.agregarBarrio("Barrio 1");
		inmobiliaria1.agregarBarrio("Barrio 2");
		inmobiliaria1.mostrarPropiedades();// BARRIOS NO TIENEN PROPIEDADES
		System.out.println();
		inmobiliaria1.agregarPropiedad("Barrio 1", "Domicilio 1", 50000, Tipo_Propiedad.CASA);
		inmobiliaria1.agregarPropiedad("Barrio 1", "Domicilio 2", 150000, Tipo_Propiedad.PH);
		inmobiliaria1.agregarPropiedad("Barrio 2", "Domicilio 3", 250000, Tipo_Propiedad.DEPARTAMENTO);
		inmobiliaria1.agregarPropiedad("Barrio 2", "Domicilio 4", 350000, Tipo_Propiedad.CASA);
		inmobiliaria1.mostrarPropiedades();
		// inmobiliaria1.buscarBarrio("Barrio 1").agregarPropiedad("Domicilio 1", 50000,
		// Tipo_Propiedad.CASA);
		// inmobiliaria1.buscarBarrio("Barrio 1").agregarPropiedad("Domicilio 2",
		// 150000, Tipo_Propiedad.PH);
		// inmobiliaria1.buscarBarrio("Barrio 2").agregarPropiedad("Domicilio 3",
		// 250000, Tipo_Propiedad.DEPARTAMENTO);
		// inmobiliaria1.buscarBarrio("Barrio 2").agregarPropiedad("Domicilio 4",
		// 350000, Tipo_Propiedad.CASA);
		// inmobiliaria1.mostrarPropiedades();
		System.out.println("Mostrar Propiedades TIPO CASA");
		inmobiliaria1.mostrarPropiedades(Tipo_Propiedad.CASA);// Devuelve las propiedades del
																// Tipo CASA del Barrio
		System.out.println();
		ArrayList<Barrio> barriosMaxProp = new ArrayList<>();
		barriosMaxProp = inmobiliaria1.obtenerBarrioMaxProp();// Devuelve Barrio 1 y 2
		System.out.println("El/Los barrio/s con mas propiedades es/son: " + barriosMaxProp);
		System.out.println();
		System.out.println(inmobiliaria1.borrarPropiedad("Domicilio 3"));// Borra propiedad con Domiclio 3 desde la clase Inmobiliaria
		inmobiliaria1.mostrarPropiedades();
		barriosMaxProp = inmobiliaria1.obtenerBarrioMaxProp();// Ahora devuelve Barrio 1
		System.out.println("El/Los barrio/s con mas propiedades es/son: " + barriosMaxProp);
		inmobiliaria1.cambiarPropiedadDeBarrio("Domicilio 2", "Barrio 2");// Cambio de barrio a la propiedad con Domicilio 2
		inmobiliaria1.mostrarPropiedades();
	}

}
