package clases_20220509;

public class ClientePlata extends Cliente {
	private final static int CANT_MAX_RESPUESTAS_PLATA = 2500;
	private TipoMembresia membresiaClientePlata = TipoMembresia.CLIENTE_PLATA;

	@Override
	public double obtenerPrecioMembresia() {
		// TODO Auto-generated method stub
		return membresiaClientePlata.getPrecioMembresia();
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
