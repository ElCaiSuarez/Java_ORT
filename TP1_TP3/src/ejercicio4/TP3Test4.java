package ejercicio4;

public class TP3Test4 {

	public static void main(String[] args) {
		Acuario acuario;
		Animal animal;
		
		acuario = new Acuario("Carcel Marina");
		inicializarAcuario(acuario);
		
		acuario.mostrarStockAlimentos("Stock inicial de alimentos");
		
		System.out.println();
		System.out.println("Comienza el show!");
		
		animal = acuario.buscarAnimalPorNombre("Flipper");
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		animal.realizarTruco("Truco 2", acuario.getAlimentos());
		
		animal = acuario.buscarAnimalPorNombre("Willy");
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		animal.realizarTruco("Truco 2", acuario.getAlimentos());
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		
		animal = acuario.buscarAnimalPorNombre("Pipo");
		animal.realizarTruco("Truco 1", acuario.getAlimentos());
		animal.realizarTruco("Truco 3", acuario.getAlimentos());
		animal.realizarTruco("Truco 4", acuario.getAlimentos());
		
		System.out.println("FIN DEL SHOW");
		System.out.println();
		
		acuario.mostrarStockAlimentos("Stock final de alimentos");
	}

	private static void inicializarAcuario(Acuario acuario) {
		Animal animal;
		Empleado empleado;
		empleado = new Cuidador("Juan Perez", "9:00", "18:00", 2);
		acuario.agregarCuidador((Cuidador) empleado);
		empleado = new Cuidador("Cosme Fulanito", "9:00", "18:00", 1);
		acuario.agregarCuidador((Cuidador) empleado);
		empleado = new Entrenador("Jos� Pekerman", "9:00", "18:00", 20);
		acuario.agregarEntrenador((Entrenador) empleado);
		empleado = new Entrenador("Jorge Sabella", "9:00", "18:00", 15);
		acuario.agregarEntrenador((Entrenador) empleado);
		
		acuario.agregarAlimento(new Alimento(AlimentoEnum.CALAMAR, 50));
		acuario.agregarAlimento(new Alimento(AlimentoEnum.PULPO, 20));
		acuario.agregarAlimento(new Alimento(AlimentoEnum.CANGREJO, 15));
		
		animal = new Orca("Willy", 800, 5236);
		animal.agregarHabilidad(new Habilidad("Truco 1", 15));
		animal.agregarHabilidad(new Habilidad("Truco 2", 5));
		acuario.agregarAnimal(animal);
		
		animal = new Delfin("Flipper", 352, 231, (Entrenador) empleado);
		animal.agregarHabilidad(new Habilidad("Truco 1", 10));
		animal.agregarHabilidad(new Habilidad("Truco 2", 4));
		acuario.agregarAnimal(animal);
		
		animal = new LoboMarino("Pipo", 80, 120);
		animal.agregarHabilidad(new Habilidad("Truco 3", 2));
		animal.agregarHabilidad(new Habilidad("Truco 4", 5));
		acuario.agregarAnimal(animal);
		
		animal = new LoboMarino("Chicho", 81, 125);
		animal.agregarHabilidad(new Habilidad("Truco 1", 5));
		animal.agregarHabilidad(new Habilidad("Truco 4", 5));
		acuario.agregarAnimal(animal);
	}

}
