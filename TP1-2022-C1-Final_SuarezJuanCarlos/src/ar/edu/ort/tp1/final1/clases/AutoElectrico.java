package ar.edu.ort.tp1.final1.clases;

public class AutoElectrico extends Vehiculo{
	
	private double cilindrada;
	private static final double CILINDRADA_ELECTRICO = 0;
	private int cantidadPuertas;
	
	public AutoElectrico(String patente, String marca, String modelo, int cantidadPuertas) {
		super(patente, marca, modelo);
		setCilindrada(cilindrada);
		setCantidadPuertas(cantidadPuertas);
		
	}

	private void setCilindrada(double cilindrada) {
		
		this.cilindrada = CILINDRADA_ELECTRICO;
	}

	private void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	



	@Override
	public double calcularIndice() {
		// TODO Auto-generated method stub
		return (this.cilindrada + this.cantidadPuertas) - 1;
	}
	
	

}
