package thp.tp2.actividad1.Ejercicio0;

public class Persona {
	/**
	* Representa a una persona con solo lo necesario para poder ubicarla por nombre
	* completo.
	* A) Inicializando los atributos nombre y apellido con ""
	* B) Reemplazan el valor del atributo con el recibido por parametro
	* C) Que el metodo tiene nombre diferente a la clase
	* D) Concatena el nombre + el apellido y devuelve un parametro String
	*/
	private String nombre;
	private String apellido;
	public Persona() {
	nombre = "";
	apellido = "";
	}
	public void ponerNombre(String valor) {
	nombre = valor;
	}
	public void ponerApellido(String valor) {
	apellido = valor;
	}
	public String obtenerNombreCompleto() {
	return nombre + " " + apellido;
	
	
	}
}
