package z.thp.tp3.actividad1.Ejercicio1_Array_ABM_Siciliano;

public class Test {

	public static void main(String[] args) {
		Persona persona1 = new Persona("nombre1", "apellido1", "DNI1", new Domicilio("calle1", 1000, "barrio1"), new Fecha(10, 12, 1991));
		Persona persona2 = new Persona("nombre2", "apellido2", "DNI2", new Domicilio("calle2", 1000, "barrio2"), new Fecha(10, 12, 1992));
		Persona persona3 = new Persona("nombre3", "apellido3", "DNI3", new Domicilio("calle3", 1000, "barrio3"), new Fecha(10, 12, 1993));
		Agenda agenda = new Agenda("Agenda de Personas");
		agenda.agregarPersona(persona1);
		agenda.agregarPersona(persona1);
		agenda.agregarPersona(persona2);
		agenda.agregarPersona(persona3);
		//agenda.mostrarTodo();
		System.out.println("\nEl ultimo es: " + agenda.devolverUltimo().toString());
		agenda.removerPersona("DNI3");
		System.out.println("\nAhora el ultimo es: " + agenda.devolverUltimo().toString());
		agenda.modificarDomicilio("DNI1", new Domicilio("calleNUEVA", 1000, "barrioNUEVO"));
		System.out.println("\nAhora muestro todo");
		agenda.mostrarTodo();
		//agenda.eliminarTodosElementosSinClear();
		agenda.eliminarTodosElementosConCLear();
		agenda.mostrarTodo();
	}

}
