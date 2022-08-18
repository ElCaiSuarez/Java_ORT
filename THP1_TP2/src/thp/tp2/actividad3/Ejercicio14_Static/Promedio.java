package thp.tp2.actividad3.Ejercicio14_Static;

public class Promedio {
	private static int promedio = 0;
		
	public static void incrementar(int numero){
		Contador.incrementar();
		Acumulador.incrementar(numero);
	}
	public static int obtenerValor(){
		if (Contador.obtenerValor() > 0){
		promedio = Acumulador.obtenerValor()/Contador.obtenerValor();
		
		}else {
			promedio = 0;
		}
		return promedio;
	}
	
}
