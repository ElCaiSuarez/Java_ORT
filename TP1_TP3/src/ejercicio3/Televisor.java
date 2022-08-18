package ejercicio3;

public class Televisor extends Electrodomestico {

	private int dimension;// En pulgadas
	private boolean esSmart;

	public Televisor() {
		dimension = 0;
		esSmart = false;
	}

	public Televisor(String marca, String modelo, int numeroSerie, int voltaje, boolean encendido, int precio,
			int dimension, boolean esSmart) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		setDimension(dimension);
		setEsSmart(esSmart);
	}

	@Override
	public String toString() {
		return "Televisor " + super.toString() + " dimension " + dimension + " pulgadas " + descripcionSmart() + ": $"
				+ getPrecio() + ".";
	}

	public String descripcionSmart() {
		String retorno;
		if (esSmart) {
			retorno = "smart";
		}
		else {
			retorno = "sin smart";
		}
		return retorno;
	}

	public int getDimension() {
		return dimension;
	}

	private void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isEsSmart() {
		return esSmart;
	}

	private void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}

	public String mostrarProducto() {
		return "Televisor " + descripcionSmart() + " " + getMarca() + " " + dimension + " pulgadas, modelo "
				+ getModelo() + ": $" + getPrecio() + ".";
	}
}