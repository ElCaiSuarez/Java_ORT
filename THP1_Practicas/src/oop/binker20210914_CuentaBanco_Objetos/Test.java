package oop.binker20210914_CuentaBanco_Objetos;

public class Test {

	public static void main(String[] args) {
		
		Cuenta cajaPesos, cajaDolares;
		
		//Instanciar un objeto = Crear/Inicializar un objeto (Usando Metodo Contructor)
		cajaPesos = new Cuenta("25658978");
		cajaDolares = new Cuenta("99999999");
		
		//Depositando plata en la cuenta (Usando otros Metodos)
		cajaPesos.depositar(1000);
		cajaDolares.depositar(200);
		
		//Visualizacion saldo (Usando Metodo Getter)
		System.out.println(cajaPesos.getSaldo());
		System.out.println(cajaDolares.getSaldo());
		
		//Depositando plata en la cuenta (Usando otros Metodos)
		cajaPesos.depositar(500);
		cajaDolares.depositar(200);
		
		//Visualizando datos (Usando Metodo toString modificado con @Override) RECOMENDABLE
		System.out.println(cajaPesos);
		System.out.println(cajaDolares);
		
		//Visualizando datos (Usando otros Metodos sin toString con @Override) NO RECOMENDABLE
		System.out.println(cajaPesos.mostrar());
		System.out.println(cajaDolares.mostrar());
		
	}

}

