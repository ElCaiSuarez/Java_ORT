package ejercicio3;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Electrodomestico> electrodomesticos;

	public Empresa(String nombre) {
		setNombre(nombre);
		electrodomesticos = new ArrayList<Electrodomestico>();
	}

	public void agregarElectrodomestico(Electrodomestico e) {
		electrodomesticos.add(e);
	}
	
	public int getCantidadElectrodomesticos() {
		return electrodomesticos.size();
	}

	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getListadoDeElectrodomesticos() {
		String retorno;
		retorno = "";
		if (!electrodomesticos.isEmpty()) {
			for (int i = 0; i < electrodomesticos.size(); i++) {
				retorno += "(" + (i + 1) + ") Tipo: " + electrodomesticos.get(i).getTipo() + "\tMarca: "
						+ electrodomesticos.get(i).getMarca() + "\tModelo: " + electrodomesticos.get(i).getModelo() + "\n";
			}
		} else {
			retorno = "No hay electrodomesticos disponibles";
		}
		return retorno;
	}
	
	public Electrodomestico getElectrodomestico(int posicion) {
		return electrodomesticos.get(posicion);
	}
}
