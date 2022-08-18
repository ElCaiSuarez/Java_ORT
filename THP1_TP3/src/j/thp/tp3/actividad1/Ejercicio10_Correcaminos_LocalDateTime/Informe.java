package j.thp.tp3.actividad1.Ejercicio10_Correcaminos_LocalDateTime;

import java.time.LocalDateTime;

public class Informe {
	private LocalDateTime fechaYHora;
	private int cantPilotos;

	public Informe(LocalDateTime fechaYHora, int cantPilotos) {
		this.fechaYHora = fechaYHora;
		this.cantPilotos = cantPilotos;
	}

	@Override
	public String toString() {
		return "Informe [fechaYHora=" + fechaYHora + ", cantPilotos=" + cantPilotos + "]";
	}
	
	

}
