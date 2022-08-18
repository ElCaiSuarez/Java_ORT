package practica2doParcial_TindORT;

import java.util.ArrayList;

public class TindORT {
	private ArrayList<Persona> listaPersonas;

	public TindORT() {
		super();
		this.listaPersonas = new ArrayList<>();
	}

	private Persona buscarPersona(String nombre, String mail) {
		int i = 0;
		Persona personaAux = null;
		while (i < listaPersonas.size() && personaAux == null) {
			if (listaPersonas.get(i).compararNombre(nombre) || listaPersonas.get(i).compararMail(mail)) {
				personaAux = listaPersonas.get(i);
			} else {
				i++;
			}
		}
		return personaAux;
	}

	public boolean agregarPersona(String nombrePersona, String mail, TipoGenero genero, int edad,
			TipoGenero generoDeseado, int edadMinDedeada, int edadMaxDeseada) {
		boolean pudeAgregar = false;
		if (buscarPersona(nombrePersona, mail) == null) {
			pudeAgregar = listaPersonas
					.add(new Persona(nombrePersona, mail, genero, edad, generoDeseado, edadMinDedeada, edadMaxDeseada));
		}
		return pudeAgregar;
	}

	public void mostrarLista() {
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
	}

	private boolean verificarCoincidenciaParcial(Persona persona, Persona personaComparada) {
		boolean pudeVerificar = false;
		if (!persona.equals(personaComparada)) {
			if (persona.getGeneroDeseado() == personaComparada.getGenero()
					|| persona.getGeneroDeseado() == TipoGenero.INDISTINTO) {
				pudeVerificar = persona.getEdadMinDedeada() <= personaComparada.getEdad()
						&& persona.getEdadMaxDeseada() >= personaComparada.getEdad();
			}
		}
		return pudeVerificar;
	}

	public ArrayList<Persona> mostrarListado(String mail) {
		ArrayList<Persona> listaPersonasDeseadas = new ArrayList<>();
		Persona personaAux = buscarPersona(null, mail);
		if (personaAux != null) {
			for (Persona persona : listaPersonas) {
				if (verificarCoincidenciaParcial(personaAux, persona)
						&& verificarCoincidenciaParcial(persona, personaAux)) {
					listaPersonasDeseadas.add(persona);
				}
			}

		} else {
			System.out.println("El mail no pertenece a ningun Usuario");
		}
		return listaPersonasDeseadas;

	}

}
