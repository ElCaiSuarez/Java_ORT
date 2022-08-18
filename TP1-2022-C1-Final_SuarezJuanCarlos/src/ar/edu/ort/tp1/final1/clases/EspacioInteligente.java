package ar.edu.ort.tp1.final1.clases;

public interface EspacioInteligente<T, K> {

	public T retirar(K id);
	public void agregar(T elemento);
	public int lugarDisponible();
}
