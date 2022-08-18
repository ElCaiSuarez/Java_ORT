package f.thp.tp3.actividad1.Ejercicio6_MusicAPP_LocalDate;

public class Test {

	public static void main(String[] args) {
		MusicApp musicApp = new MusicApp();
		musicApp.altaUsuario("Email1", "Apellido1", 31, TipoUsuario.PREMIUM);
		musicApp.altaUsuario("Email2", "Apellido2", 32, TipoUsuario.GRATUITO);
		musicApp.altaUsuario("Email3", "Apellido3", 33, TipoUsuario.REGISTRADO);

		musicApp.altaCancion("Cancion1", "Autor1", "Genero1");
		musicApp.altaCancion("Cancion2", "Autor1", "Genero1");// FUERZO esPremium() a false
		musicApp.altaCancion("Cancion3", "Autor2", "Genero2");// FUERZO LIMITE ALCANZADO (Usuario GRATUITO)
		musicApp.listarUsuarios();

		System.out.println(musicApp.escucharCancion("Email1", "CancionX", "Autor1"));// CANCION INEXISTENTE
		System.out.println(musicApp.escucharCancion("EmailX", "Cancion1", "Autor1"));// USUARIO INEXISTENTE
		System.out.println(musicApp.escucharCancion("Email1", "Cancion1", "Autor1"));// CANCION ESCUCHADA (Usuario
																						// PREMIUM)
		System.out.println(musicApp.escucharCancion("Email3", "Cancion1", "Autor1"));// CANCION NO DISPONIBLE (Usuario
																						// REGISTRADO)
		int cicloCancion2 = 1100;
		for (int i = 0; i < cicloCancion2; i++) {// FUERZO esPremium() a false
			musicApp.escucharCancion("Email1", "Cancion2", "Autor1");
		}
		System.out.println(musicApp.escucharCancion("Email3", "Cancion2", "Autor1"));// CANCION ESCUCHADA (Usuario
																						// REGISTRADO)
		System.out.println(musicApp.escucharCancion("Email2", "Cancion2", "Autor1"));// CANCION ESCUCHADA (Usuario
																						// GRATUITO)
		System.out.println(musicApp.escucharCancion("Email2", "Cancion3", "Autor2"));// CANCION NO DISPONIBLE (Usuario
																						// GRATUITO)
		int cicloCancion3 = 1100;
		for (int i = 0; i < cicloCancion3; i++) {// FUERZO esPremium() a false
			musicApp.escucharCancion("Email1", "Cancion3", "Autor2");
		}
		int cicloGratuito = 55;
		for (int i = 0; i < cicloGratuito; i++) {// FUERZO LIMITE ALCANZADO (Usuario GRATUITO)
			musicApp.escucharCancion("Email2", "Cancion3", "Autor2");
		}
		System.out.println(musicApp.escucharCancion("Email2", "Cancion3", "Autor2"));// LIMITE DIARIO ALCANZADO (Usuario
																						// GRATUITO)

		musicApp.listarUsuarios();
		musicApp.listarCancionesPorUsuario("Email3");//Lista canciones usuario y hace SYSO de TIPO RESULTADO
		
	}
	/*
	 * LocalDate fechaPublicacion = LocalDate.of(2021, 11, 10);
	 * System.out.println(fechaPublicacion);
	 * System.out.println(LocalDate.now().compareTo(fechaPublicacion)); //HOY ES
	 * 2021/11/13 y DEVUELVE INT = 3
	 * 
	 */
}
