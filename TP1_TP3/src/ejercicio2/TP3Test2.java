package ejercicio2;

public class TP3Test2 {

	public static void main(String[] args) {
		Asalariado empleado1 = new Asalariado("Jose", 30, 10000);
		SubContratado empleado2 = new SubContratado("Carlos", 30, 50, 100);
		// Empleado empleado1 = new Asalariado("Jose", 30, 10000);
		// Empleado empleado2 = new SubContratado("Carlos", 30, 50, 100);
		// System.out.println(empleado1.calcularPago());
		// System.out.println(empleado2.calcularPago());
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());

	}
}
