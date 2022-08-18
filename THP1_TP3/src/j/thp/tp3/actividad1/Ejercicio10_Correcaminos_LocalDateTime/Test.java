package j.thp.tp3.actividad1.Ejercicio10_Correcaminos_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Empresa correCaminos = new Empresa();
		DateTimeFormatter fechaYHoraCarrera = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime fechaYHoraCarrera1 = LocalDateTime.of(2021, 12, 5, 14, 00);
		System.out.println(fechaYHoraCarrera1.format(fechaYHoraCarrera));
		LocalDateTime fechaYHoraCarrera2 = LocalDateTime.of(2021, 12, 5, 15, 00);
		System.out.println(fechaYHoraCarrera2.format(fechaYHoraCarrera));
		correCaminos.agregarCarrera(fechaYHoraCarrera1, TipoDificultad.PRINCIPIANTE);
		correCaminos.agregarCarrera(fechaYHoraCarrera2, TipoDificultad.AVANZADO);
		Carrera carrera1 = correCaminos.buscarCarrera(fechaYHoraCarrera1);
		System.out.println(carrera1.agregarPiloto("Piloto1", "Dni1", false));
		System.out.println(carrera1.agregarPiloto("Piloto2", "Dni2", false));
		System.out.println(carrera1.agregarPiloto("Piloto3", "Dni3", false));
		System.out.println(carrera1.agregarPiloto("Piloto4", "Dni4", false));
		System.out.println(carrera1.agregarPiloto("Piloto5", "Dni5", false));
		Carrera carrera2 = correCaminos.buscarCarrera(fechaYHoraCarrera2);
		System.out.println(carrera2.agregarPiloto("Piloto1", "Dni1", false));
		System.out.println(carrera2.agregarPiloto("Piloto2", "Dni2", false));
		System.out.println(carrera2.agregarPiloto("Piloto3", "Dni3", false));
		System.out.println(carrera2.agregarPiloto("Piloto4", "Dni4", false));
		// System.out.println(carrera2.agregarPiloto("Piloto5", "Dni5", false));
		for (int i = 0; i < 15; i++) {
			carrera1.agregarVuelta("Dni1", 50);// 1
			carrera1.agregarVuelta("Dni2", 55);// 1
			carrera1.agregarVuelta("Dni3", 60);// 1
			carrera1.agregarVuelta("Dni4", 45);// 1
			carrera1.agregarVuelta("Dni5", 50);// 1
		}

		ArrayList<Piloto> listaPilotosPorDebajoDe = carrera1.buscarPilotosPorDebajoDe(54);
		System.out.println(listaPilotosPorDebajoDe);
		carrera1.mostrarMenorPromedio();
		ArrayList<Informe> listaInforme = correCaminos.pilotosPorCarrera();
		System.out.println(listaInforme);

	}

}
