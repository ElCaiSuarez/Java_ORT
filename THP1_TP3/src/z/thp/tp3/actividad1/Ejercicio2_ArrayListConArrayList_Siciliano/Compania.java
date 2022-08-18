package z.thp.tp3.actividad1.Ejercicio2_ArrayListConArrayList_Siciliano;

import java.util.ArrayList;

public class Compania {

	private String nombre;
	private ArrayList<Area> areas;
	
	public Compania(String nombre) {
		this.nombre = nombre;
		this.areas = new ArrayList<Area>();
	}
	
	public String devolverInfoEmpleados() {
		String resultadoEmpelados = "";
		System.out.println(this.toString());
		for (Area area : areas) {
			resultadoEmpelados = resultadoEmpelados + area.toString();
			System.out.println(area.toString());
			area.devolverInfoEmpleados();
		}
		return resultadoEmpelados;
	}
	
	public boolean agregarArea(Area area) {
		return areas.add(area);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Compania [nombre=" + nombre + "]";
	}	
}
