package oop.siciliano20211018_CarritoDeCompras_Array;

public class ItemDeCompra {

	private Producto producto;
	private int cantidad;

	public ItemDeCompra(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double calcularSubTotal() {
		double AcumAux = 0;
		AcumAux = this.producto.getPrecioUnitario() * this.cantidad;
		return AcumAux;
	}

	@Override
	public String toString() {
		return "ItemDeCompra [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
}
