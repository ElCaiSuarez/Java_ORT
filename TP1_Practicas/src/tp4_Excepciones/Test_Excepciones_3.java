package tp4_Excepciones;

public class Test_Excepciones_3 {

	public static void main(String[] args) {
		
		Vehiculo v1, v2, v3, v4;
		v1 = crearVehiculo("AAA111", 2008);
		v2 = crearVehiculo(" ", 2008);
		v3 = crearVehiculo("BBB222", -2008);
		v4 = crearVehiculo(null, 2010);
		
	}
	public static Vehiculo crearVehiculo(String patente, int anio) {
		Vehiculo v = null;
		try {
			v = new Vehiculo(patente, anio);
			System.out.println(v.toString());
			
		} catch (IllegalArgumentException e) {
			System.out.println("Error creando el Vehiculo " + e.getMessage());
		}
		return v;
	}
	
}
