package thp.tp2.actividad2.Ejercicio4;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadMax;
	private int velocidadActual;
	private int cuentaKilometros;
	private boolean estaEncendido;
	
	public Vehiculo(String marca, String modelo, String color, int velocidadMax) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMax = velocidadMax;
		this.estaEncendido = false;
		this.velocidadActual = 0;
		this.cuentaKilometros = 0;
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
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		if (velocidadActual>this.velocidadMax) {
			this.velocidadActual = this.velocidadMax;
		}else {
			this.velocidadActual = velocidadActual;
		}
		
	}
	public int getCuentaKilometros() {
		return cuentaKilometros;
	}
	public void setCuentaKilometros(int cuentaKilometros) {
		this.cuentaKilometros = cuentaKilometros;
	}
	public boolean isEstaEncendido() {
		return estaEncendido;
	}
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	public void encender(){
		if (!this.estaEncendido){
			this.estaEncendido = true;
			System.out.println("El vehiculo se encendio");
		}else {
			System.out.println("El vehiculo ya estaba encendido");
		}
	}
	public void avanzar(int velocidad, int metros){
		if (metros >= 0 && velocidad >= 0){
			this.setVelocidadActual(velocidad);
			this.cuentaKilometros += metros;
		}
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMax=" + velocidadMax
				+ "]";
	}
	
	
}
