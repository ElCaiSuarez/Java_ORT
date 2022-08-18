package ejercicio3;

import java.util.ArrayList;

public class Ticket {
	private static final String PIE = "Total a pagar: $";
	private static final String ENCABEZADO_1 = "Ticket de venta\n";
	private static final String ENCABEZADO_2 = "Art�culos: \n";
	
	private ArrayList<Electrodomestico> electrodomesticos;

	public Ticket(ArrayList<Electrodomestico> electrodomesticos) {
		setElectrodomesticos(electrodomesticos);
	}

	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;
	}

	private void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}
	
	@Override
	public String toString() {
		String retorno;
		double total;
		total = 0;
		retorno = ENCABEZADO_1;
		retorno += ENCABEZADO_2;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			retorno += electrodomestico.toString() + "\n";
			total += electrodomestico.getPrecio();
		}
		retorno += PIE + total;
		return retorno;
	}
}
