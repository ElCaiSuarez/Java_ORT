package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// EMail mail = new EMail("pirulo@gmail.com");
		// System.out.println(mail.getCuenta());
		// System.out.println(mail.getDominio());
		// System.out.println(mail.getValor());
		Persona messi = new Persona("Messi", "Lionel");

		EMail mail = new EMail("lio@messi.com");
		messi.agregarMail(mail);
		// LOS NUMEROS TELEFONICOS DEBERIAN SER STRING, ya que no se puede usar un 0 al
		// comienzo de un int
		NumeroTelefonico telefono1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico telefono2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico telefono3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		messi.agregarTelefono(telefono1);
		messi.agregarTelefono(telefono2);
		messi.agregarTelefono(telefono3);

		messi.mostrarTodo();
	}

}
