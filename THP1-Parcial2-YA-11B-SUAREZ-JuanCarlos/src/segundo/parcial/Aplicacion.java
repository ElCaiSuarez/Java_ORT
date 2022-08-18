package segundo.parcial;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Tren> listaTrenes;

	public Aplicacion() {
		this.listaTrenes = new ArrayList<>();
	}

	private Tren buscarTren(int numeroTren) {
		int i = 0;
		Tren trenAux = null;
		while (i < listaTrenes.size() && trenAux == null) {
			if (listaTrenes.get(i).compararTren(numeroTren)) {
				trenAux = listaTrenes.get(i);
			} else {
				i++;
			}
		}
		return trenAux;
	}

	public int crearFormacion() {
		int proximoTren = listaTrenes.size() + 1;
		this.listaTrenes.add(new Tren(proximoTren));
		return proximoTren;
	}

	public TipoResultado agregarVagones(int numeroTren, int cantidadVagones, TipoVagon tipoVagon) {
		TipoResultado tipoResultadoAux = TipoResultado.CANT_VAGONES_INVALIDA;
		if (numeroTren < 0 || cantidadVagones < 0) {
			tipoResultadoAux = TipoResultado.ERROR;
		} else {
			Tren trenAux = buscarTren(numeroTren);
			if (trenAux != null) {
				boolean pudeAgregar = trenAux.agregarVagones(cantidadVagones, tipoVagon);
				if (pudeAgregar) {
					tipoResultadoAux = TipoResultado.AGREGADO_OK;
				}
			} else {
				tipoResultadoAux = TipoResultado.NO_EXISTE_TREN;
			}
		}
		return tipoResultadoAux;
	}

	public boolean cargarTren(int numeroTren, int cantidadToneladas) {
		boolean pudeCargar = false;
		if (numeroTren < 0 || cantidadToneladas < 0) {
			System.out.println("ERROR");
		} else {
			Tren trenAux = buscarTren(numeroTren);
			if (trenAux != null) {
				if (trenAux.calcularCapacidadDisponible() > cantidadToneladas) {
					pudeCargar = trenAux.cargarVagones(cantidadToneladas);
				}
			}
		}
		return pudeCargar;
	}

	public void listarCapacidadDisponible() {
		System.out.println("Capacidad disponible en cada tren: ");
		for (Tren tren : listaTrenes) {
			tren.listarCapacidadDisponible();
		}

	}

		
	public int sacarVagonesVacios(int numeroTren) {
		int cantidadVagones = 0;
		Tren trenAux = buscarTren(numeroTren);
		if (trenAux != null) {
			cantidadVagones = trenAux.sacarVagonesVacios();
		}
		return cantidadVagones;
	}

}
