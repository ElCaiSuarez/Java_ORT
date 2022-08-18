package tp4_ej5_Array_Matrices;

public class Viaje {
	private int idCamion;
	private String idChofer;
	private double kmXViaje;
	
	public Viaje(int idCamion, String idChofer, double kmXViaje) {
		super();
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kmXViaje = kmXViaje;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double getKmXViaje() {
		return kmXViaje;
	}
	
	
}
