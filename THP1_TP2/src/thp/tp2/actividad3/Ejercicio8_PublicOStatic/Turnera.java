package thp.tp2.actividad3.Ejercicio8_PublicOStatic;

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
