package a.thp.tp3.actividad1.Ejercicio1_Array_ABM;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;

	public Agenda() {
		personas = new ArrayList<>();

	}

	// *****ABM de ArrayList*****
	// *****BUSCAR*****
	// con while llamando a Metodo compararDni de Persona
	private Persona buscarPersona(String dniBuscado) {
		int i = 0;
		Persona personaAux = null;
		while (i < personas.size() && personaAux == null) {
			if (personas.get(i).compararDni(dniBuscado)) {
				personaAux = personas.get(i);
			} else {
				i++;
			}
		}
		return personaAux;
	}

	// *****AGREGAR*****
	// Comparo (buscarPersona(dni) == null) e instancio a la persona
	public boolean agregarPersona(String dni, String nombre, String domicilio) {
		boolean pudeAgregar = false;
		if (buscarPersona(dni) == null) {// Llamo al metodo directamente por ser un metodo de la misma clase
			// RESPONSABILIDAD: No esta bien instanciar a la persona en el MAIN/TEST sino
			// AGENDA debe encargarse de crear a la persona
			personas.add(new Persona(dni, nombre, domicilio));// MEJOR: Sin uso de variable temporal
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	// *****ELIMINAR*****
	// Guardo el resultado de buscarPersona temporalmente en personaEliminada
	// Comparo (buscarPersona(dni) != null) y hago el
	// .revome(burcarPersona(personaEliminada))
	public boolean eliminarPersona(String dniEliminado) {
		boolean pudeBorrar = false;
		Persona personaEliminada = buscarPersona(dniEliminado);
		if (personaEliminada != null) {// Llamo al metodo directamente por ser un metodo de la misma clase
			personas.remove(personaEliminada);
			pudeBorrar = true;
		}
		return pudeBorrar;
	}

	// *****MOSTRAR*****
	public void mostarPersonas() {
		if (personas.size() > 0) {
			System.out.println("*** AGENDA (" + personas.size() + ") ***");
			for (Persona persona : personas) {
				// USO del toString declarado en la clase Persona
				System.out.println(persona);
			}

		} else {
			System.out.println("*** AGENDA VACIA***");
		}
	}

	// *****MODIFICAR*****
	public boolean modificarDimicilioPersona(String dniModificado, String domicilioModificado) {
		boolean pudeModificar = false;
		Persona personaModificada = buscarPersona(dniModificado);
		if (personaModificada != null) {
			personaModificada.setDomicilio(domicilioModificado);// setDomicilio es publico en la clase Persona
			pudeModificar = true;
		}
		return pudeModificar;
	}
}
