package ejercicio1;

import java.util.ArrayList;

public class Persona {
	private String apellido, nombre;
	private ArrayList<NumeroTelefonico> listaTelefonos;
	private ArrayList<EMail> listaEmail;

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setListaTelefonos() {
		this.listaTelefonos = new ArrayList<>();
	}

	private void setListaEmail() {
		this.listaEmail = new ArrayList<>();
	}

	public Persona(String apellido, String nombre) {
		super();
		setApellido(apellido);
		setNombre(nombre);
		setListaEmail();
		setListaTelefonos();

	}

	private void mostarTelefonos() {
		System.out.println("Telefonos: ");
		for (NumeroTelefonico numeroTelefonico : listaTelefonos) {
			System.out.print(numeroTelefonico.getTipoDeLinea() + ": ");
			System.out.println(numeroTelefonico.getValor());
		}
	}

	private void mostrarMail() {
		System.out.println("Email: ");
		for (EMail eMail : listaEmail) {
			System.out.println(eMail.getValor());
		}
	}

	public void mostrarTodo() {
		System.out.println(getApellido() + ", " + getNombre());
		mostarTelefonos();
		mostrarMail();

	}

	public boolean agregarMail(EMail mail) {
		return listaEmail.add(mail);
	}

	public boolean agregarTelefono(NumeroTelefonico telefono) {
		return listaTelefonos.add(telefono);
	}

}
