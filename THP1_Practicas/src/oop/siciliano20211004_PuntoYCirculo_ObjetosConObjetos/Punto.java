package oop.siciliano20211004_PuntoYCirculo_ObjetosConObjetos;

public class Punto {
	//Atributos privados
	private int x; //largo en el plano 
	private int y; //alto en el plano
	
	//Constructor
	public Punto(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
	//Getters y Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void moverPunto(int nuevoX, int nuevoY){
		this.x += nuevoX;
		this.y += nuevoY;
	}
	
	//toString
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
