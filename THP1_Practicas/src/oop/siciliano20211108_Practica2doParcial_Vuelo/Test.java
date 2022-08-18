package oop.siciliano20211108_Practica2doParcial_Vuelo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vuelo vuelo =new Vuelo("AA3313", 180);
		System.out.println(vuelo.reservaBoletos(1111111, 123456789, TipoClase.PRIMERA, "A", 1));
		System.out.println(vuelo.reservaBoletos(2222222, 223456789, TipoClase.TURISTA, "A", 1));
		System.out.println(vuelo.reservaBoletos(3333333, 323456789, TipoClase.PRIMERA, "A", 1));
		System.out.println(vuelo.reservaBoletos(4444444, 413456789, TipoClase.TURISTA, "A", 1));
		System.out.println(vuelo.reservaBoletos(5555555, 523456789, TipoClase.PRIMERA, "A", 1));
		//System.out.println(vuelo.reservaBoletos(6666666, 623456789, TipoClase.PRIMERA, "A", 1));
		
		vuelo.mostrarMontoRecaudadoDeClase(TipoClase.PRIMERA);
	}
}

