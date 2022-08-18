package thp.tp2.actividad3.Ejercicio7;

public class Bot {
	private String nombre;
	
	public void saludar(){
		Persona persona  = null;
		this.saludar(persona);
	}
	public void saludar(Persona persona){
		String nombreCompleto = "";
		if (persona != null){
			nombreCompleto = persona.obtenerNombreCompleto();
			System.out.println("Hola " + nombreCompleto + ", mi nombre es " + this.nombre + " ¿En que puedo ayudarlo?");
		}else {
			System.out.println("Hola, mi nombre es " + this.nombre + " ¿En que puedo ayudarlo?");
		}
		
	}
	
	
}
