package ejercicio4;

import java.util.ArrayList;

public abstract class Animal {

	private String nombre;
	private int peso;
	private int tamanio;// En cms
	private ArrayList<Habilidad> habilidades;
	private Cuidador cuidador;
	protected AlimentoEnum alimento;

	public Animal() {
		nombre = "Sin definir";
		peso = 0;
		tamanio = 0;
		habilidades = new ArrayList<Habilidad>();
		cuidador = null;
	}

	public Animal(String nombre, int peso, int tamanio) {
		setNombre(nombre);
		setPeso(peso);
		setTamanio(tamanio);
		habilidades = new ArrayList<Habilidad>();
	}

	public void realizarTruco(Habilidad habilidad) {
		System.out.println(getTipo() + " " + nombre + ", realizo " + "\"" + habilidad.getNombre() + "\", recibi� " + habilidad.getKgNecesarios() + "kg de " + alimento);
	}

	public boolean validarTruco(Habilidad habilidad) {
		return habilidades.contains(habilidad);
	}

	public String getTipo() {
		return getClass().getSimpleName();
	}

	public AlimentoEnum getAlimento() {
		return alimento;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	private void setPeso(int peso) {
		this.peso = peso;
	}

	public int getTamanio() {
		return tamanio;
	}

	private void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void agregarHabilidad(Habilidad habilidad) {
		habilidades.add(habilidad);
	}

	public void eliminarHabilidad(Habilidad habilidad) {
		habilidades.remove(habilidad);
	}

	public Cuidador getCuidador() {
		return cuidador;
	}

	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}

	public Habilidad buscarHabilidadPorNombre(String nombreHabilidad) {
		Habilidad habilidadEncontrada;
		int i;
		
		habilidadEncontrada = null;
		i = 0;
		
		while(i<habilidades.size() && habilidadEncontrada==null) {
			Habilidad unaHabilidad;
			unaHabilidad = habilidades.get(i);
			if (unaHabilidad.getNombre().equalsIgnoreCase(nombreHabilidad)) {
				habilidadEncontrada = unaHabilidad;
			}
			i++;
		}
		
		return habilidadEncontrada;
	}
	
	public void realizarTruco(String nombreHabilidad, ArrayList<Alimento> alimentos) {
		Habilidad habilidad;
		habilidad = buscarHabilidadPorNombre(nombreHabilidad);
		if (habilidad == null) {
			System.out.println("El "+ getTipo() +" " + nombre +" no conoce la habilidad " + nombreHabilidad);
		} else {
			if (cuidador.validarCantidadAlimento(alimento, habilidad, alimentos)) {
				realizarTruco(habilidad);
				cuidador.actualizarStock(alimentos, alimento, habilidad.getKgNecesarios());
			} else {
				System.out.println(getTipo() + " " + nombre + " se le orden� realizar \"" + nombreHabilidad + "\", pero no tiene suficiente alimento");
			}
			
		}
	}
}