package segundo.parcial;

public class Test {

	public static void main(String[] args) {
		Aplicacion aplicacionTrenes = new Aplicacion();//Instancio la clase Aplicacion
		//llamo al metodo publico crearFormacion de la clase Aplicacion que devuelve numero de Tren
		int numeroTren1 = aplicacionTrenes.crearFormacion();
		System.out.println("Tren creado numero: " +numeroTren1);//Numero Tren 1 (Correlativo listaTrenes.size()+1)
		int numeroTren2 = aplicacionTrenes.crearFormacion();
		System.out.println("Tren creado numero: " +numeroTren2);//Numero Tren 2 (Correlativo listaTrenes.size()+1)
		System.out.println();
		//llamo al metodo publico agregarVagones de la clase Aplicacion que devuelve un TipoResultado
		System.out.println(aplicacionTrenes.agregarVagones(numeroTren1, 5, TipoVagon.MEDIUM));//AGREGADO_OK
		System.out.println(aplicacionTrenes.agregarVagones(numeroTren1, 7, TipoVagon.LARGE));//AGREGADO_OK
		System.out.println(aplicacionTrenes.agregarVagones(numeroTren2, 20, TipoVagon.SMALL));//AGREGADO_OK
		System.out.println(aplicacionTrenes.agregarVagones(numeroTren1, 20, TipoVagon.MEDIUM));//CANT_VAGONES_INVALIDA
		System.out.println(aplicacionTrenes.agregarVagones(999, 5, TipoVagon.MEDIUM));//NO_EXISTE_TREN
		System.out.println();
		//llamo al metodo publico cargarTren de la clase Aplicacion que devuelve un Boolean
		System.out.println(aplicacionTrenes.cargarTren(numeroTren1, 165));//True
		System.out.println(aplicacionTrenes.cargarTren(numeroTren1, 200));//True
		System.out.println(aplicacionTrenes.cargarTren(numeroTren2, 240));//True
		System.out.println(aplicacionTrenes.cargarTren(numeroTren2, 1000));//False
		System.out.println(aplicacionTrenes.cargarTren(999, 10));//False
		System.out.println();
		//llamo al metodo publico listarCapacidadDisponible de la clase Aplicacion que muestra por pantallala capacidad disponible de los trenes
		aplicacionTrenes.listarCapacidadDisponible();
		System.out.println();
		//llamo al metodo publico sacarVagonesVacios de la clase Aplicacion que devuelve la cantidad de vagones vacios removidos
		System.out.println(aplicacionTrenes.sacarVagonesVacios(numeroTren1));//Remove de 3 Vagones vacios
		System.out.println(aplicacionTrenes.sacarVagonesVacios(numeroTren1));//Remove de 0 Vagones vacios
		System.out.println(aplicacionTrenes.sacarVagonesVacios(999));//Remove de 0 Vagones vacios
		
	
	}

}
