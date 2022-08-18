package z.thp.tp3.actividad1.Ejercicio2_ArrayListConArrayList_Siciliano;

public class Test {

	public static void main(String[] args) {
		Compania compania = new Compania("manaos");
		//System.out.println(compania);

		Area marketing = new Area("Marketing");
		compania.agregarArea(marketing);
		//System.out.println(compania);

		Area rrhh = new Area("RRHH");
		compania.agregarArea(rrhh);
		Area ventas = new Area("Ventas");
		compania.agregarArea(ventas);

		Oficina oficinaM1 = new Oficina("oficinaMarketing1");
		marketing.agregarOficina(oficinaM1);
		Oficina oficinaM2 = new Oficina("oficinaMarketing2");
		marketing.agregarOficina(oficinaM2);
		Oficina oficinaR1 = new Oficina("oficinaRRHH1");
		rrhh.agregarOficina(oficinaR1);
		Oficina oficinaR2 = new Oficina("oficinaRRHH2");
		rrhh.agregarOficina(oficinaR2);
		Oficina oficinaV1 = new Oficina("oficinaVentas1");
		ventas.agregarOficina(oficinaV1);
		Oficina oficinaV2 = new Oficina("oficinaVentas2");
		ventas.agregarOficina(oficinaV2);

		oficinaM1.agregarEmpleado(new Empleado("EmpleadoOficinaM1"));
		oficinaM2.agregarEmpleado(new Empleado("EmpleadoOficinaM2"));
		oficinaR1.agregarEmpleado(new Empleado("EmpleadoOficinaR1"));
		oficinaR2.agregarEmpleado(new Empleado("EmpleadoOficinaR2"));
		oficinaV1.agregarEmpleado(new Empleado("EmpleadoOficinaV1"));
		oficinaV2.agregarEmpleado(new Empleado("EmpleadoOficinaV2"));
		
		compania.devolverInfoEmpleados();

	}

}
