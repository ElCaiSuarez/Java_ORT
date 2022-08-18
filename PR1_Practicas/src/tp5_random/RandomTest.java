package tp5_random;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int size = 5;
		int cantidad = 20;
		
		//USANDO EL METODO RANDOM DE LA CLASE MATH
		for (int i = 0; i < cantidad; i++) {
			System.out.print((int) (Math.random() * size) + " ");
		}
		
		//USANDO LA CLASE RANDOM
		Random random = new Random();
		System.out.println();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.print((random.nextInt(size)) + " ");
		}
		
	}

}
