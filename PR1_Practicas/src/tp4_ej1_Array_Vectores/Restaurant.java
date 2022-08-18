package tp4_ej1_Array_Vectores;

import java.util.ArrayList;

public class Restaurant {

	public static final int CANT_CAJEROS = 5;
	public static final int CANT_ROBOTS = 8;
	private String nombre;
	private ArrayList<Pedido> pedidos;
	private Robot[] robots;
	private Cajero[] cajeros;
	
	public Restaurant(String nombre) {
		super();
		this.nombre = nombre;
		pedidos = new ArrayList<>();
		robots = new Robot[CANT_ROBOTS];
		cajeros = new Cajero[CANT_CAJEROS];
	}
	
	public double[] montosPorCajero() {
		double[] montosPorCajero = new double[CANT_CAJEROS];
		for (Pedido pedido : pedidos) {
			montosPorCajero[pedido.getIdCajero()] += pedido.getMonto();
		}
		return montosPorCajero;
	}
	
	public Informe[] informeDePedidos() {
		Informe[] informesDePedidos = new Informe[this.pedidos.size()];
		double montoAux, nivelBateriaAux;
		String apellidoAux;
		int i = 0;
		for (Pedido pedido : pedidos) {
			montoAux = pedido.getMonto();
			apellidoAux = cajeros[pedido.getIdCajero()].getApellido();
			nivelBateriaAux = robots[buscarRobot(pedido.getCodigoRobot())].getNivelBateria();
			informesDePedidos[i] = new Informe(montoAux, apellidoAux, nivelBateriaAux);
			i++;
		}
		return informesDePedidos;		
	}
	
	private int buscarRobot(String codigoRecibido) {
		int i = 0;
		boolean encontreCodigo = false;
		while (i<robots.length && !encontreCodigo) {
			if (robots[i].getCodigoRobot() == codigoRecibido) {
				encontreCodigo = true;
			}else {
				i++;
			}
		}
		if (!encontreCodigo) {
			i = -1;
		}
		return i;
	}
	
	private String buscarRobotMenosBateria() {
		String minRobot = null;
		double minAux;
		double minNivelBateria = Double.MAX_VALUE;
		for (int i = 0; i < robots.length; i++) {
			minAux = robots[i].getNivelBateria();
			if (minAux < minNivelBateria) {
				minNivelBateria = minAux;
				minRobot = robots[i].getCodigoRobot();
			}
		}
		return minRobot;
	}
	
	public void mostrarPedidosConMasRiesgo() {
		String minRobot = buscarRobotMenosBateria();
		for (Pedido pedido : pedidos) {
			if (pedido.getCodigoRobot() == minRobot) {
				System.out.println(pedido.toString());
			}
		}
	}
	
	public void agregarPedido(Pedido pedidoRecibido) {
		this.pedidos.add(pedidoRecibido);
	}
	
	public void agregarRobot(int i, Robot robotRecibido) {
		this.robots[i] = robotRecibido;
	}
	
	public void agregarCajero(int i, Cajero cajeroRecibido) {
		this.cajeros[i] = cajeroRecibido;
	}
	
	
	
	
	
	
	
	
}
