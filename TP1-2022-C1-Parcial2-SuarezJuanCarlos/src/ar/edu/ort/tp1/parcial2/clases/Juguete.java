package ar.edu.ort.tp1.parcial2.clases;

public abstract class Juguete implements Mostrable{
	private static final String MSG_MARCA_INVALIDA = "La marca no puede ser nula ni vacia";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";
	private static final String MSG_PRECIO_INVALIDO = "El precio no puede ser menor a 2";
	private int id;
	private String marca;
	private float precio;
	
	public Juguete(int id, String marca, float precio) {
		super();
		setId(id);
		setMarca(marca);
		setPrecio(precio);
	}

	private void setId(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
		}	
		this.id = id;
	}

	private void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException(MSG_MARCA_INVALIDA);
		}		
		this.marca = marca;
	}

	private void setPrecio(float precio) {
		if (precio <= 1) {
			throw new IllegalArgumentException(MSG_PRECIO_INVALIDO);
		}	
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}
	
	
	
	
	
	

}