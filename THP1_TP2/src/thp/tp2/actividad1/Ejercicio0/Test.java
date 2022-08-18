package thp.tp2.actividad1.Ejercicio0;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona unaPersona = new Persona();
		System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
		unaPersona.ponerNombre("Hortencio");
		unaPersona.ponerApellido("Ortega");
		System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
				}
	}


