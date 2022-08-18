package thp.tp2.actividad2.Ejercicio2_ObjetosConObjetosyEnums;

public class Compumundo {

	public static void main(String[] args) {
		
		
		Computadora pc1 = new Computadora("HP", TipoPC.allinone, new Procesador("Intel", "i5", 80), new LectoraDVD("Samsung", true));
		System.out.println(pc1);
		Computadora pc2 = new Computadora("HP", TipoPC.allinone, new Procesador("Intel", "i5", 80), new LectoraDVD("Samsung", true));
		System.out.println(pc2);
		
		Persona sebastian = new Persona("Sebastian", "Parisi", pc1);
		System.out.println(sebastian);
		Persona damian = new Persona("Damian", "Pontorno", pc2);
		System.out.println(damian);
		
		sebastian.actualizarLectora("LG", false);
		System.out.println(sebastian);
		System.out.println(damian);
		
	}

}
