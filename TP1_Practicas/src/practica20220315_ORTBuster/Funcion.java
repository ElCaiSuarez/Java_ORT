package practica20220315_ORTBuster;

import java.util.ArrayList;

public class Funcion {
	private String dia;
	private String hora;
	private ArrayList<Asiento> listaAsientos;

	public Funcion(String dia, String hora) {
		setDia(dia);
		setHora(hora);
		setListaAsientos();

	}

	private void setDia(String dia) {
		this.dia = dia;
	}

	private void setHora(String hora) {
		this.hora = hora;
	}

	private void setListaAsientos() {
		this.listaAsientos = new ArrayList<>();
		inicializarAsientos();
	}

	private void inicializarAsientos() {
		char letra = 'A';
		for (int i = 1; i <= 20; i++) { // cada iteración es una fila de asientos

			for (int ii = 1; ii <= 11; ii++) { // cada it. de este for es una columna
				listaAsientos.add(new Asiento(Character.toString(letra), i));
				letra++;
			} // terminó de procesar (generar) una fila

			letra = 'A'; // inicializa columna para empezar otra (fila)
		}
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public boolean modificarAsiento(String letra, int fila, Estado estado) {
		boolean pudeModificar = false;
		Asiento asientoAux = buscarAsiento(letra, fila);
		if (asientoAux != null) {
			if (estado == Estado.LIBRE) {
				asientoAux.liberar();
			} else if (estado == Estado.CUMPLIDO) {
				asientoAux.cumlpir();
			} else {
				asientoAux.reservar();
			}
			pudeModificar = true;
		}
		return pudeModificar;
	}

	public Asiento buscarAsiento(String letra, int fila) {
		int i = 0;
		Asiento asientoAux = null;
		while (i < listaAsientos.size() && asientoAux == null) {
			if (listaAsientos.get(i).compararAsiento(letra, fila)) {
				asientoAux = listaAsientos.get(i);
			} else {
				i++;
			}
		}
		return asientoAux;
	}

	public boolean compararFuncion(String dia, String hora) {
		return this.dia.equals(dia) && this.hora.equals(hora);
	}

	public void mostrarAsientos() {
		System.out.println("Funcion: " + dia + "\n Hora: " + hora);
		for (Asiento asiento : listaAsientos) {
			System.out.println(asiento.toString());
		}
	}

}
