package thp.tp2.actividad3.Ejercicio13_RelacionesEntreObjetos;

public class Computadora {
	private String marca;
	private TipoPC tipoPc;
	private Procesador procesador;
	private LectoraDVD lectoraDVD;
	
	public Computadora(String marca, TipoPC tipoPc, Procesador procesador, LectoraDVD lectoraDVD) {
		//super();
		this.marca = marca;
		this.tipoPc = tipoPc;
		this.procesador = procesador;
		this.lectoraDVD = lectoraDVD;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public TipoPC getTipoPc() {
		return tipoPc;
	}
	public void setTipoPc(TipoPC tipoPc) {
		this.tipoPc = tipoPc;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public LectoraDVD getLectoraDVD() {
		return lectoraDVD;
	}
	public void setLectoraDVD(LectoraDVD lectoraDVD) {
		this.lectoraDVD = lectoraDVD;
	}
	
	public void actualizarLectora(String marca, boolean puedeGrabar){
		lectoraDVD.actualizarLectora(marca, puedeGrabar);
	}
	
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipoPc=" + tipoPc + ", procesador=" + procesador + ", lectoraDVD="
				+ lectoraDVD + "]";
	}
	
	
}
