package z.thp.tp3.actividad1.Ejercicio2_ArrayListConArrayList_Siciliano;

import java.util.ArrayList;

public class Area {
	private String nombre;
	private ArrayList<Oficina> oficinas;

	public Area(String nombre) {
		//super();
		setNombre(nombre);
		setOficinas(oficinas);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Oficina> getOficinas() {
		return oficinas;
	}

	private void setOficinas(ArrayList<Oficina> oficinas) {
		this.oficinas = new ArrayList<Oficina>();
	}

	public boolean agregarOficina(Oficina oficina) {
		return oficinas.add(oficina);
	}
	
	public void devolverInfoEmpleados() {
		for (Oficina oficina : oficinas) {
			System.out.println(oficina);
			oficina.devolverInfoEMpleados();
		}
	}

	@Override
	public String toString() {
		return "Area [nombre=" + nombre + ", oficinas=" + oficinas + "]";
	}

}
