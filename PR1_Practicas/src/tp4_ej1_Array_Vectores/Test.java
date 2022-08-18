package tp4_ej1_Array_Vectores;

public class Test {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant("Restaurant");
		Pedido pedido1 = new Pedido("Cliente1", 0, "1AF0", 500);
		Pedido pedido2 = new Pedido("Cliente2", 0, "1AF1", 1500);
		Pedido pedido3 = new Pedido("Cliente3", 1, "1AF2", 1000);
		Pedido pedido4 = new Pedido("Cliente4", 1, "1AF3", 500);
		Pedido pedido5 = new Pedido("Cliente5", 2, "1AF4", 1500);
		Pedido pedido6 = new Pedido("Cliente6", 3, "1AF5", 1000);
		Pedido pedido7 = new Pedido("Cliente7", 4, "1AF6", 2500);
		Pedido pedido8 = new Pedido("Cliente8", 4, "1AF7", 2000);
		Pedido pedido9 = new Pedido("Cliente9", 3, "1AF7", 3500);
		Pedido pedido10 = new Pedido("Cliente10", 2, "1AF7", 4500);
		Cajero cajero1 = new Cajero("Apellido1", 20);
		Cajero cajero2 = new Cajero("Apellido2", 20);
		Cajero cajero3 = new Cajero("Apellido3", 20);
		Cajero cajero4 = new Cajero("Apellido4", 20);
		Cajero cajero5 = new Cajero("Apellido5", 20);
		Robot robot1 = new Robot("1AF0", 50.5);
		Robot robot2 = new Robot("1AF1", 55.5);
		Robot robot3 = new Robot("1AF2", 60.5);
		Robot robot4 = new Robot("1AF3", 70.5);
		Robot robot5 = new Robot("1AF4", 10.5);
		Robot robot6 = new Robot("1AF5", 40.5);
		Robot robot7 = new Robot("1AF6", 30.5);
		Robot robot8 = new Robot("1AF7", 20.5);
		
		restaurant.agregarCajero(0, cajero1);
		restaurant.agregarCajero(1, cajero2);
		restaurant.agregarCajero(2, cajero3);
		restaurant.agregarCajero(3, cajero4);
		restaurant.agregarCajero(4, cajero5);
		
		restaurant.agregarRobot(0, robot1);
		restaurant.agregarRobot(1, robot2);
		restaurant.agregarRobot(2, robot3);
		restaurant.agregarRobot(3, robot4);
		restaurant.agregarRobot(4, robot5);
		restaurant.agregarRobot(5, robot6);
		restaurant.agregarRobot(6, robot7);
		restaurant.agregarRobot(7, robot8);
		
		restaurant.agregarPedido(pedido1);
		restaurant.agregarPedido(pedido2);
		restaurant.agregarPedido(pedido3);
		restaurant.agregarPedido(pedido4);
		restaurant.agregarPedido(pedido5);
		restaurant.agregarPedido(pedido6);
		restaurant.agregarPedido(pedido7);
		restaurant.agregarPedido(pedido8);
		restaurant.agregarPedido(pedido9);
		restaurant.agregarPedido(pedido10);
		
		
		double[] montosPorCajero= restaurant.montosPorCajero();
		for (int i = 0; i < montosPorCajero.length; i++) {
			System.out.println(montosPorCajero[i]);
		}
		Informe[] informesDePedidos = restaurant.informeDePedidos();
		for (int i = 0; i < informesDePedidos.length; i++) {
			System.out.println(informesDePedidos[i]);
		}
		restaurant.mostrarPedidosConMasRiesgo();
		
	}

}
