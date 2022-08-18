package thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums;

public class Test {

	public static void main(String[] args) {

		Domicilio domicilio1 = new Domicilio("Irigoyen", 1006, "Versalles");
		System.out.println(domicilio1);

		// Ejemplo de creacion de objeto Persona con objeto fecha y domicilio
		Persona persona1 = new Persona(29543755, "Juan", "Suarez", new Fecha(4, 6, 1982), domicilio1);
		Persona persona2 = new Persona(28548880, "Ana", "Rodriguez", new Fecha(19, 1, 1982), domicilio1);
		System.out.println(persona1);
		System.out.println(persona2);

		CuentaBancaria cuenta1, cuenta2;
		cuenta1 = new CuentaBancaria(TipoCuentaBancaria.CAJA_AHORRO, persona1);
		cuenta2 = new CuentaBancaria(TipoCuentaBancaria.CUENTA_CORRIENTE, persona2);
		System.out.println(cuenta1);
		System.out.println(cuenta2);

		cuenta1.depositar(1000);
		System.out.println(cuenta1.verSaldo());
		cuenta2.depositar(2000);
		System.out.println(cuenta2.verSaldo());

		// System.out.println(cuenta1.extraer(500) ? "Retire su dinero, saldo actual: "
		// + cuenta1.verSaldo() : "Saldo Insuficiente");
		// System.out.println(cuenta1.extraer(1000) ? "Retire su dinero, saldo actual: "
		// + cuenta1.verSaldo() : "Saldo Insuficiente");
		opExtraer(cuenta1, 500);
		opExtraer(cuenta1, 1000);
		opExtraer(cuenta2, 2000);

	}

	static void opExtraer(CuentaBancaria cuenta, double monto) {
		System.out.println(
				cuenta.extraer(monto) ? "Retire su dinero, saldo actual: " + cuenta.verSaldo() : "Saldo Insuficiente");
	}
}
