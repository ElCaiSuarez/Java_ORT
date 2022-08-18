package thp.tp2.actividad3.Ejercicio12_UsoFechaLOCALDATE;

public class ImpresoraMonocromatica {
	private boolean estaEncendida = false;
	private int cantidadHojasBandeja = 0, nivelTintaNegra = 100;
	
	public int devuelveNivelTintaNegra(){
		return this.nivelTintaNegra;
	}
	
	public void imprimir(Documento documento){
		if (estaEncendida && documento != null) {
			int auxPuntos = contarPuntosTinta(contarCadena(documento.getCuerpo()));
			if (auxPuntos <= this.nivelTintaNegra && this.cantidadHojasBandeja > 1){
					System.out.println("Fecha: " + documento.getFecha() + "             **" + documento.getTitulo() + "**");
					System.out.println(documento.getCuerpo());
					descontarTinta(auxPuntos);
		}
		
		}else if (!estaEncendida) {
			System.out.println("Impresora apagada");
		}
		
	}
	public void encender(){
		if (!estaEncendida) {
			this.estaEncendida = true;
			System.out.println("Impresora encendida");
		}else {
			System.out.println("ERROR! Ya se encuentra encendida");
		}
	}
	public void apagar(){
		if (estaEncendida) {
			this.estaEncendida = false;
			System.out.println("Impresora apagada");
		}else {
			System.out.println("ERROR! Ya se encuentra apagada");
		}
	}
	public int contarCadena(String cadena){
		return cadena.length();
	}
	public int contarPuntosTinta(int cantCaracteres){
		return cantCaracteres / 50;
	}
	public void descontarTinta(int puntos){
		if (puntos > 0){
		this.nivelTintaNegra -= puntos;
	}
	}
	public void descontarHoja(){
		this.cantidadHojasBandeja --;
	}
	public void recargarBandeja(int cantHojas){
		if (cantHojas > 0){
			int auxMax = this.cantidadHojasBandeja + cantHojas;
			if (auxMax < 35) {
				this.cantidadHojasBandeja =+ cantHojas;
			}
		}
	}
	
}
