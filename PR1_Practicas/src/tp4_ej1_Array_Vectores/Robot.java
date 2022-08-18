package tp4_ej1_Array_Vectores;

public class Robot {
	
	private String codigoRobot;
	private double nivelBateria;
	
	public Robot(String codigoRobot, double nivelBateria) {
		super();
		this.codigoRobot = codigoRobot;
		this.nivelBateria = nivelBateria;
	}

	public String getCodigoRobot() {
		return codigoRobot;
	}

	public double getNivelBateria() {
		return nivelBateria;
	}
	
	
	
}