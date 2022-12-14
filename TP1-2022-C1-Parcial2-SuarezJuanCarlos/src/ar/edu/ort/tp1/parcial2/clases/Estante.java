package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements ContenedorInteligente<Juguete, Integer>{
	
	private Pila<Juguete> pilaJuguetes;
	
	private static final String MSG_PILA_LLENA = "La pila alcanzo su tope";
	
	
	public Estante(int tope) {
		super();
		this.pilaJuguetes = new PilaNodos<>(tope);
	}

	public boolean estaLleno(int fil, int col) {
		return pilaJuguetes.isFull();
	}
	
	@Override
	public void guardar(Juguete elemento) {
		if (pilaJuguetes.isFull()) {
			throw new IllegalArgumentException(MSG_PILA_LLENA);
		}		
		pilaJuguetes.push(elemento);
	}
		
	@Override
	public Juguete recuperarPorId(Integer id) {
		Pila<Juguete> pilaAux = new PilaNodos<>();
		Juguete jugueteAux = null;
		while (!pilaJuguetes.isEmpty()) {
			Juguete j = pilaJuguetes.pop();
			if (j.getId() == id) {
				jugueteAux = j;
			}else {
				pilaAux.push(j);
			}
		}
		while (!pilaAux.isEmpty()) {
			pilaJuguetes.push(pilaAux.pop());
		}
		return jugueteAux;
	}

}
