package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grupo grupo1 = new Grupo("El Grupo 1");
		agregarAlGrupo("Daniel", grupo1);
		agregarAlGrupo("Maria", grupo1);
		agregarAlGrupo("Esteban", grupo1);
		buscarEnGrupo("Daniel", grupo1); // Esta en el grupo
		buscarEnGrupo("Alejandra", grupo1); // NO Esta en el grupo
		mostrarElGrupo(grupo1);
		removerEnGrupo("Daniel", grupo1);// Borra el Integrante
		removerEnGrupo("Daniel", grupo1);// Null Ya no existe
		mostrarElGrupo(grupo1);
		vacioElGrupo(grupo1);
		mostrarElGrupo(grupo1);

	}

	public static void mostrarElGrupo(Grupo grupo) {
		grupo.mostrar();
	}

	public static void vacioElGrupo(Grupo grupo) {
		grupo.vaciar();
		System.out.println("Se vacio el grupo: " + grupo.getNombre());
	}

	public static void removerEnGrupo(String nombreIntegrante, Grupo grupo) {
		System.out.println("Se ha removido el integrante: " + grupo.removerIntegrante(nombreIntegrante));
	}

	public static void agregarAlGrupo(String nombreIntegrante, Grupo grupo) {
		grupo.agregarIntegrante(nombreIntegrante);
	}

	public static void buscarEnGrupo(String nombreIntegrante, Grupo grupo) {
		if (!nombreIntegrante.isEmpty()) {
			if (grupo.obtenerIntegrante(grupo.obtenerPosicionIntegrante(nombreIntegrante)) != null) {
				System.out.println("El integrante: " + nombreIntegrante + " esta en el grupo " + grupo.getNombre());
			} else {
				System.out.println("El integrante: " + nombreIntegrante + " NO esta en el grupo " + grupo.getNombre());
			}
		}
	}
}
