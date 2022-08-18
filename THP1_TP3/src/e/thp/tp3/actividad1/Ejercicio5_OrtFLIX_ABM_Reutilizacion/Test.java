package e.thp.tp3.actividad1.Ejercicio5_OrtFLIX_ABM_Reutilizacion;

public class Test {

	public static void main(String[] args) {
		Ortflix ortflix = new Ortflix();
		ortflix.listarClientes();
		ortflix.agregarCliente("Cliente 1", "1111", 0, TipoCategoria.STANDARD);
		ortflix.agregarCliente("Cliente 2", "2222", 100, TipoCategoria.PREMIUM);
		ortflix.agregarCliente("Cliente 3", "3333", -100, TipoCategoria.STANDARD);
		ortflix.agregarCliente("Cliente 4", "4444", 0, TipoCategoria.PREMIUM);
		ortflix.listarClientes();
		ortflix.agregarPeliculaStandard("Pelicula Standard 1");
		ortflix.agregarPeliculaStandard("Pelicula Standard 2");
		ortflix.agregarPeliculaStandard("Pelicula Standard 3");
		ortflix.agregarPeliculaPremium("Pelicula Premium 1");
		ortflix.agregarPeliculaPremium("Pelicula Premium 2");
		ortflix.agregarPeliculaPremium("Pelicula Premium 3");
		ortflix.listarPeliculasPremium();
		ortflix.listarPeliculasStandard();
		System.out.println(ortflix.verPelicula("1111", "Pelicula Premium 1"));//CONTENIDO_MO_DISPONIBLE (No tiene Premium)
		System.out.println(ortflix.verPelicula("1111", "Pelicula Standard 1"));//PELICULA OK
		System.out.println(ortflix.verPelicula("2222", "Pelicula Premium 1"));//PELICULA OK
		System.out.println(ortflix.darDeBaja("2222"));//BAJA CLIENTE CON DEUDA
		System.out.println(ortflix.darDeAlta("Cliente 1", "1111", TipoCategoria.STANDARD));//ALTA CLIENTE EXISTENTE
		System.out.println(ortflix.darDeAlta("Cliente 5", "5555", TipoCategoria.STANDARD));//ALTA CLIENTE OK
		System.out.println(ortflix.darDeAlta("Cliente 2", "2222", TipoCategoria.STANDARD));//ALTA CLIENTE CON DEUDA
		ortflix.listaNegraClientes();//Muestra CLiente en la lista Negra
		ortflix.depurarListaNegra(100);//Borra CLientes con menos de 100 de saldo deudor
		ortflix.listaNegraClientes();
	}

}
