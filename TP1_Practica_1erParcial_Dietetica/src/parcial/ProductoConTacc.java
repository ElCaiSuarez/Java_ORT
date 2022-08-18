package parcial;

public class ProductoConTacc extends Producto {

	public final static String NOMBRE_MOSTRABLE = "Producto Con TACC";

	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
	}

	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_LINEA_CONSOLA, getNombre(), getFamiliaProducto(), getPrecio(),
				NOMBRE_MOSTRABLE);
	}

}
