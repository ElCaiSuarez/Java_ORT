package clases_20220527;

public enum PrecioCliente {
	CLIENTE_GRATIS(0.00), CLIENTE_PLATA(5000.00), CLIENTE_ORO(10000.00);
	
	private double precioMembresia;

	private PrecioCliente(double precioMembresia) {
		this.precioMembresia = precioMembresia;
	}

	public double getPrecioMembresia() {
		return precioMembresia;
	}
	
	
	
}
