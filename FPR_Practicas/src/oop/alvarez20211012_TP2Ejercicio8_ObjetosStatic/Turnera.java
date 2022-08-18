package oop.alvarez20211012_TP2Ejercicio8_ObjetosStatic;

public class Turnera {
	private int contador;
	
	public Turnera(){
		this.contador = 0;
	}
	
	public int verUltimoNumeroOtorgado(){
		return this.contador;
	}
	
	public int otorgarProximoNumero(){
		this.contador ++;
		return this.contador;
	}
	
	public void resetearContador(){
		resetearContador(0);
	}
	
	public void resetearContador(int valor){
		if (valor >=0) {
			this.contador = valor;
			
		}
		
	}
	
	
}
