package thp.tp2.actividad3.Ejercicio13_RelacionesEntreObjetos;

public class Procesador {
	private String marca;
	private String modelo;
	private double temperatura;
	
	public Procesador(String marca, String modelo, double temperatura) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.temperatura = temperatura;
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
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", temperatura=" + temperatura + "]";
	}
	
	
}
