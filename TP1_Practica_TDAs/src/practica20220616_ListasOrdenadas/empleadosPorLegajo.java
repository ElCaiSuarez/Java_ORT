package practica20220616_ListasOrdenadas;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class empleadosPorLegajo extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado dato1, Empleado dato2) {
		
		return dato1.getLegajo().compareTo(dato2.getLegajo());
	}

	@Override
	public int compareByKey(String clave, Empleado elemento) {
		// TODO Auto-generated method stub
		return clave.compareTo(elemento.getLegajo());
	}

}
