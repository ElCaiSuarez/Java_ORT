package b.thp.tp3.actividad1.Ejercicio2_CadenaDeResponsabilidadDeArrayList;

public class Test {

	public static void main(String[] args) {
		Compania compania1 = new Compania("Compania 1");
		compania1.agregarEmpleado("Empleado 1", "Area 1", "Oficina 1");
		compania1.mostrarListaConcatenada();
		compania1.agregarEmpleado("Empleado 2", "Area 1", "Oficina 1");
		compania1.agregarEmpleado("Empleado 3", "Area 2", "Oficina 2");
		compania1.agregarEmpleado("Empleado 4", "Area 2", "Oficina 3");
		compania1.agregarEmpleado("Empleado 5", "Area 3", "Oficina 4");
		compania1.agregarEmpleado("Empleado 6", "Area 3", "Oficina 4");
		compania1.agregarEmpleado("Empleado 7", "Area 3", "Oficina 5");
		compania1.agregarEmpleado("Empleado 8", "Area 4", "Oficina 6");
		/*
		compania1.agregarArea("Area 1 de Compania 1");
		compania1.agregarArea("Area 2 de Compania 1");
		
		compania2.agregarArea("Area 3 de Compania 2");
		compania2.agregarArea("Area 4 de Compania 2");
		// USO EL BUSCAR PUBLICO
		compania1.buscarArea("Area 1 de Compania 1").agregarOficina("Oficina 1");
		compania1.buscarArea("Area 1 de Compania 1").agregarOficina("Oficina 2");
		compania1.buscarArea("Area 2 de Compania 1").agregarOficina("Oficina 3");
		compania2.buscarArea("Area 3 de Compania 2").agregarOficina("Oficina 4");
		compania2.buscarArea("Area 4 de Compania 2").agregarOficina("Oficina 5");
		compania2.buscarArea("Area 4 de Compania 2").agregarOficina("Oficina 6");
		compania1.buscarArea("Area 1 de Compania 1").buscarOficina("Oficina 1").agregarEmpleado("Empleado 1");//REVISAR CON EL PROFE COMO NO USAR BUSCAR????
		compania1.buscarArea("Area 1 de Compania 1").buscarOficina("Oficina 2").agregarEmpleado("Empleado 2");
		compania1.buscarArea("Area 2 de Compania 1").buscarOficina("Oficina 3").agregarEmpleado("Empleado 3");
		compania2.buscarArea("Area 3 de Compania 2").buscarOficina("Oficina 4").agregarEmpleado("Empleado 4");
		compania2.buscarArea("Area 4 de Compania 2").buscarOficina("Oficina 5").agregarEmpleado("Empleado 5");
		compania2.buscarArea("Area 4 de Compania 2").buscarOficina("Oficina 6").agregarEmpleado("Empleado 6");
		*/
		compania1.mostrarListaConcatenada();
		System.out.println("\n");

	}

}
