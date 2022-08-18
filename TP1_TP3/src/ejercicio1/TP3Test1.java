package ejercicio1;

public class TP3Test1 {

	public static void main(String[] args) {
		Asalariado asalariado = new Asalariado("Jose", 30, 10000);
		SubContratado subcontratado = new SubContratado("Carlos", 30, 50, 100);
		// Empleado empleado1 = new Asalariado("Jose", 30, 10000);
		// Empleado empleado2 = new SubContratado("Carlos", 30, 50, 100);
		// System.out.println(empleado1.calcularPago());
		// System.out.println(empleado2.calcularPago());
		System.out.println(asalariado.toString());
		System.out.println(subcontratado.toString());

	}
}
