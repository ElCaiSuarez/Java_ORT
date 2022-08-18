package oop.siciliano20211018_CarritoDeCompras_Array;

public class Producto {

	private String nombre;
	private double precioUnitario;
	
	public Producto(String nombre, double precioUnitario) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	public boolean equals(Producto producto) {
		return nombre.equalsIgnoreCase(producto.getNombre());
	}
	
	
}
