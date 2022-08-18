package ejercicio4;

import java.util.ArrayList;

public class Acuario {

	private String nombre;
	private ArrayList<Entrenador> entrenadores;
	private ArrayList<Cuidador> cuidadores;
	private ArrayList<Animal> animales;
	private ArrayList<Alimento> alimentos;

	public Acuario(String nombre) {
		setNombre(nombre);
		entrenadores = new ArrayList<>();
		cuidadores = new ArrayList<>();
		animales = new ArrayList<Animal>();
		alimentos = new ArrayList<Alimento>();
	}

	public void agregarEntrenador(Entrenador entrenador) {
		entrenadores.add(entrenador);
	}

	public void agregarCuidador(Cuidador cuidador) {
		cuidadores.add(cuidador);
	}

	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}

	public void agregarAnimal(Animal animal) {
		if (asignarCuidador(animal)) {
			animales.add(animal);
		} else {
			System.out.println("No hay cuidadores disponibles, debe contratar uno nuevo.");
		}
	}

	private boolean asignarCuidador(Animal animal) {
		boolean retorno;
		int i;

		retorno = false;
		i = 0;

		while (i < cuidadores.size() && !retorno) {
			Cuidador unCuidador;
			unCuidador = cuidadores.get(i);
			retorno = unCuidador.puedeCuidarOtroAnimal();
			if (retorno) {
				animal.setCuidador(unCuidador);
			}
		}

		return retorno;
	}

	public void agregarAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}

	public void mostrarStockAlimentos(String msg) {
		System.out.println(msg + ":");
		for (Alimento alimento : alimentos) {
			System.out.println(alimento);
		}
	}

	public Animal buscarAnimalPorNombre(String nombre) {
		Animal animalEncontrado;
		int i;

		animalEncontrado = null;
		i = 0;

		while (i < animales.size() && animalEncontrado == null) {
			Animal unAnimal;
			unAnimal = animales.get(i);
			if (unAnimal.getNombre().equalsIgnoreCase(nombre)) {
				animalEncontrado = unAnimal;
			}
			i++;
		}

		return animalEncontrado;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Acuario [nombre=" + nombre + ", entrenadores=" + entrenadores + ", cuidadores=" + cuidadores
				+ ", animales=" + animales + ", alimentos=" + alimentos + "]";
	}
	
	

}
