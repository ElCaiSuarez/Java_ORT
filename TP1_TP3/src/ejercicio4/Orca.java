package ejercicio4;

public class Orca extends Animal {

	public Orca(String nombre, int peso, int tamanio) {
		super(nombre, peso, tamanio);
		alimento = AlimentoEnum.CALAMAR;
	}

}