package ejercicio4;

public class Alimento {
	private AlimentoEnum tipo;
	private int cantidad; // en kg

	public Alimento(AlimentoEnum tipo, int cantidad) {
		setTipo(tipo);
		setCantidad(cantidad);
	}

	public AlimentoEnum getTipo() {
		return tipo;
	}

	private void setTipo(AlimentoEnum tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void consumirAlimento(int cantidad) {
		this.cantidad -= cantidad;
	}

	@Override
	public String toString() {
		return "Alimento [tipo=" + tipo + ", cantidad=" + cantidad + "kg]";
	}
}
