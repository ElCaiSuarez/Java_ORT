package tp5_ej2_TDAs_Pilas;

import ar.edu.ort.tp1.tdas.implementaciones.*;
import ar.edu.ort.tp1.tdas.interfaces.*;


public class Test {

	public static void main(String[] args) {
		SmartBol smartBol = new SmartBol();
		Pila<Pelota> pilaPelotas = new PilaNodos<>(3);
		
		Pelota pelota1 = new Pelota(0);
		Pelota pelota2 = new Pelota(0);
		Pelota pelota3 = new Pelota(0);
		
		pilaPelotas.push(pelota1);
		pilaPelotas.push(pelota2);
		pilaPelotas.push(pelota3);
		
		System.out.println(smartBol.esTuboUsado(pilaPelotas));
	}
	
}
