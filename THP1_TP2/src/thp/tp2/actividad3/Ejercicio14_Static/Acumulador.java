package thp.tp2.actividad3.Ejercicio14_Static;

public class Acumulador {
	private static int acumulador = 0;
	
	public static void incrementar(int cantidad){
		acumulador += cantidad;
	}
	public static int obtenerValor(){
		return acumulador;
	}
}
