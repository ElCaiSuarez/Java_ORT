package oop.siciliano20211004_PuntoYCirculo_ObjetosConObjetos;

public class TestPlano {

	public static void main(String[] args) {
		//Eje Cartesiano 
		//Eje X Derecha o Izquierda
		//Eje y Arriba o Abajo
		Punto punto1 = new Punto(3,1); 
		Punto punto2 = new Punto(1,1);
		
		System.out.println("Punto antes de mover");
		System.out.println("Punto 1: " + punto1);
		System.out.println("Punto 2: " + punto2);
		
		punto1.moverPunto(4, 6);
		punto2.moverPunto(1, 1);
		
		System.out.println("Punto despues de mover");
		System.out.println("Punto 1: " + punto1);
		System.out.println("Punto 2: " + punto2);
		
		//Ejemplo de objeto punto1 compartido
		Circulo circulo1 = new Circulo(punto1, 5);
		Circulo circulo2 = new Circulo(punto2, 5);
		Circulo circulo3 = new Circulo(punto1, 1);
		
		System.out.println("Circulos antes de mover");
		System.out.println("Circulo 1: " + circulo1);
		System.out.println("Circulo 2: " + circulo2);
		System.out.println("Circulo 3: " + circulo3);
		
		circulo1.moverCirculo(3, 5);
		
		System.out.println("Circulos despues de mover");
		System.out.println("Circulo 1: " + circulo1);
		System.out.println("Circulo 2: " + circulo2);
		System.out.println("Circulo 3: " + circulo3);
		
	}

}

