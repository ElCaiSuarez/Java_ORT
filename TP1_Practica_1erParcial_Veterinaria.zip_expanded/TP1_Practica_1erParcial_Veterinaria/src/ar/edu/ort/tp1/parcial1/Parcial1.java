package ar.edu.ort.tp1.parcial1;

import ar.edu.ort.tp1.parcial1.clases.*;

public class Parcial1 {

	public static void main(String[] args) {
		Veterinaria clinicaVeterinaria = new Veterinaria("Cuidamos tu mascota", new Doctor("Veterinovich"));
		System.out.println("Admitiendo Mascotas----");
		clinicaVeterinaria.admitirMascota(new Perro("Guardian", 230, false, Estado.ENFERMO));
		clinicaVeterinaria.admitirMascota(new Gato("Isa", 230, false, Estado.FELIZ));
		clinicaVeterinaria.admitirMascota(new Conejo("Fox", 230, true, Estado.HAMBRIENTO));
		clinicaVeterinaria.admitirMascota(new Conejo("Eric", 230, false, Estado.FELIZ));
		clinicaVeterinaria.admitirMascota(new Perro("Beethoven", 230, false, Estado.ENFERMO));
		clinicaVeterinaria.admitirMascota(new Perro("Hachiko", 230, true, Estado.HAMBRIENTO));
		clinicaVeterinaria.admitirMascota(new Gato("Flipper", 230, false, Estado.ENFERMO));
		clinicaVeterinaria.admitirMascota(new Gato("Garras", 230, false, Estado.ENFERMO));
		System.out.println();
		System.out.println("Asistiendo Mascotas----");
		//Uso de Interfaz Animal
		Animal mascota = clinicaVeterinaria.buscarMascota("Hachiko");
		// Todos comen igual, pero aumentan el peso distinto
		// Metodo comer re-definido en las Subclases
		/*
		 * public void comer(double peso) { super.comer(peso, MULT_ALIMENTACION); }
		 */
		mascota.comer(10);
		// Todos defecan distinto y bajan el peso distinto
		// Metodo abstracto en la Superclase y definido en las Subclases
		// Metodo actualizarPeso(PORC_DESC_PESO) heredado de la Superclase
		/*
		 * public void defecar() {
		 * System.out.println("\nSoy un Gato y estoy defecando");
		 * this.actualizarPeso(PORC_DESC_PESO); }
		 */
		
		//Tuve que agregar public double getPeso(); a la interfaz Animal
		//
		System.out.println(mascota.getPeso());
		mascota.defecar();
		System.out.println(mascota.getPeso());

		mascota = clinicaVeterinaria.buscarMascota("Guardian");
		mascota.comer(5);
		mascota.defecar();

		mascota = clinicaVeterinaria.buscarMascota("Eric");
		mascota.comer(55);
		mascota.defecar();

		System.out.println();
		System.out.println("Vacunando Mascotas----");
		clinicaVeterinaria.vacunar();
		System.out.println();
		System.out.println("----");
		// La clase Veterinaria Implementa Mostrable y debe definir el metodo mostrar
		clinicaVeterinaria.mostrar();

	}
}
