package oop.siciliano20211108_Practica2doParcial_Vuelo;

import java.util.ArrayList;

public class Vuelo {
	private String numeroVuelo;
	private int cantidadAsientos;
	private ArrayList<Asiento> asientosReservados;
	private double montoTotal;

	public Vuelo(String numeroVuelo, int cantidadAsientos) {
		this.numeroVuelo = numeroVuelo;
		this.cantidadAsientos = cantidadAsientos;
		setAsientosReservados(asientosReservados);// this.asientosReservados = asientosReservados;
		this.montoTotal = montoTotal;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public ArrayList<Asiento> getAsientosReservados() {
		return asientosReservados;
	}

	public void setAsientosReservados(ArrayList<Asiento> asientosReservados) {
		this.asientosReservados = new ArrayList<Asiento>();
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		if (montoTotal >= 0) {
			this.montoTotal = montoTotal;
		}
	}

	private Asiento buscarAsientoReservado(String fila, int numero) {
		Asiento asientoReservado = null;
		// FALTA DESARROLLAR
		return asientoReservado;
	}

	private boolean verDistanciamiento(String fila, int numero) {
		boolean seRespetaLaDistancia = false;
		if (numero == 1) {
			if (buscarAsientoReservado(fila, numero) != null) {
				// FALTA DESARROLLAR
			}
		}
		return seRespetaLaDistancia;
	}

	public ResultadoReservaBoletos reservaBoletos(int dni, int telefono, TipoClase clase, String fila, int numero) {
		ResultadoReservaBoletos resultado = ResultadoReservaBoletos.RESERVA_CONFIRMADA;
		// "Error avion completo
		// Se interpreta que la cantidad habilitada es el total dividido 2
		int cantidadReservas = asientosReservados.size();
		int cantidadHabilitada = this.cantidadAsientos / 2;
		if (cantidadReservas == cantidadHabilitada) {
			resultado = ResultadoReservaBoletos.ERROR_AVION_COMPLETO;
		}
		// "Error ya tiene un pasaje
		if (buscarAsientoReservado(fila, numero) != null) {
			resultado = ResultadoReservaBoletos.ERROR_ASIENTO_CON_PASAJE;
		}

		// Error el asiento de al lado esta ocupado
		else if (!verDistanciamiento(fila, numero)) {
			resultado = ResultadoReservaBoletos.ERROR_NO_HAY_DISTANCIAMIENTO;
		} else {
			Asiento asiento = new Asiento(new Pasajero(dni, telefono), clase, fila, numero);
			this.asientosReservados.add(asiento);
			double montoNuevo = this.getMontoTotal() + asiento.getPrecio();
			this.setMontoTotal(montoNuevo);
		}

		return resultado;
	}

	private double obtenerAcumuladorPorClase(TipoClase clase) {
		double acumulador = 0;
		for (Asiento asiento : asientosReservados) {
			if (asiento.getClase() == clase) {
				acumulador += asiento.getPrecio();
			}
		}
		return acumulador;
	}

	public void mostrarMontoRecaudadoDeClase(TipoClase clase) {
		double acumulador = obtenerAcumuladorPorClase(clase);
		if (asientosReservados.size() == 0) {
			System.out.println("No hay asientos reservados");
		} else if (acumulador > 0) {
			System.out.println("El monto acumulado hasta el momento en la clase" + clase + " es: " + acumulador);

		} else {
			System.out.println("No hay asientos reservados para la clase: " + clase);

		}
	}
}
