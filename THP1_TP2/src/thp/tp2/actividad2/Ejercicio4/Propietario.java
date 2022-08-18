package thp.tp2.actividad2.Ejercicio4;


public class Propietario {
	private String nombre;
	private String apellido;
	private Vehiculo vehiculo;
	
	
	public Propietario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		//this.vehiculo = vehiculo;
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
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;		
	}
	public void adquirirVehiculo(Vehiculo vehiculo){
		this.vehiculo = vehiculo;
	}
	public void saludar(){
		if (this.vehiculo != null) {
			System.out.println("soy " + this.obtenerNombreCompleto() + " y me compre un " + this.vehiculo.getModelo());	
		}else {
			System.out.println("No tengo auto");
		}
		
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
