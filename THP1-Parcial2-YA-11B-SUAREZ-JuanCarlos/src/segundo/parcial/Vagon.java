package segundo.parcial;

public class Vagon {
	private TipoVagon tipoVagon; // SMALL 30 o MEDIUM 40 o LARGE 50
	private int capacidad;
	private final static int MAX_SMALL = 30;
	private final static int MAX_MEDIUM = 40;
	private final static int MAX_LARGE = 50;

	public Vagon(TipoVagon tipoVagon) {
		this.tipoVagon = tipoVagon;
		setCapacidad(tipoVagon);
	}

	private void setCapacidad(TipoVagon tipoVagon) {
		if (tipoVagon == TipoVagon.SMALL) {
			this.capacidad = MAX_SMALL;
		} else if (tipoVagon == TipoVagon.MEDIUM) {
			this.capacidad = MAX_MEDIUM;
		} else {
			this.capacidad = MAX_LARGE;
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int restarCapacidad(int cantidadToneladas) {
		int cantidadAux = cantidadToneladas;
		if (cantidadToneladas > this.capacidad) {
			cantidadAux -= this.capacidad;
			this.capacidad = 0;
		} else if (cantidadToneladas > 0) {
			cantidadAux -= this.capacidad;
			this.capacidad -= cantidadToneladas;
		} else {
			cantidadAux = 0;
		}
		return cantidadAux;

	}

	public int obtenerCapacidadVagon() {
		int acumAux = 0;
		if (this.tipoVagon == TipoVagon.SMALL) {
			acumAux = MAX_SMALL;
		} else if (this.tipoVagon == TipoVagon.MEDIUM) {
			acumAux = MAX_MEDIUM;
		} else {
			acumAux = MAX_LARGE;
		}
		return acumAux;
	}

}
