package k.thp.tp3.actividad1.Ejercicio11_Chef_Cusine;

import java.time.LocalDate;

public class Fecha {
	private LocalDate fecha;

	public Fecha() {
		this.fecha = LocalDate.now();

	}

	public Fecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean esFechaMenor(LocalDate fecha) {
		return this.fecha.isBefore(fecha);
	}

	public LocalDate descontarDias(LocalDate fechaADescontar, int dias) {
		return fechaADescontar.minusDays(dias);
	}

	@Override
	public String toString() {
		return fecha.toString();
	}

}
