package thp.tp2.actividad3.Ejercicio12_UsoFechaLOCALDATE;

import thp.tp2.actividad3.Ejercicio6_ObjetosConObjetosyEnums.Fecha;

public class Test {

	public static void main(String[] args) {
		ImpresoraMonocromatica lexmark1 = new ImpresoraMonocromatica();
		Fecha fecha = new Fecha(12, 06, 2021);
		Documento hoja1 = new Documento("HOLA", "Este es el cuerpo", fecha);
		System.out.println(lexmark1.devuelveNivelTintaNegra());
		lexmark1.imprimir(hoja1);
		lexmark1.encender();
		lexmark1.imprimir(hoja1);
		lexmark1.recargarBandeja(5);
		lexmark1.imprimir(hoja1);
		System.out.println(lexmark1.devuelveNivelTintaNegra());

	}

}
