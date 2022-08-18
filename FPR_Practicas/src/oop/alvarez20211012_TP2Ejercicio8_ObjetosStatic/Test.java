package oop.alvarez20211012_TP2Ejercicio8_ObjetosStatic;

public class Test {

	public static void main(String[] args) {
		
		Turnera turnera = new Turnera();
		System.out.println("Ultimo numero " + turnera.verUltimoNumeroOtorgado());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		System.out.println("Otorgo numero " + turnera.otorgarProximoNumero());
		turnera.resetearContador(50);
		System.out.println("Ultimo numero " + turnera.verUltimoNumeroOtorgado());
		turnera.resetearContador();
		System.out.println("Ultimo numero " + turnera.verUltimoNumeroOtorgado());
		// CON STATIC SIN INSTANCIAR UN OBJETO, TRABAJANDO DIRECTAMENTE CON LA CLASE
		//Turnera turnera = new Turnera();
		System.out.println();
		System.out.println("Ultimo numero " + TurneraEstatica.verUltimoNumeroOtorgado());
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		System.out.println("Otorgo numero " + TurneraEstatica.verProximoNumeroAOtorgar());
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		TurneraEstatica.resetearContador(999);
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		System.out.println("Otorgo numero " + TurneraEstatica.otorgarProximoNumero());
		TurneraEstatica.resetearContador(50);
		System.out.println("Ultimo numero " + TurneraEstatica.verUltimoNumeroOtorgado());
		TurneraEstatica.resetearContador();
		System.out.println("Ultimo numero " + TurneraEstatica.verUltimoNumeroOtorgado());
		
		
		
		
		
	}

}
