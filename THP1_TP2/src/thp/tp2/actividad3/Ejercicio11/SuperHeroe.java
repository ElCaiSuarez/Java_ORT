package thp.tp2.actividad3.Ejercicio11;

public class SuperHeroe {
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	private final int MINIMO = 0, MAXIMO = 100;
	private String nombre;

	public SuperHeroe(int fuerza, int resistencia, int superpoderes, String nombre) {
		super();
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
		setNombre(nombre);
	}
	
	public int getFuerza() {
		return fuerza;
	}
	private void setFuerza(int fuerza) {
		validacionHablidad(this.fuerza, fuerza);
	}
	public int getResistencia() {
		return resistencia;
	}
	private void setResistencia(int resistencia) {
		validacionHablidad(this.resistencia, resistencia);
	}
	public int getSuperpoderes() {
		return superpoderes;
	}
	private void setSuperpoderes(int superpoderes) {
		validacionHablidad(this.superpoderes, superpoderes);
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}else {
			this.nombre = "";	
		}
	}
	
	private void validacionHablidad(int habilidadAtributo, int habilidadParametro){
		if (habilidadParametro < MINIMO) {
			habilidadAtributo = MINIMO;
		}else if (habilidadParametro > MAXIMO) {
			habilidadAtributo = MAXIMO;
		}else {
			habilidadAtributo = habilidadParametro;
		}
	}
	
	private int resultadoXHabilidad(int habilidadAtributo, int habilidadParametro){
		int resultado = 0;
		if (habilidadAtributo > habilidadParametro) {
			resultado = 1;
		}else if (habilidadAtributo < habilidadParametro) {
			resultado = -1;
		}
		return resultado;
	}
	//SIN TERMINAR
	public ResultadoCompeticion competir(SuperHeroe superHeroe){
		ResultadoCompeticion resultado = ResultadoCompeticion.DERROTA;
		int primerResultado = resultadoXHabilidad(fuerza, superHeroe.getFuerza());
		int segundoResultado = resultadoXHabilidad(resistencia, superHeroe.getResistencia());
		int tercerResultado = resultadoXHabilidad(superpoderes, superHeroe.getSuperpoderes());
		//resultado >=1 GANO
		//resultado =0 EMPATO
		//resultado >1 DERROTA
		int competir = primerResultado + segundoResultado + tercerResultado;
		if (competir >= 1) {
			resultado = ResultadoCompeticion.TRIUNFO;
		}else if (competir == 0 || competir == -1) {
			resultado = ResultadoCompeticion.EMPATE;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "SuperHeroe [fuerza=" + fuerza + ", resistencia=" + resistencia + ", superpoderes=" + superpoderes
				+ ", nombre=" + nombre + "]";
	}
	
	
	
}
