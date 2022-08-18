package thp.tp2.actividad3.Ejercicio13_RelacionesEntreObjetos;

public class Persona {
	private String nombre;
	private String apellido;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, Computadora computadora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.computadora = computadora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Computadora getComputadora() {
		return computadora;
	}
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	public void actualizarLectora(String marca, boolean puedeGrabar){
		computadora.actualizarLectora(marca, puedeGrabar);
	}
	
	public TipoDVD grabar(LectoraDVD lectoraDVD){
		TipoDVD auxTipoDVD = TipoDVD.SIN_DVD;
		if (lectoraDVD != null) {
			if (this.computadora.getLectoraDVD().isPuedeGrabar()) {
				auxTipoDVD = TipoDVD.GRABACION_OK;
			}else {
				auxTipoDVD = TipoDVD.UNIDAD_SIN_GRABADO;
			}
		}
		return auxTipoDVD;
	}
	public void mostrarComputadora(Computadora computadora){
		System.out.println(computadora.toString());
	}
			
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", computadora=" + computadora + "]";
	}
	
	
}
