package clases_20220509;

public class ClienteOro extends Cliente {

	private final static int CANT_MAX_RESPUESTAS_ORO = 5000;
	private TipoMembresia membresiaClienteOro = TipoMembresia.CLIENTE_ORO;

	@Override
	public double obtenerPrecioMembresia() {
		return membresiaClienteOro.getPrecioMembresia();
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
