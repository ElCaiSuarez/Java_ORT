package clases_20220509;

public enum TipoMembresia {
	CLIENTE_GRATIS(0.00), CLIENTE_PLATA(5000.00), CLIENTE_ORO(10000.00);
	
	private double precioMembresia;

	private TipoMembresia(double precioMembresia) {
		this.precioMembresia = precioMembresia;
	}

	public double getPrecioMembresia() {
		return precioMembresia;
	}
	
	
	
}
