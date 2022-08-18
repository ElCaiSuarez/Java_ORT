package oop.binker20210914_CuentaBanco_Objetos;

//Declaracion de la clase cuenta
public class Cuenta {
	//Atributos
	//Declaracion de los atributos (privados) de la clase cuenta
	private double saldo;
	private String dni;
	
	//Metodo - Constructor/es
	public Cuenta(String dni){
		setDni(dni);
		saldo = 0;
	}
	
	//Metodo - Getters/Setters
	public double getSaldo() {
		return saldo;
	}
	
	private void setDni(String dni){
		if(dni.length() >= 8){
		this.dni = dni;
		}
		else {
			dni = "11111111";
		}
	}
	
	//Otros Metodos
	public void depositar(double monto){
		if (monto>0){
			saldo += monto;
		}
	}	
	public String mostrar(){
		return "DNI: " + dni + ", Saldo: " + saldo;
	}
	
	//Metodo - toString
	@Override
	public String toString(){
		return "DNI: " + dni + ", Saldo: " + saldo;
	}
	
	
}