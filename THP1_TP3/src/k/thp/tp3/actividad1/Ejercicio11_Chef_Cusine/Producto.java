package k.thp.tp3.actividad1.Ejercicio11_Chef_Cusine;

import java.time.LocalDate;

public class Producto {
	private String nombre;
	private Fecha fechaAlmacenamiento;
	private int diasVencimiento;

	public Producto(String nombre, int diasVencimiento) {
		this.nombre = nombre;
		this.fechaAlmacenamiento = new Fecha();
		this.diasVencimiento = diasVencimiento;
	}

	public boolean comparaNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public boolean estaVencido() {
		LocalDate fechaAux = this.fechaAlmacenamiento.descontarDias(LocalDate.now(), this.diasVencimiento);
		return this.fechaAlmacenamiento.esFechaMenor(fechaAux);
	}

	@Override
	public String toString() {
		return "\n   Producto: " + nombre + ", fechaAlmacenamiento: " + fechaAlmacenamiento + ", diasVencimiento: "
				+ diasVencimiento;
	}

	public void setFechaAlmacenamiento(Fecha fechaAlmacenamiento) {
		this.fechaAlmacenamiento = fechaAlmacenamiento;
	}
	
	

}
