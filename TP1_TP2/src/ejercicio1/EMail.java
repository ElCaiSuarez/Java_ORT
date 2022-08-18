package ejercicio1;

public class EMail {
	// private String mail;
	private String cuenta;
	private String dominio;

	public String getValor() {
		return cuenta + "@" + dominio;
	}

	private void setMail(String mail) {
		setCuentaYDominio(mail);
	}

	public EMail(String mail) {
		// super();
		setMail(mail);
	}

	private void setCuentaYDominio(String mail) {
		String[] temporal = mail.split("@");
		cuenta = temporal[0];
		dominio = temporal[1];
	}

	public String getCuenta() {
		return this.cuenta;
	}

	public String getDominio() {
		return this.dominio;
	}

}
