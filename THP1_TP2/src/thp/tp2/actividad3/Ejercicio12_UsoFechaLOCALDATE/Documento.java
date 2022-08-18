package thp.tp2.actividad3.Ejercicio12_UsoFechaLOCALDATE;

import thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums.Fecha;

public class Documento {
	private String titulo, cuerpo;
	private Fecha fecha;
	
	public Documento(String titulo, String cuerpo, Fecha fecha) {
		//super();
		setTitulo(titulo);
		setCuerpo(cuerpo);
		setFecha(fecha);
		}
	public String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	private void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public Fecha getFecha() {
		return fecha;
	}
	private void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
		
	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", cuerpo=" + cuerpo + ", fecha=" + fecha + "]";
	}
	
	
}
	
