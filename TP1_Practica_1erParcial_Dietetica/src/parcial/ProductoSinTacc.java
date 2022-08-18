package parcial;

public class ProductoSinTacc extends Producto {

	public final static String NOMBRE_MOSTRABLE = "Producto Sin TACC";
	private String certificadoraSinTacc;

	public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadoraSinTacc) {
		super(familiaProducto, nombre, precio);
		setCertificadoraSinTacc(certificadoraSinTacc);
	}

	public String getCertificadoraSinTacc() {
		return certificadoraSinTacc;
	}

	private void setCertificadoraSinTacc(String certificadoraSinTacc) {
		this.certificadoraSinTacc = certificadoraSinTacc;
	}

	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_LINEA_CONSOLA, getNombre(), getFamiliaProducto(), getPrecio(),
				NOMBRE_MOSTRABLE);
	}

}
