package thp.tp1.actividad1;
/*
 * Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
 */
/*
 * Agregamos un IF que no es del ejercicio
 * Agregamos un operador terneario (Se usa cuando en ambos caminos el resultado es el mismo)
 */
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int PERIODOS = 3;
		double nota1, nota2, nota3, promedio;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la nota del 1er cuatrimestre: ");
		nota1 = input.nextDouble();
		
		System.out.println("Ingrese la nota del 2do cuatrimestre: ");
		nota2 = input.nextDouble();
		
		System.out.println("Ingrese la nota del 3er cuatrimestre: ");
		nota3 = input.nextDouble();
		
		input.close();
		
		promedio = (nota1 + nota2 + nota3) / PERIODOS;
		System.out.println("El promedio es: " + promedio);
		
/*
* 		final int APROBACION = 4;		
* 		if(promedio >= APROBACION) {
*
*		//Camino verdadero
*		System.out.println("Felicitaciones aprobaste");
*		}else {
*		//Camino falso
*		System.out.println("No aprobaste");
*		}
*/		
		//Uso de operador ternario
		//System.out.println(promedio >= APROBACION ? "Felicitaciones aprobaste" : "No aprobaste");

	}

}