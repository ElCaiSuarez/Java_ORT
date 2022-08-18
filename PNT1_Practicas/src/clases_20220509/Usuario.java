package clases_20220509;

import java.util.ArrayList;

public class Usuario implements InterfazUsuario {
	private String nombreUsuario;
	private String passwordUsuario;
	private String dniUsuario;
	private ArrayList<Encuesta> encuestasRespondidas;
	private ArrayList<Preferencias> preferenciasUsuario;

	@Override
	public boolean registrarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actuzalizarPreferencias(ArrayList<Preferencias> nuevasPreferencias) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Encuesta> obtenerEncuestasDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean responderEncuesta(Encuesta encuestaRespondida) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int obtenerPuntosUsuario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
