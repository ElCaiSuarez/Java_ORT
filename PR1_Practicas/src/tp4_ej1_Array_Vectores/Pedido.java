package tp4_ej1_Array_Vectores;

public class Pedido {
	
	private String nombreCliente;
	private int idCajero;
	private String codigoRobot;
	private double monto;
	
	public Pedido(String nombreCliente, int idCajero, String codigoRobot, double monto) {
		super();
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codigoRobot = codigoRobot;
		this.monto = monto;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public String getCodigoRobot() {
		return codigoRobot;
	}

	public double getMonto() {
		return monto;
	}

	@Override
	public String toString() {
		return "Pedido [nombreCliente=" + nombreCliente + ", idCajero=" + idCajero + ", codigoRobot=" + codigoRobot
				+ ", monto=" + monto + "]";
	}
	
	
}
