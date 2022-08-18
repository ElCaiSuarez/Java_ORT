package ejercicio4;

public class LoboMarino extends Animal {

	public LoboMarino(String nombre, int peso, int tamanio) {
		super(nombre, peso, tamanio);
		this.alimento = AlimentoEnum.CANGREJO;
	}

}