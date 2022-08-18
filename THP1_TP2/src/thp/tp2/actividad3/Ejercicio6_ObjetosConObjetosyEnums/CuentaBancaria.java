package thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums;

import java.time.LocalDate;

public class CuentaBancaria {
	// ATRIBUTOS ESTATICOS (Solo se usaran para la instanciacion) Simil a
	// Constantes
	private final static double MIN_SALDO = 0;
	// ATRIBUTOS
	private int cbu;
	private TipoCuentaBancaria tipoCuentaBancaria;
	private double saldo;
	private Persona titular;
	private LocalDate fechaApertura;

	// CONSTRUCTOR AVANZADO
	public CuentaBancaria(TipoCuentaBancaria tipoCuentaBancaria, Persona titular) {
		// super();
		// this.cbu = cbu;
		// cbu = generarCbu();
		setCbu(generarCbu(titular.getDni()));
		// this.tipoCuentaBancaria = tipoCuentaBancaria;
		setTipoCuentaBancaria(tipoCuentaBancaria);
		// this.saldo = saldo;
		// saldo = 0;
		setSaldo(obtenerSaldoInicial());
		// this.fechaApertura = fechaApertura;
		// fechaApertura = obtenerFechaDeHoy();
		// setFechaApertura(obtenerFechaDeHoy());
		// Ejemplo de LOCALDATE
		setFechaApertura(obtenerFechaDeHoy());
		// this.titular = titular;
		setTitular(titular);
	}

	// GETERS PUBLICOS (Solo los necesarios) Y SETERS PRIVADOS
	public int getCbu() {
		return cbu;
	}

	private void setCbu(int cbu) {
		this.cbu = cbu;
	}

	public TipoCuentaBancaria getTipoCuentaBancaria() {
		return tipoCuentaBancaria;
	}

	private void setTipoCuentaBancaria(TipoCuentaBancaria tipoCuentaBancaria) {
		this.tipoCuentaBancaria = tipoCuentaBancaria;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
	 * public LocalDate getFechaApertura() { return fechaApertura; }
	 */

	private void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Persona getTitular() {
		return titular;
	}

	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	// OTROS METODOS
	// PRIVADOS y ESTATICOS DONDE NO USAMOS ATRIBUTOS DE LOS OBJETOS CREADOS POR
	// LA CLASE
	private static LocalDate obtenerFechaDeHoy() {
		return LocalDate.now();
	}

	private static int generarCbu(int dni) {
		return dni * ((int) (Math.random() * 3 + 2)) + 1000000000;
	}

	private static double obtenerSaldoInicial() {
		return MIN_SALDO;
	}

	// PUBLICOS y NO ESTATICOS DONDE USAMOS ATRIBUTOS DE LOS OBJETOS CREADOS POR
	// LA CLASE
	public double verSaldo() {
		return getSaldo();
	}

	public void depositar(double deposito) {
		if (deposito > 0) {
			saldo += deposito;
		}
	}

	public boolean extraer(double extraccion) {
		boolean pudeExtraer = false;
		if (extraccion <= saldo) {
			saldo -= extraccion;
			pudeExtraer = true;
		}
		return pudeExtraer;
	}

	// TO STRING
	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipoCuentaBancaria=" + tipoCuentaBancaria + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", titular=" + titular + "]";
	}
}
