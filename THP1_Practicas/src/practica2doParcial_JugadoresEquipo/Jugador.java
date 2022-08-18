package practica2doParcial_JugadoresEquipo;

public class Jugador {
	private int numero;
	private String apellido;
	private int cantidadGoles;

	public Jugador(int numero, String apellido, int cantidadGoles) {
		this.numero = numero;
		this.apellido = apellido;
		this.cantidadGoles = cantidadGoles;
	}

	public boolean compararNumero(int numero) {
		return this.numero == numero;

	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}
	
	

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", apellido=" + apellido + ", cantidadGoles=" + cantidadGoles + "]";
	}

}
