package thp.tp2.actividad3.Ejercicio12_UsoFechaLOCALDATE;

import java.time.LocalDate;

public class FechaConLOCALDATE {

	public static void main(String[] args) {
				System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getYear());
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(LocalDate.now());
		
	}

}
