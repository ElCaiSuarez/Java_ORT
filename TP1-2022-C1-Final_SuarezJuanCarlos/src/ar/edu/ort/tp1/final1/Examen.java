package ar.edu.ort.tp1.final1;

import ar.edu.ort.tp1.final1.clases.Auto;
import ar.edu.ort.tp1.final1.clases.AutoElectrico;
import ar.edu.ort.tp1.final1.clases.Estacionamiento;
import ar.edu.ort.tp1.final1.clases.Moto;
import ar.edu.ort.tp1.final1.clases.TipoMoto;
import ar.edu.ort.tp1.final1.clases.Vehiculo;


public class Examen {

	public static void main(String[] args) {
		try {
		Estacionamiento estacionamiento1 = new Estacionamiento("Biggest Parking", 1, 10);
		testear(estacionamiento1);
		}catch (IllegalArgumentException e) {
			System.out.println("Error al crear el estacionamiento: " + e.getMessage());
		}
		try {
		Estacionamiento estacionamiento2 = new Estacionamiento("Smallest Parking", 44, 1);
		testear(estacionamiento2);
		}catch (IllegalArgumentException e) {
			System.out.println("Error al crear el estacionamiento: " + e.getMessage());
		}
		try {
		Estacionamiento estacionamiento3 = new Estacionamiento("ORT Parking", 4, 5);
		testear(estacionamiento3);
		}catch (IllegalArgumentException e) {
			System.out.println("Error al crear el estacionamiento: " + e.getMessage());
		}
		
		
	}

	private static void testear(Estacionamiento estacionamiento) {

		System.out.println("Lugar disponible: " + estacionamiento.lugarDisponible());
		agregarMotos(estacionamiento);
		System.out.println("Lugar disponible: " + estacionamiento.lugarDisponible());
		agregarAutos(estacionamiento);
		System.out.println("Lugar disponible: " + estacionamiento.lugarDisponible());
		System.out.println("-------------");
		estacionamiento.mostrar();
		System.out.println("-------------");
		retirar(estacionamiento, "Moto85");
		retirar(estacionamiento, "Un Barco");
		retirar(estacionamiento, "Auto6");
		retirar(estacionamiento, "AutoElectrico2");
		retirar(estacionamiento, "AutoElectrico7");
		System.out.println("Lugar disponible: " + estacionamiento.lugarDisponible());

	}

	private static void agregarMotos(Estacionamiento estacionamiento) {
		int i = 90;
		System.out.println("Estacionando Motos");
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.SCOOTER);
		i--;
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.MOTOCROSS);
		i--;
		i--;
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.CRUISER);
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.CICLOMOTOR);
		i--;
		i--;
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.SCOOTER);
		agregarMoto(estacionamiento, "", "MotoMarca " + i, "MotoModelo " + i++, TipoMoto.SCOOTER);
		i--;
		agregarMoto(estacionamiento, "Moto" + i, "MotoMarca " + i, "MotoModelo " + i--, TipoMoto.SCOOTER);

		System.out.println("-------------------");
	}

	private static void agregarAutos(Estacionamiento estacionamiento) {
		System.out.println("Estacionando Autos");
		int i = 1;
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 3, 1.8);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 4, 1.4);
		agregarAutoElectrico(estacionamiento, "AutoElectrico" + i, "Marca " + i, "Modelo " + i++, 4);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 3, 1.3);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 3, 1.8);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 5, 1.8);
		agregarAutoElectrico(estacionamiento, "AutoElectrico" + i, "Marca " + i, "Modelo " + i++, 4);
		agregarAuto(estacionamiento, "", "Marca " + i, "Modelo " + i++, 3, 1.8);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 3, 1.5);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 5, 1);
		agregarAutoElectrico(estacionamiento, "AutoElectrico" + i, "Marca " + i, "Modelo " + i++, 3);
		agregarAuto(estacionamiento, null, "Marca " + i, "Modelo " + i++, 3, 1.8);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 3, 1.8);
		agregarAuto(estacionamiento, "Auto" + i, "Marca " + i, "Modelo " + i++, 5, 1.8);
		System.out.println("-------------------");
	}

	private static void agregarAuto(Estacionamiento estacionamiento, String patente, String marca, String modelo,
			int puertas, double cilindrada) {
		try {
			Auto v = new Auto(patente, marca, modelo, cilindrada, puertas);
			//String patente, String marca, String modelo, double cilindrada, int cantidadPuertas
			estacionamiento.agregar(v);
			System.out.println("Auto guardado: "  + patente);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al guardar auto:" + e.getMessage());
		}
		
	}

	private static void agregarAutoElectrico(Estacionamiento estacionamiento, String patente, String marca,
			String modelo, int puertas) {
		try {
			AutoElectrico v = new AutoElectrico(patente, marca, modelo, puertas);
			//(String patente, String marca, String modelo)
			estacionamiento.agregar(v);
			System.out.println("Auto guardado: "  + patente);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al guardar auto electrico:" + e.getMessage());
		}
	}

	private static void agregarMoto(Estacionamiento estacionamiento, String patente, String marca, String modelo,
			TipoMoto tipo) {
		try {
			Moto v = new Moto(patente, marca, modelo, tipo);
			//(String patente, String marca, String modelo, TipoMoto tipoMoto
			estacionamiento.agregar(v);
			System.out.println("Auto guardado: "  + patente);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al guardar la moto:" + e.getMessage());
		}
	}

	private static void retirar(Estacionamiento estacionamiento, String id) {
		Vehiculo v = estacionamiento.retirar(id);
		System.out.println("El vehículo patente " + id + (v == null ? " no" : "") + " estaba estacionado");
	}

}