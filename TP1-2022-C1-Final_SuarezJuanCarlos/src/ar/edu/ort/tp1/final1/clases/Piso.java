package ar.edu.ort.tp1.final1.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Piso implements EspacioInteligente<Vehiculo, String> {

	private static final int MINIMA_CAPACIDAD_MAXIMA = 2;
	private Pila<Vehiculo> pilaVehiculos;
	private int disponible;
	private int capacidadMaxima;
	
	
	
		public Piso(int capacidadMaxima) {
		super();
		this.pilaVehiculos = new PilaNodos<>(capacidadMaxima);
		this.disponible = capacidadMaxima;
		this.capacidadMaxima = capacidadMaxima; //VALIDADO EN EL SETER DE ESTACIONAMIENTO (+2)
	}
		
		


	@Override
	public Vehiculo retirar(String id) {
		Vehiculo vehiculoAux = null;
		boolean encontrado = false;
		Pila<Vehiculo> pilaAux = new PilaNodos<>(capacidadMaxima);
		while (!this.pilaVehiculos.isEmpty() && !encontrado) {
			vehiculoAux = this.pilaVehiculos.pop();
			if (vehiculoAux.getPatente() == id) {
				encontrado = true;
			}else {
				pilaAux.push(vehiculoAux);
			}
		
		}
		this.disponible += 1;
		return vehiculoAux;
	}

	@Override
	public void agregar(Vehiculo elemento) {
		this.pilaVehiculos.push(elemento);
		this.disponible -= 1;
	}

	@Override
	public int lugarDisponible() {
		return this.disponible;
	}
	
	public boolean estalleno() {
		return pilaVehiculos.isFull();
	}

	


}
