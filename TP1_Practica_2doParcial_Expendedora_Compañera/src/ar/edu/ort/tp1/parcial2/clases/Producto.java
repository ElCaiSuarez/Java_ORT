package ar.edu.ort.tp1.parcial2.clases;

import javax.management.RuntimeErrorException;

import ort.tp1.tdas.implementaciones.PilaNodos;
import ort.tp1.tdas.interfaces.Pila;

public class Producto implements Apreciable, Identificable<Integer> {

	private static final String MSJ_AJUSTE_INVALIDO = "Actualizacion Invalido";
	private final static String MSJ_PRECIO_INVALIDO = "Precio Invalido";
	private final static String MSJ_NOMBRE_INVALIDO = "Nombre Invalido";
	private static final String MSJ_ID_INVALIDO = "ID Invalido";
	private Integer id;
	private String nombre;
	private double precioInicial;
	private Pila<HistoricoActualizacion> historicoActualizaciones;

	public Producto(Integer id, double precioInicial, String nombre) {
		setId(id);
		setNombre(nombre);
		setPrecio(precioInicial);
		historicoActualizaciones = new PilaNodos<>();
	}
	
	private void setPrecio(double precio) {
		aplicarActualizacion(new ActualizacionDirecta(precio));
	}

	private void setId(Integer id) {
		if(id < 1) {
			throw new RuntimeException(MSJ_ID_INVALIDO);
		}
		this.id=id;
		
	}

	private void setNombre(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			throw new RuntimeException(MSJ_NOMBRE_INVALIDO);
		}
			this.nombre=nombre;
		
	}

	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public boolean mismoId(Integer otroId) {
		return otroId.equals(id);
	}
	
	public String getNombre() {
		return nombre;
	}

	public double obtenerPrecio() {
		double ultimoPrecio = 0;
		if (!historicoActualizaciones.isEmpty()) {
			ultimoPrecio = historicoActualizaciones.peek().getPrecio();
		}
		return ultimoPrecio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + obtenerPrecio() + ", nombre=" + nombre + "]";
	}

	@Override
	public void aplicarActualizacion(Actualizacion actualizacion) throws RuntimeException {
		if (actualizacion == null) {
			throw new RuntimeException(MSJ_AJUSTE_INVALIDO);
		}
		double precio = obtenerPrecio();
		double nuevoPrecio = 0;
		if(actualizacion instanceof ActualizacionDirecta) {
			ActualizacionDirecta actualizacionDire = (ActualizacionDirecta) actualizacion;
			nuevoPrecio = actualizacionDire.obtenerValorCalculado();
		} else {
			ActualizacionExtendida actualizacionExt = (ActualizacionExtendida) actualizacion;
			nuevoPrecio = actualizacionExt.obtenerValorCalculado(precio);
		}
		
		if (nuevoPrecio < 0) {
			throw new RuntimeException(MSJ_PRECIO_INVALIDO);
		}
		this.historicoActualizaciones.push(new HistoricoActualizacion(actualizacion, precio, nuevoPrecio));
	}

	public void listarActualizacionesDePrecio() {
		HistoricoActualizacion histo = historicoActualizaciones.pop();
		Pila<HistoricoActualizacion> pilaExtra = new PilaNodos<>();
		System.out.println("Mostrando Actualizaciones: ");
		while(!historicoActualizaciones.isEmpty()) {
			pilaExtra.push(histo);
			histo = historicoActualizaciones.pop();
		}
		llenarHistorial(pilaExtra);
	}
	
	private void llenarHistorial(Pila<HistoricoActualizacion> pilaExtra) {
		HistoricoActualizacion histo = pilaExtra.pop();
		while(!pilaExtra.isEmpty()) {
			System.out.println(histo);
			historicoActualizaciones.push(histo);
			histo = pilaExtra.pop();
		}
	}
	
}