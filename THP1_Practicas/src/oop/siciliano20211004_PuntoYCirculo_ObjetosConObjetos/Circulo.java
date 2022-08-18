package oop.siciliano20211004_PuntoYCirculo_ObjetosConObjetos;

public class Circulo {

	private Punto punto; //el origen del circulo
	private int radio; // el radio del circulo
	
	public Circulo(Punto punto, int radio) {
		//super();
		this.punto = punto;
		this.radio = radio;
	}
	
	public void moverCirculo(int nuevoX, int nuevoY){
		this.punto.moverPunto(nuevoX, nuevoY);
	}
	
	public Punto getPunto() {
		return punto;
	}
	
	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [punto=" + punto + ", radio=" + radio + "]";
	}
	
	
	
}
