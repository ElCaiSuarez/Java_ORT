package tp4_ej5_Array_Matrices;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Viaje> viajes;
	private Camion[] camiones;
	private Chofer[] choferes;
	private final static int CANT_CHOFERES = 20;
	private final static int CANT_CAMIONES = 10;
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.viajes = new ArrayList<>();
		this.camiones = new Camion[CANT_CAMIONES];
		this.choferes = new Chofer[CANT_CHOFERES];
	}
	
	public ArrayList<Informe> obtenerCostosDeViajes() {
		ArrayList<Informe> costosDeViaje = new ArrayList<>();
		double costoAux;
		Chofer choferAux;
		for (Viaje viaje : viajes) {
			choferAux = buscarChofer(viaje.getIdChofer());
			if (choferAux != null) {
				costoAux = viaje.getKmXViaje() * camiones[viaje.getIdCamion()].getCostoXKM();
				costoAux += choferAux.getPagoXViaje();
				costosDeViaje.add(new Informe(viaje.getIdCamion(), viaje.getIdChofer(), costoAux));
			}
		}
		return costosDeViaje;
	}
	
	private Chofer buscarChofer(String idRecibido) {
		Chofer choferAux = null;
		int i = buscarIdChofer(idRecibido);
		if (i > 0) {
			choferAux = choferes[i];
		}
		return choferAux;
	}
	
	private int buscarIdChofer(String idRecibido) {
		int i = CANT_CHOFERES -1;	
		boolean salir = false;
		
		while (i >= 0 && !salir) {
			if (choferes[i].getIdChofer() != null && choferes[i].getIdChofer() == idRecibido) {
				salir = true;
			}else {
				i--;
			}
		}
		return i;
	}
	
	public int[][] obtenerViajesXChoferCamion(){
		int[][] viajesXChoferCamion = new int[CANT_CHOFERES][CANT_CAMIONES];
		int idChoferAux;
		for (Viaje viaje : viajes) {
			idChoferAux = buscarIdChofer(viaje.getIdChofer());
			if (idChoferAux >= 0) {
				viajesXChoferCamion[idChoferAux][viaje.getIdCamion()]++;
			}
		}
		return viajesXChoferCamion;
	}
	
	public void agregarCamion(int id, Camion camionRecibido) {
		camiones[id] = camionRecibido;
	}
	
	public void agregarChofer(int id, Chofer choferRecibido) {
		choferes[id] = choferRecibido;
	}
	
	public void agregarViajes(Viaje viaje) {
		viajes.add(viaje);
	}
	
	
}

