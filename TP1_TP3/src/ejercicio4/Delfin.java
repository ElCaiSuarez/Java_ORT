package ejercicio4;

public class Delfin extends Animal {

	private Entrenador entrenador;

	public Delfin(String nombre, int peso, int tamanio, Entrenador entrenador) {
		super(nombre, peso, tamanio);
		setEntrenador(entrenador);
		this.alimento = AlimentoEnum.PULPO;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

}
