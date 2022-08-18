package ar.edu.ort.tp1.final1.clases;


public class Estacionamiento implements EspacioInteligente<Vehiculo, String>, Mostrable {

	private static final int CANTIDAD_PISOS_MIN = 2;
	private static final int CANTIDAD_CAPACIDAD_MIN = 2;
	private static final int PISO_MOTOS = 1;
	private String nombre;
	private int cantPisos;
	private int capacidadPiso;
	private int lugarDisponible;
	private static final String MSG_PISOS_INVALIDO = "Cantidad de pisos inválida";
	private static final String MSG_CAPACIDAD_INVALIDO = "Capacidad Máxima inválida";
	private Piso[] pisos;
	private LOMotosPorPatente listaMotosXPatente;
	private LOVehiculosXPatente listaVehiculosXPatente;
//	TODO COMPLETAR

	public Estacionamiento(String nombre, int cantPisos, int capacidadPiso) {
		this.nombre = nombre;
		setCantPisos(cantPisos);
		setCapacidadPiso(capacidadPiso);
		pisos = new Piso[cantPisos];
		listaMotosXPatente = new LOMotosPorPatente();
		listaVehiculosXPatente = new LOVehiculosXPatente();
		inicializarPisos();
		inicializarDisponibles();
	}

	private void inicializarPisos() {
		for (int i = 0; i < pisos.length; i++) {
			pisos[i] = new Piso(capacidadPiso);
		}

	}

	private void inicializarDisponibles() {
		this.lugarDisponible = cantPisos * capacidadPiso;
	}

	private void setCantPisos(int cantPisos) {
		if (cantPisos < CANTIDAD_PISOS_MIN) {
			throw new IllegalArgumentException(MSG_PISOS_INVALIDO);
		}
		this.cantPisos = cantPisos;
	}

	private void setCapacidadPiso(int capacidadPiso) {
		if (capacidadPiso < CANTIDAD_CAPACIDAD_MIN) {
			throw new IllegalArgumentException(MSG_CAPACIDAD_INVALIDO);
		}
		this.capacidadPiso = capacidadPiso;
	}

	@Override
	public Vehiculo retirar(String id) {
		Vehiculo vehiculoAux = listaVehiculosXPatente.search(id);
		if (vehiculoAux != null) {
			if (vehiculoAux instanceof Moto) {
				retirarMoto(vehiculoAux);
			} else {
				retirarAuto(vehiculoAux);
			}
		}
		return vehiculoAux;
	}

	public void retirarMoto(Vehiculo elemento) {
		listaMotosXPatente.remove(elemento);
		listaVehiculosXPatente.remove(elemento);
		pisos[PISO_MOTOS].retirar(elemento.getPatente());
		this.lugarDisponible += 1;
	}

	public void retirarAuto(Vehiculo elemento) {
		listaVehiculosXPatente.remove(elemento);
		int i = 0;
		while (i < pisos.length) {
			pisos[i].retirar(elemento.getPatente());
		}
		this.lugarDisponible += 1;
	}

	@Override
	public void agregar(Vehiculo elemento) {
		// SI ES MOTO al 1er piso (Si hay lugar)
		if (elemento instanceof Moto) {
			agregarMoto(elemento);
		} else {
			agregarAuto(elemento);
		}
		// EXCEPCION???
	}

	private boolean agregarMoto(Vehiculo elemento) {
		boolean pudeAgregar = false;
		if (pisos[PISO_MOTOS].lugarDisponible() > 0) {
			listaMotosXPatente.add(elemento);
			listaVehiculosXPatente.add(elemento);
			pisos[PISO_MOTOS].agregar(elemento);
			this.lugarDisponible -= 1;
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	private boolean agregarAuto(Vehiculo elemento) {
		boolean pudeAgregar = false;
		int i = PISO_MOTOS + 1;
		while (i < pisos.length && !pudeAgregar) {
			if (pisos[i].lugarDisponible() > 0) {
				pisos[i].agregar(elemento);
				listaVehiculosXPatente.add(elemento);
				this.lugarDisponible -= 1;
				pudeAgregar = true;
			} else {
				i++;
			}
		}
		return pudeAgregar;
	}

	@Override
	public int lugarDisponible() {
		return this.lugarDisponible;
	}

	@Override
	public void mostrar() {
		System.out.println("Estadísticas del garaje: " + nombre);
		System.out.println("Motos estacionadas por patente:"); 
		for (Vehiculo vehiculo : listaMotosXPatente) {
			System.out.println();
		}// HACER UNA LISTA ORDENAD por NOMBRE
//		TODO COMPLETAR

	}
}
