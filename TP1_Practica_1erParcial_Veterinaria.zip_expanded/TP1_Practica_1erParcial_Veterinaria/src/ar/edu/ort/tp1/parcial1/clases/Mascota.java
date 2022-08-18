package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias ten�a hambre";
	private static final String MSG_COM_ENFERMO = " dice: No ten�a mucha hambre, pero gracias";

	private static final int CIEN = 100;
	private String nombre;
	private double peso;
	private boolean vacuna;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacuna, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacuna = vacuna;
		setEstado(estado);
	}

	public Mascota() {

	}

	private Estado getEstado() {
		return estado;
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isVacuna() {
		return vacuna;
	}

	public void setVacuna() {
		this.vacuna = true;
	}

	// Metodo abstracto, implementado en las subclases porque tienen distinto
	// comportamiento
	public abstract void defecar();

	// Metodo llamado desde las subclases, ya que el atributo PORCENTAJE es
	// diferente en cada Subclase
	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	// Metodo llamado desde las subclases, ya que el atributo MULTIPLICADOR es
	// diferente en cada Subclase
	public void comer(double comida, double multiplicador) {
		if (getEstado() == Estado.FELIZ) {
			System.out.printf(MSG_COM_FELIZ, getEstado().getDescripcion());
			setEstado(Estado.ENFERMO);
		} else if (getEstado() == Estado.HAMBRIENTO) {
			System.out.printf(MSG_COM_HAMBRIENTO, getEstado().getDescripcion());
			setEstado(Estado.FELIZ);
		} else {
			System.out.printf(MSG_COM_ENFERMO, getEstado().getDescripcion());
		}
		this.peso += comida * multiplicador;
	}

}
