package thp.tp2.actividad3.Ejercicio14_Static;

public class Contador {
	private static int contador = 0;
	

	public static void incrementar(){
		contador ++;
	}
	public static int obtenerValor(){
		return contador;
	}
}
