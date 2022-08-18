package tp5_ej2_TDAs_Pilas;

import ar.edu.ort.tp1.tdas.implementaciones.*;
import ar.edu.ort.tp1.tdas.interfaces.*;

public class SmartBol {
	
	public boolean esTuboUsado(Pila<Pelota> pilaPelotasRecibida) {
		boolean esUsado = false;
		Pelota pelotaAux;
		Pila<Pelota> pilaPelotasAux = new PilaNodos<>();
		if (pilaPelotasRecibida.isFull()) {
			while (!pilaPelotasRecibida.isEmpty() && !esUsado) {
				pelotaAux = pilaPelotasRecibida.pop();
				pilaPelotasAux.push(pelotaAux);
				if (pelotaAux.getCantidadUsos() > 0) {
					esUsado = true;
				}
			}
			while (!pilaPelotasAux.isEmpty()) {
				pilaPelotasRecibida.push(pilaPelotasAux.pop());
			}
		}else {
			esUsado = true;
		}
		
		return esUsado;
	}
}
