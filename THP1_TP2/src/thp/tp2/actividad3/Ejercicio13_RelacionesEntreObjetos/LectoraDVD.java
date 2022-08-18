package thp.tp2.actividad3.Ejercicio13_RelacionesEntreObjetos;

public class LectoraDVD {
	private String marca;
	private boolean puedeGrabar;
	
	
	public LectoraDVD(String marca, boolean puedeGrabar) {
		super();
		this.marca = marca;
		this.puedeGrabar = puedeGrabar;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isPuedeGrabar() {
		return puedeGrabar;
	}
	public void setPuedeGrabar(boolean puedeGrabar) {
		this.puedeGrabar = puedeGrabar;
	}
	
	public void actualizarLectora(String marca, boolean puedeGrabar){
		setMarca(marca);
		setPuedeGrabar(puedeGrabar);
	}
	
	@Override
	public String toString() {
		return "LectoraDVD [marca=" + marca + ", puedeGrabar=" + puedeGrabar + "]";
	}
	
	
}
