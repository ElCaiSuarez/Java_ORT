package thp.tp1.actividad3;
/*
 * COPIO 
 */
import java.util.Scanner;

public class Ejercicio29_Validacion_DO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int NOTA_MINIMA = 0, NOTA_MAXIMA = 10;
		int nota;
		boolean notaIncorrecta;
		
		do {
			System.out.println("Ingrese la nota: ");
			
			nota = Integer.parseInt(input.nextLine());
			
			notaIncorrecta = (nota < NOTA_MINIMA || nota > NOTA_MAXIMA);
			
			System.out.println(notaIncorrecta ? "ERROR" : "Nota registrada correctamente");
			
		} while (notaIncorrecta);
		input.close();
		System.out.println("FIN");
	}

}
