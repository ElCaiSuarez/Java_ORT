package thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums;

public class Domicilio {
	//ATRIBUTOS
	private static final int MIN_ALTURA = 0;
	private String calle;
	private int altura;
	private String barrio;
	
	//CONSTRUCTOR
	public Domicilio(String calle, int altura, String barrio) {
		//super();
		//this.calle = calle;
		setCalle(calle);
		//Modifico el constructor que automatiza el IDE por el seters que valida altura
		//this.altura = altura;
		setAltura(altura);
		//this.barrio = barrio;
		setBarrio(barrio);
	}
	//GETTERS y SETTERS
	public String getCalle() {
		return calle;
	}
	private void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	//Ejemplo de validacion con atributo estatico (Similar a las variables constantes pero de una clase)
	public void setAltura(int altura) {
		if (altura > MIN_ALTURA){
			this.altura = altura;
		}else{
			this.altura = MIN_ALTURA;
			}
	}
	public String getBarrio() {
		return barrio;
	}
	private void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	//TO STRING
	@Override
	public String toString() {
		//return "Domicilio [calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + "]";
		return calle + " " + altura + ", " + barrio;
	}
}
