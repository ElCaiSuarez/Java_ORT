package oop.alvarez20210923;

public class Test {

	public static void main(String[] args) {

		Fecha fechaHoy = new Fecha(23,9,2021);
		
		/*
		 * Trabajando con atributos publicos (NO ES CORRECTO SOLO LO USAMOS PARA PRACTICAR) 		
		 * fechaHoy.dia = 23;
		 * fechaHoy.mes = 9;
		 * fechaHoy.anio = 2021;
		 */
				
		fechaHoy.mostrarComoCadena();
		String fechaEnFormatoString;
		fechaEnFormatoString = fechaHoy.obtenerComoCadena("-");
		System.out.println(fechaEnFormatoString);
		
		
		Fecha fechaPrimavera = new Fecha(21,9,2021);
		
		/*
		 * Trabajando con atributos publicos (NO ES CORRECTO SOLO LO USAMOS PARA PRACTICAR) 		
		fechaPrimavera.dia = 21;
		fechaPrimavera.mes = 9;
		fechaPrimavera.anio = 2021;
		*/
		
		fechaPrimavera.mostrarComoCadena();
		System.out.println(fechaPrimavera.obtenerComoCadena("-"));

	}

}
