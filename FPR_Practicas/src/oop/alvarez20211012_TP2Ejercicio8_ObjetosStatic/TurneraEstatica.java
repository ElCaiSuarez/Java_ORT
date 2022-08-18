package oop.alvarez20211012_TP2Ejercicio8_ObjetosStatic;

public class TurneraEstatica {
	private final static int TOPE = 999;
	private static int contador;
	
	//AL USARLO STATIC USO CONSTRUCTOR PRIVADO PORQUE NO LO VOY A INSTANCIAR COMO OBJETO DESDE EL MAIN
	private TurneraEstatica() {
		// TODO Auto-generated constructor stub
		contador = 0;
	}
	
	public static int verUltimoNumeroOtorgado(){
		return contador;
	}
	
	public static int verProximoNumeroAOtorgar(){
		int contAux;
		contAux = contador+1;
		return contAux;
	}
	
	public static int otorgarProximoNumero(){
		if (contador > TOPE) {
			resetearContador();
		}else {
			contador ++;
		}
		return contador;
	}
	
	public static void resetearContador(){
		resetearContador(0);
	}
	
	public static void resetearContador(int valor){
		if (valor >=0) {
			contador = valor;
			
		}
		
	}
	
	
}