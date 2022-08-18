package ar.edu.ort.tp1.final1.clases;

public class Auto extends Vehiculo {

	private double cilindrada;
	private int cantidadPuertas;
	private static final String MSG_CILINDRADA_INVALIDA = "La colindrada no puede ser menor a 0";
	
	public Auto(String patente, String marca, String modelo, double cilindrada, int cantidadPuertas) {
		super(patente, marca, modelo);
		setCilindrada(cilindrada);
		setCantidadPuertas(cantidadPuertas);
	}

	private void setCilindrada(double cilindrada) {
		if (cilindrada < 0) {
			throw new IllegalArgumentException(MSG_CILINDRADA_INVALIDA);
		}	
		this.cilindrada = cilindrada;
	}

	private void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	

	@Override
	public double calcularIndice() {
		// TODO Auto-generated method stub
		return this.cilindrada + this.cantidadPuertas;
	}
	
	
}
