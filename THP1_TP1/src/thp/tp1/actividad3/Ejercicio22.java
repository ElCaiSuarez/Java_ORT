package thp.tp1.actividad3;

public class Ejercicio22 {

/*
 * 22. Realizá un programa que muestre todos los números enteros del 1 al 5 , y luego los mismos
números pero en orden inverso. [EC]
 */
	public static void main(String[] args) {
		final int VALOR1 = 1, VALOR2 = 5;
		int i;
		for (i = VALOR1; i <= VALOR2; i++) {
			System.out.println(i);
		}
		for (i = VALOR2; i >= VALOR1; i--) {
			System.out.println(i);

	}

}
}