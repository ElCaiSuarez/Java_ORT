package thp.tp2.actividad2.Ejercicio3;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadMax;
	
	public Vehiculo(String marca, String modelo, String color, int velocidadMax) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMax = velocidadMax;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMax=" + velocidadMax
				+ "]";
	}
	
	
}
