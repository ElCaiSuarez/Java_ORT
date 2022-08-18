package g.thp.tp3.actividad1.Ejercicio7_Agenda_Turnero;

public class Test {

	public static void main(String[] args) {
		AgendaMedica drsuenio = new AgendaMedica(5);//Instancio la AgendaMedica con la cantidad de turnos
		drsuenio.listarTurnos();//NO HAY TURNOS
		System.out.println(drsuenio.registrarTurno("1111", "Nombre1", "Apellido1", "Telefono1"));//TURNO 1 Luego ANULADO
		System.out.println(drsuenio.registrarTurno("2222", "Nombre2", "Apellido2", "Telefono2"));//TURNO 2 Luego PRESENTE
		System.out.println(drsuenio.registrarTurno("3333", "Nombre3", "Apellido3", "Telefono3"));//TURNO 3 Luego PRESENTE
		System.out.println(drsuenio.registrarTurno("4444", "Nombre4", "Apellido4", "Telefono4"));//TURNO 4 Queda AUSENTE
		System.out.println(drsuenio.registrarTurno("5555", "Nombre5", "Apellido5", "Telefono5"));//TURNO 5 Queda AUSENTE
		System.out.println(drsuenio.registrarTurno("6666", "Nombre6", "Apellido6", "Telefono6"));//NO HAY MAS TURNOS
		System.out.println(drsuenio.anularTurno("1111") ? "ANULO" : "NO ANULO");//ANULO TURNO 1
		System.out.println(drsuenio.registrarTurno("7777", "Nombre7", "Apellido7", "Telefono7"));//TURNO 5 Queda AUSENTE
		System.out.println(drsuenio.darPresente("2222") ? "SE PRESENTO" : "ERROR");//DAR PRESENTE TURNO 2
		System.out.println(drsuenio.darPresente("3333") ? "SE PRESENTO" : "ERROR");//DAR PRESENTE TURNO 3
		drsuenio.listarTurnos();//LISTA 5 TURNOS
		System.out.println("Lista de pacientes ausentes: ");
		for (Paciente paciente : drsuenio.obtenerAusentes()) {//OBTENGO LISTA DE ASUNTOS
			System.out.println(" " + paciente);
		}
	}
}
