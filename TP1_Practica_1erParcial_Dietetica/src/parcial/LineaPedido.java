package parcial;

public class LineaPedido implements Mostrable {
	private int cantidad;
	private Producto producto;

	public LineaPedido(Producto producto, int cantidad) {
		super();
		setProducto(producto);
		setCantidad(cantidad);
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_CANTIDAD_LINEA_CONSOLA, cantidad);
		producto.mostrar();

	}

	public float getPrecioLineaPedido(TipoPedido tipoPedido) {
		return cantidad * producto.getPrecio(tipoPedido);
	}

	public void adicionarCantidad(int cantidad) {
		this.cantidad += cantidad;

	}

}
