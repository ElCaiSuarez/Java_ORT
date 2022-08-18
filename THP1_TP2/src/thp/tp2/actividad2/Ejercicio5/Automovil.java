package thp.tp2.actividad2.Ejercicio5;

public class Automovil {
	private String marca, modelo, patente;
	private double capacidadTanque, cantidadDeCombustible, rendimientoPorLitro;
	
	
	
	
	public Automovil(String marca, String modelo, String patente, double capacidadTanque, double cantidadDeCombustible,
			double rendimientoPorLitro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
		this.cantidadDeCombustible = cantidadDeCombustible;
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	
	
	
	
	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public String getModelo() {
		return modelo;
	}





	public void setModelo(String modelo) {
		this.modelo = modelo;
	}





	public String getPatente() {
		return patente;
	}





	public void setPatente(String patente) {
		this.patente = patente;
	}





	public double getCapacidadTanque() {
		return capacidadTanque;
	}





	public void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}





	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}





	public void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}





	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}





	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}





	private double calcularConsumo(double cantKilometros){
		double Aux = 0;
		return Aux;
	}
	
	private double calcularDistancia(double cantLitros){
		double Aux = 0;
		return Aux;
	}
	private double consumirCombustible(double cantLitros){
		double Aux = 0;
		return Aux;
	}
	public double viajar(double cantKilometros){
		double Aux = 0;
		return Aux;
	}
	public boolean cargarCombustible(double cantLitros){
		boolean Aux = false;
		return Aux;
	}
	private double espacioDisponible(){
		double Aux = 0;
		return Aux;
	}
	public boolean pocoCombustible(){
		boolean Aux = false;
		return Aux;
	}





	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}
	
	
}
