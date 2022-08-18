package c.thp.tp3.actividad1.Ejercicio3_Inmobiliaria;

public class Propiedad {
	private String domicilio;
	private double precio;
	private Tipo_Propiedad tipoPropiedad;

	public Propiedad(String domicilio, double precio, Tipo_Propiedad tipoPropiedad) {
		setDomicilio(domicilio);
		setPrecio(precio);
		setTipoPropiedad(tipoPropiedad);
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;

	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setTipoPropiedad(Tipo_Propiedad tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	public boolean compararTipo(Tipo_Propiedad tipoPropiedad) {
		return this.tipoPropiedad.equals(tipoPropiedad);
	}

	public boolean compararPropiedad(String domicilio) {
		return this.domicilio.equals(domicilio);
	}

	@Override
	public String toString() {
		return "   Domicilio: " + domicilio + ", precio: " + precio;
	}

}
