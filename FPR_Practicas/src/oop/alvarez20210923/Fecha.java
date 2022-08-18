package oop.alvarez20210923;

public class Fecha {
	//1RO ATRIBUTOS
	private int dia, mes, anio;
	
	//2DO CONSTRUCTOR
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	//3RO GETTERS y SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
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

	//4TO OTROS METODOS
	public void mostrarComoCadena (){
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}
	
	public String obtenerComoCadena(String separador) {
		String fechaEnCadena;
		fechaEnCadena = this.dia + separador + this.mes + separador + this.anio;
		return  fechaEnCadena;
	}
	
	//5TO TOSTRING / EQUALS y HASHCODE
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
}
