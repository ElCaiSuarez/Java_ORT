package ar.edu.ort.tp1.final1.clases;

public class Moto extends Vehiculo{
	
	private TipoMoto tipoMoto;
	
	public Moto(String patente, String marca, String modelo, TipoMoto tipoMoto) {
		super(patente, marca, modelo);
		setTipoMoto(tipoMoto);
	}

	private void setTipoMoto(TipoMoto tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	

	@Override
	public double calcularIndice() {
		// TODO Auto-generated method stub
		return this.tipoMoto.getIndice();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	
}
