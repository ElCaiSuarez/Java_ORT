package oop.siciliano20211108_Practica2doParcial_Vuelo;

import java.util.ArrayList;

public class Asiento {
	private Pasajero pasajero;
	private TipoClase clase;
	private double precio;
	private String fila;
	private int numero;
	private final double PRECIO_TURISTA = 50000;
	private final double PRECIO_BUSINESS = 100000;
	private final double PRECIO_PRIMERA = 150000;

 	public Asiento(Pasajero pasajero, TipoClase clase, String fila, int numero) {
		// super();
		this.pasajero = pasajero;
		this.clase = clase;
		this.precio = precio;
		this.fila = fila;
		this.numero = numero;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public TipoClase getClase() {
		return clase;
	}

	public void setClase(TipoClase clase) {
		this.clase = clase;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		if (validarSiEstaEnRango(fila)) {
			this.fila = fila;
		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0 && numero < 7) {
			this.numero = numero;
		}

	}

	private boolean validarSiEstaEnRango(String filaBuscada) {
		ArrayList<String> filaStrings = new ArrayList<>();
		filaStrings.add("A");
		filaStrings.add("B");
		filaStrings.add("C");
		filaStrings.add("D");
		filaStrings.add("E");
		filaStrings.add("F");
		filaStrings.add("G");
		filaStrings.add("H");
		// hasta filas.add("T");
		boolean encontrado = false;
		int indice = 0;
		while (indice < filaStrings.size() && !encontrado) {
			filaStrings.get(indice).equals(filaBuscada);
		}
		return encontrado;
	}

	private void setPrecioSegunClase(TipoClase clase) {
		switch (clase) {
		case TURISTA: setPrecio(PRECIO_TURISTA);
		case BUSINESS: setPrecio(PRECIO_BUSINESS);
		case PRIMERA: setPrecio(PRECIO_PRIMERA);	
			break;

		default:
			break;
		}
	}
	
}
