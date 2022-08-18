package parcial;

public class Main {

	public static void main(String[] args) {
		Pedido p = new Pedido(TipoPedido.POR_MENOR);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales Kelox", 10, "Certificadora zaraza"), 3);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.LACTEO, "Pan Lactalinda", 22, "Certificadora zaraza"), 7);
		p.agregarProducto(
				new ProductoSinTacc(FamiliaProducto.PANIFICADO, "Cereales Kelox", 105, "Certificadora zaraza"), 2);
		p.agregarProducto(new ProductoConTacc(FamiliaProducto.REPOSTERO, "Budin de Limon", 123), 2);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales AllBrain", 98, "Certificadora zaraza"),
				1);
		p.mostrar();
		System.out.printf("\n\n\n---------------------------------------------------\n\n");
		p = new Pedido(TipoPedido.POR_MAYOR);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales Kelox", 10, "Certificadora zaraza"), 8);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.LACTEO, "Pan Lactalinda", 22, "Certificadora zaraza"), 22);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.PANIFICADO, "Cereales Kelox", 105, "Certificadora zaraza"), 1);
		p.agregarProducto(new ProductoSinTacc(FamiliaProducto.CEREAL, "Cereales AllBrain", 98, "Certificadora zaraza"), 21);
		p.mostrar();
		
		
		
	}

}
