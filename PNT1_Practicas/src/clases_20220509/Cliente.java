package clases_20220509;

import java.util.ArrayList;

public abstract class Cliente implements InterfazCliente {

	private String nombreCliente;
	private String usuarioCliente;
	private String passwordCliente;
	private String empresaCliente;
	private ArrayList<Encuesta> encuestasCreadas;

	public abstract double obtenerPrecioMembresia();

}
