package ejercicio4;

public class Ejercicio4 {

	public static boolean esPrimo(int num) {
		boolean res = (num > 1);
		int i = 2;
		
		
		while (i<= Math.sqrt(num) && res) {
			if(num % i == 0) {
				res = false;
			}
			i++;
		}
		
		return res;
	}
}
