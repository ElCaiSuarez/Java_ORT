package oop.alvarez20210930.fecha;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1900;
	}
	
	public Fecha(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public Fecha(int dia, int mes, int anio) {
		this.setFecha(dia,mes,anio);
	}

	public Fecha(int anio) {
		this.dia = 1;
		this.mes = 1;
		this.setAnio(anio);
	}
	
	public void setFecha(int dia, int mes, int anio) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAnio(anio);
	}
	
	
	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		if (dia >=1 && dia <= 30) {
			this.dia = dia;
		}
	}

	public void mostrarComoCadena() {
		System.out.println(this.toString());
	}
	
	public void mostrarComoCadena(String conector) {
		System.out.println(this.toString(conector));
		//System.out.println(this.obtenerComoCadena(conector));
		//System.out.println(dia + "/" + mes + "/" + anio);
		//String fechaEnCadena;
		//fechaEnCadena = "01/01/0001";
	}
	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return this.toString("/");
	}

	public String toString(String separador) {
		return this.getDia() + separador + this.getMes() + separador + this.getAnio();
	}
	

}
