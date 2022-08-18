package practica2doParcial_OrtMusic;

public class Test {

	public static void main(String[] args) {
		Cuenta ortMusic = new Cuenta(21654783, "Jose Morales");
		ortMusic.agregarTema("Despacito", "Luis Fonci",2018,"Pop latino");
		ortMusic.agregarTema("Bailando", "Enrique Iglesias",2014,"Pop latino");
		ortMusic.agregarTema("La bicicleta", "Luis Fonci",2018,"Pop latino");
		System.out.println(ortMusic.agregarTema("Despacito", "Luis Fonci",2018,"Pop latino"));//Tema Repetido
		ortMusic.agregarTema("Creo", "Fito Paez",1992,"Rock");
		ortMusic.agregarTema("Una noche fria", "Callejeros",2003,"Rock");
		ortMusic.agregarTema("Ya no sos igual", "Dos minutos",1994,"Rock");
		
		ortMusic.reproducirTema("Despacito");
		System.out.println(ortMusic.reproducirTema("Gente que no"));//Tema Inexistente
		ortMusic.reproducirTema("Bailando");
		ortMusic.reproducirTema("Bailando");
		ortMusic.reproducirTema("Despacito");
		//ortMusic.reproducirTema("Una noche fria");
		
		ortMusic.listarTemas("Rock");//Listar temas del genero ROCK
		ortMusic.temaMasReproducido("Pop latino");//Busco el tema mas reproducido del genero POP LATINO
		ortMusic.temaMasReproducido("Rock");//Busco el tema mas reproducido del genero ROCK
		
	}

}
