package tp3_ej7_LocalDate_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Test_LOCALDATE_LOCALDATETIME {

	public static void main(String[] args) {
		int a = LocalDateTime.now().getHour();
		int b = LocalDate.now().getYear();
		System.out.println(a);
		System.out.println(b);

	}

}
