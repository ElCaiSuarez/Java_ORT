package ejercicio4;

import java.util.ArrayList;

public class Cuidador extends Empleado {

	private int cantMaxAnimales;// Cantidad maxima de animales que puede cuidar
	private int animalesACargo;

	public Cuidador() {
		cantMaxAnimales = 0;
		animalesACargo = 0;
	}

	public Cuidador(String nombreYApellido, String horaIngreso, String horaSalida, int cantMaxAnimales) {
		super(nombreYApellido, horaIngreso, horaSalida);
		setCantMaxAnimales(cantMaxAnimales);
	}

	public int getCantMaxAnimales() {
		return cantMaxAnimales;
	}

	private void setCantMaxAnimales(int cantMaxAnimales) {
		this.cantMaxAnimales = cantMaxAnimales;
	}

	public int getAnimalesACargo() {
		return animalesACargo;
	}

	public boolean validarCantidadAlimento(AlimentoEnum tipoAlimento, Habilidad habilidad, ArrayList<Alimento> alimentos) {
		Alimento alimento;
		alimento = buscarAlimentoPorTipo(tipoAlimento, alimentos);
		return alimento.getCantidad()>= habilidad.getKgNecesarios();
	}

	private Alimento buscarAlimentoPorTipo(AlimentoEnum tipo, ArrayList<Alimento> alimentos) {
		Alimento alimentoEncontrado;
		int i;
		
		alimentoEncontrado = null;
		i = 0;
		
		while(i<alimentos.size() && alimentoEncontrado==null) {
			Alimento unAlimento;
			unAlimento = alimentos.get(i);
			if (unAlimento.getTipo().equals(tipo)) {
				alimentoEncontrado = unAlimento;
			}
			i++;
		}
		
		return alimentoEncontrado;
	}
	
	public void actualizarStock(ArrayList<Alimento> alimentos, AlimentoEnum tipoAlimento, int cantidad) {
		Alimento alimento;
		
		alimento = buscarAlimentoPorTipo(tipoAlimento, alimentos);
		alimento.consumirAlimento(cantidad);
	}
	
	public boolean puedeCuidarOtroAnimal() {
		return animalesACargo < cantMaxAnimales;
	}
	
}
