package z.thp.tp3.actividad1.Ejercicio1_Array_ABM_Siciliano;

import java.util.ArrayList;

public class Agenda {
	private String nombre;
	private ArrayList<Persona> listaPersonas;

	/**
	 * Constructor Agenda Siempre instanciar los ArrayList
	 * 
	 * @param nombre
	 */
	public Agenda(String nombre) {
		super();
		setNombre(nombre);
		setListaPersonas(listaPersonas);
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	/**
	 * Setter ArrayList<Persona> listaPersona Siempre instancias los ArrayList
	 * 
	 * @param listaPersonas
	 */
	private void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * BUSQUEDA x dni (Metodo Privado)
	 * 
	 * @param dni
	 * @return Persona
	 */
	private Persona buscarPersona(String dni) {
		Persona personaBuscada = null;
		int indice = 0;
		while (indice < listaPersonas.size() && personaBuscada == null) {
			if (listaPersonas.get(indice).getDni().equals(dni)) {
				personaBuscada = listaPersonas.get(indice);
			} else {
				indice++;
			}
		}
		return personaBuscada;
	}

	/**
	 * DEVOLVERULTIMO con isEmpty() y size()-1
	 * 
	 * @return Persona
	 */
	public Persona devolverUltimo() {
		Persona personaBuscada = null;
		if (!this.listaPersonas.isEmpty()) {
			personaBuscada = this.listaPersonas.get(this.listaPersonas.size() - 1);
		}
		return personaBuscada;
	}

	/**
	 * BAJA/REMOVE con BUSQUEDA x dni
	 * 
	 * @param dni
	 * @return Persona
	 */
	public Persona removerPersona(String dni) {
		Persona personaBuscada = buscarPersona(dni);
		if (personaBuscada != null) {
			listaPersonas.remove(personaBuscada);
		} else {
			System.out.println("Persona InExistente");
		}
		return personaBuscada;
	}

	/**
	 * ALTA/ADD con BUSQUEDA PRIVADA x dni
	 * 
	 * @param persona
	 */
	public void agregarPersona(Persona persona) {
		Persona personaBuscada = buscarPersona(persona.getDni());
		if (personaBuscada != null) {
			System.out.println("Persona Existente");
		} else {
			listaPersonas.add(persona);
		}
	}

	/**
	 * BAJA/REMOVE recorriendo con FOR OJO NO USAR FOR EACH PARA EL REMOVE
	 */
	public void eliminarTodosElementosSinClear() {
		for (int i = 0; i < listaPersonas.size() + 1; i++) {
			// USO 0 en vez de indice xq cuando hago remove se corre el indice -1
			listaPersonas.remove(0);
		}

	}

	/**
	 * BAJA/REMOVE con Clrear()
	 * 
	 */
	public void eliminarTodosElementosConCLear() {
		listaPersonas.clear();
	}

	/**
	 * MODIFICA DOMICILIO con BUSQUEDA x dni y Setter de Persona
	 * 
	 * @param dni, Domicilio
	 * @return boolean
	 */
	public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		boolean resultado = false;
		Persona personaBuscada = buscarPersona(dni);
		if (personaBuscada != null) {
			personaBuscada.setDomicilio(domicilio);
			resultado = true;
		}
		return resultado;
	}

	/**
	 * MOSTRARTODO con FOR EACH y toString()
	 * 
	 */
	public void mostrarTodo() {
		listaPersonas.toString();
		for (Persona persona : listaPersonas) {
			// Muestra solo el nombre
			// System.out.println(persona.getNombre());
			// Muestra todo el objeto
			System.out.println("\n" + persona.toString());
			System.out.println("	Domicilio: " + persona.getDomicilio());
			System.out.println("	Fecha de Nacimiento: " + persona.getFechaNacimiento());
		}

	}

	@Override
	public String toString() {
		return "Agenda [listaPersonas=" + listaPersonas + "]";
	}

}
