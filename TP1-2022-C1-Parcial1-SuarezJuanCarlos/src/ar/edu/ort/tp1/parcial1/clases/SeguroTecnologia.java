package ar.edu.ort.tp1.parcial1.clases;

public class SeguroTecnologia extends Seguro {

	private static final String DESCRIPCION = "Seguro de robo de tecnología no celular";
	private static final float INDICE_REPOSICION = 0.0025f;
	private float valorReposicion;
	private String marca;
	private String modelo;

	public SeguroTecnologia(float valorReposicion, String marca, String modelo) {
		super();
		setValorReposicion(valorReposicion);
		setMarca(marca);
		setModelo(modelo);
	}

	private void setValorReposicion(float valorReposicion) {
		this.valorReposicion = valorReposicion;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void mostrar() {
		System.out.println(DESCRIPCION);
		System.out.println(this.marca + this.modelo);

	}

	@Override
	public String texto() {
		return DESCRIPCION;
	}

	@Override
	public float calcularPremio() {
		return this.valorReposicion * INDICE_REPOSICION;
	}

}
