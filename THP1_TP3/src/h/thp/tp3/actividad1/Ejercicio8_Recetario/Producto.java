package h.thp.tp3.actividad1.Ejercicio8_Recetario;

import java.time.LocalDate;

public class Producto {
	private String nombreProducto;
	private int cantidadDisponible;
	private LocalDate fechaVencimiento;

	public Producto(String nombreProducto, int cantidadDisponible, LocalDate fechaVencimiento) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadDisponible = cantidadDisponible;
		this.fechaVencimiento = fechaVencimiento;
	}

	public boolean compararNombreProducto(String nombreProducto) {
		return this.nombreProducto.equals(nombreProducto);
	}

	public boolean noEstaVencido() {
		return this.fechaVencimiento.isAfter(LocalDate.now());
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

}
