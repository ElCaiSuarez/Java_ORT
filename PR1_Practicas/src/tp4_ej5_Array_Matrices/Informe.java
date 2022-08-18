package tp4_ej5_Array_Matrices;

public class Informe {
	private int idCamion;
	private String idChofer;
	private double costoXViaje;
	
	public Informe(int idCamion, String idChofer, double costoXViaje) {
		super();
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.costoXViaje = costoXViaje;
	}

	@Override
	public String toString() {
		return "Informe [idCamion=" + idCamion + ", idChofer=" + idChofer + ", costoXViaje=" + costoXViaje + "]";
	}
	
	
	
	
}
