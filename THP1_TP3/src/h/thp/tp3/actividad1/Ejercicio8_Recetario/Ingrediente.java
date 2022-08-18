package h.thp.tp3.actividad1.Ejercicio8_Recetario;

public class Ingrediente {
	private String nombreIngrediente;
	private int cantidadNecesaria;
	private boolean esRefrigerado;

	public Ingrediente(String nombreIngrediente, int cantidadNecesaria, boolean esRefrigerado) {
		this.nombreIngrediente = nombreIngrediente;
		this.cantidadNecesaria = cantidadNecesaria;
		this.esRefrigerado = esRefrigerado;
	}

	public boolean compararNombreIngrediente(String nombreIngrediente) {
		return this.nombreIngrediente.equals(nombreIngrediente);
	}

	public int getCantidadNecesaria() {
		return cantidadNecesaria;
	}

	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}

	public String getNombreIngrediente() {
		return nombreIngrediente;
	}

	@Override
	public String toString() {
		return "\n NombreIngrediente: " + nombreIngrediente + ", cantidadNecesaria: " + cantidadNecesaria
				+ ", esRefrigerado: " + esRefrigerado;
	}

}
