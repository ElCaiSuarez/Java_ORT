package tp4_ej1_Array_Vectores;

public class Informe {
	
	private double monto;
	private String apellidoCajero;
	private double nivelBateria;
	
	public Informe(double monto, String apellidoCajero, double nivelBateria) {
		super();
		this.monto = monto;
		this.apellidoCajero = apellidoCajero;
		this.nivelBateria = nivelBateria;
	}
	

	@Override
	public String toString() {
		return "Informe [monto=" + monto + ", apellidoCajero=" + apellidoCajero + ", nivelBateria=" + nivelBateria
				+ "]";
	}
	
	
	

}
