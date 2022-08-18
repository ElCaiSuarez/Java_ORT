package practica2doParcial_AmigosClub_Reutilizacion;

public class Test {

	public static void main(String[] args) {
		AmigosClub aplicacion = new AmigosClub();
		System.out.println(aplicacion.agregarSocio("Juan", 23));
		System.out.println(aplicacion.agregarSocio("Laura", 18));
		System.out.println(aplicacion.agregarSocio("Maria", 26));
		System.out.println(aplicacion.agregarSocio("Joaquin", 20));
		System.out.println(aplicacion.agregarSocio("Belen", 20));
		System.out.println(aplicacion.agregarSocio("Daniel", 21));
		System.out.println(aplicacion.agregarSocio("Valeria", 20));
		System.out.println(aplicacion.agregarSocio("Ana", 19));
		System.out.println(aplicacion.agregarSocio("Javier", 22));
		System.out.println(aplicacion.agregarSocio("Javier", 22));// YA_EXISTE
		aplicacion.listarSocios();
		System.out.println(aplicacion.establecerAmistad("Juan", "Ana"));
		aplicacion.listarSocio("Juan");
		System.out.println(aplicacion.establecerAmistad("Laura", "Ana"));
		aplicacion.listarSocio("Laura");
		System.out.println(aplicacion.establecerAmistad("Laura", "Juan"));
		System.out.println(aplicacion.establecerAmistad("Maria", "Ana"));
		System.out.println(aplicacion.establecerAmistad("Belen", "Joaquin"));
		System.out.println(aplicacion.establecerAmistad("Belen", "Daniel"));
		System.out.println(aplicacion.establecerAmistad("Valeria", "Ana"));
		System.out.println(aplicacion.establecerAmistad("Ana", "Daniel"));
		System.out.println(aplicacion.establecerAmistad("Javier", "Juan"));
		System.out.println(aplicacion.establecerAmistad("Javier", "Ana"));
		System.out.println(aplicacion.establecerAmistad("Ana", "Javier"));//YA SON AMIGOS
		System.out.println(aplicacion.establecerAmistad("Ana", "Ana"));//NOMBRES_IGUALES
		System.out.println(aplicacion.establecerAmistad("Laura", "Marcelo"));
		System.out.println(aplicacion.establecerAmistad("Toribio", "Ana"));
		System.out.println(aplicacion.deshacerAmistad ("Ana", "Javier"));
		System.out.println(aplicacion.deshacerAmistad ("Ana", "Valeria"));
		aplicacion.listarSocio("Valeria");
		System.out.println(aplicacion.deshacerAmistad ("Ana", "Ana"));
		System.out.println(aplicacion.deshacerAmistad ("Laura", "Marcelo"));
		System.out.println(aplicacion.deshacerAmistad ("Toribio", "Ana"));
		aplicacion.listarSociosConPromedios();
		
	
	}

}
