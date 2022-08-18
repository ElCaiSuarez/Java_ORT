package parcial;

public abstract class Producto implements Mostrable {

	public static final float DESCUENTO_POR_MAYOR = 0.9f;
	private String nombre;
	private float precio;
	FamiliaProducto familiaProducto;

	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		super();
		setFamiliaProducto(familiaProducto);
		setNombre(nombre);
		setPrecio(precio);
	}

	public float getPrecio(TipoPedido tipoPedido) {
		float precioAux = precio;
		if (tipoPedido == TipoPedido.POR_MAYOR) {
			precioAux = precioAux * DESCUENTO_POR_MAYOR;
		}
		return precioAux;
	}

	private void setFamiliaProducto(FamiliaProducto familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPrecio(float precio) {
		this.precio = precio;
	}

	public FamiliaProducto getFamiliaProducto() {
		return familiaProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public boolean compararProducto(Producto producto) {
		return this.nombre.equals(producto.getNombre()) && (this.familiaProducto == producto.getFamiliaProducto());
	}

//	@Override
//	public abstract void mostrar();

}
