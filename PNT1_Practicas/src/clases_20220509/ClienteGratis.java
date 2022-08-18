package clases_20220509;

public class ClienteGratis extends Cliente {
	private final static int CANT_MAX_RESPUESTAS_GRATIS = 1000;
	private TipoMembresia membresiaClienteGratis;

	@Override
	public double obtenerPrecioMembresia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean registrarCliente(Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actuzalizarMembresia(TipoMembresia nuevaMembresia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crearEncuesta(Encuesta nuevaEncuesta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Encuesta obtenerReporteEncuestaFinalizada() {
		// TODO Auto-generated method stub
		return null;
	}

}
