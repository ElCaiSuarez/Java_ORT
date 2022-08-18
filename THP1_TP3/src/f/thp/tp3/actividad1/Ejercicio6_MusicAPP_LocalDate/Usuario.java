package f.thp.tp3.actividad1.Ejercicio6_MusicAPP_LocalDate;

import java.util.ArrayList;

public class Usuario {
	private String email;
	private String apellido;
	private int edad;
	private TipoUsuario tipoUsuario;
	private ArrayList<Cancion> listaCancionesReproducidas;

	public Usuario(String email, String apellido, int edad, TipoUsuario tipoUsuario) {
		setEmail(email);
		setApellido(apellido);
		setEdad(edad);
		setTipoUsuario(tipoUsuario);
		setListaCancionesReproducidas(listaCancionesReproducidas);
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setEdad(int edad) {
		if (edad > 0)
			this.edad = edad;
	}

	private void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	private void setListaCancionesReproducidas(ArrayList<Cancion> listaCancionesReproducidas) {
		this.listaCancionesReproducidas = new ArrayList<>();
	}

	public boolean compararUsuario(String email) {
		return this.email.equals(email);
	}

	//Encapsulamiento PRIVATE
	//Responsabilidad METODO DE CADA USUARIO
	//Reutilizacion para Calcular limite GRATUITO y Listar CANTIDAD DE REPRODUCIONES X USUARIO
	private int contarCancionesReproducidas() {
		int contador = 0;
		for (int i = 0; i < listaCancionesReproducidas.size(); i++) {
			contador++;
		}
		return contador;
	}

	public boolean calcularLimite() {
		return (contarCancionesReproducidas() >= 50);
	}

	@Override
	public String toString() {
		return "Usuario: " + email + ", apellido: " + apellido + ", edad: " + edad + "Canciones Reproducidas: " + contarCancionesReproducidas();
	}
	
	public void agregarCancionReproducida(Cancion cancionReproducida) {
		this.listaCancionesReproducidas.add(cancionReproducida);
	}

	public void listarCancionesReproducidas() {
		for (Cancion cancion : listaCancionesReproducidas) {
			System.out.println(cancion);
		}
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

}
