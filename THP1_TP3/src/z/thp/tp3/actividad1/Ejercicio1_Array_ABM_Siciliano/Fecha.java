package z.thp.tp3.actividad1.Ejercicio1_Array_ABM_Siciliano;


public class Fecha {
	private static final int MES_MIN = 1, MES_MAX = 12;
	private int dia;
	private int mes;
	private int anio;
	
	
	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	public int getDia() {
		return dia;
	}
	//Metodo Set Privado
	private void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	
	//Ejemplo de validacion con atributo estatico (Similar a las variables constantes pero de una clase)
	private void setMes(int mes) {
		if (mes < MES_MIN) {
			this.mes = MES_MIN;
		}else if (mes > MES_MAX) {
			this.mes = MES_MAX;
		}else {
			this.mes = mes;
		}
	}
	public int getAnio() {
		return anio;
	}
	private void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		//return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
		return dia + "/" + mes + "/" + anio;
	}
}
