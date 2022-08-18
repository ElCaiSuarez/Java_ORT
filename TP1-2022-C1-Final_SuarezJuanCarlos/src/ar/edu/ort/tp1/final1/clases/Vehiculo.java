package ar.edu.ort.tp1.final1.clases;

public abstract class Vehiculo implements Mostrable {

	private String patente;
	private String marca;
	private String modelo;
	private static final String MSG_PATENTE_INVALIDA = "La patente no puede ser nula ni vacia";
	

	public Vehiculo(String patente, String marca, String modelo) {
		setPatente(patente);
		setMarca(marca);
		setModelo(modelo);
	}
	
	
	
	//Valido/envio excepcion x Patente
	private void setPatente(String patente) {
		if (patente == null || patente.isBlank()) {
			throw new IllegalArgumentException(MSG_PATENTE_INVALIDA);
		}		
		this.patente = patente;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

	public String getPatente() {
		return patente;
	}



	public boolean coincidePatente(String id) {
		return this.patente.equals(id);
	}
	
	public abstract double calcularIndice();
	
	@Override
	public void mostrar() {
		System.out.println("Vehiculo tipo: " + getClass().getSimpleName() + "[patente=" + this.patente + ", marca=" + this.marca + ", modelo=" + this.modelo + "] \n") ;
		System.out.println("su indice de costo por hora es: " + calcularIndice());
		
		//Vehículo tipo: Auto [patente=Auto6, marca=Marca 6, modelo=Modelo 6]
		 //su índice de costo por hora es: 6.8

	}

}
