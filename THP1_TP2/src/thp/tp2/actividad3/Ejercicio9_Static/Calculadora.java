package thp.tp2.actividad3.Ejercicio9_Static;

public class Calculadora {
	
	public static int sumar(int num1, int num2){
		return num1 + num2;
	}
	public static int restar(int num1, int num2){
		return num1 - num2;
	}
	public static int multiplicar(int num1, int num2){
		return num1 * num2;
}
	public static int dividir(int num1, int num2){
	int aux = 0;
		if (num2 != 0) {
		aux = num1 / num2;
	}
		return aux;
}
}
