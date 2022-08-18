package a.thp.tp3.actividad1.Ejercicio1_Array_ABM;

public class Test {

	public static void main(String[] args) {
		
		Agenda miAgenda = new Agenda();
		//Valido en el metodo Mostrar que el ArrayList.size() sea mayor a 0
		miAgenda.mostarPersonas();
		//No puedo hacer miAgenda.personas.add PORQUE personas es privada de la calse Agenda debo hacer los metodos publicos para el ABM
		//RESPONSABILIDAD: No esta bien crear o instanciar a la persona en TEST sino AGENDA debe encargarse de crear a la persona
		miAgenda.agregarPersona("1111111", "Diegote", "La casa del Diego");
		miAgenda.agregarPersona("1111111", "Messirve", "Paris jaja farsa");//Chequeamos que valide si existe el DNI y no agrega existente
		miAgenda.agregarPersona("2222222", "Messirve", "Paris jaja farsa");
		miAgenda.agregarPersona("3333333", "Malermo", "Bokita");
		miAgenda.mostarPersonas();
		miAgenda.eliminarPersona("1111111");
		System.out.println(miAgenda.eliminarPersona("4444444") ? "BORRO" : "NO BORRO");//Chequeamos que valide si existe el DNI y no elimina no existente 
		miAgenda.mostarPersonas();
		miAgenda.modificarDimicilioPersona("3333333", "Estadio Unico");
		miAgenda.mostarPersonas();

	}

}
