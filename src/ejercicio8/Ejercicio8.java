package ejercicio8;

public class Ejercicio8 {

	public static long fibonacci(long num) throws Exception {

		long n;

		if (num < 1) {
			throw new Exception("El número tiene que ser mayor a 1");
		} else if (num == 1 || num == 2) {
			n = 1;
		} else {
			n = fibonacci(num - 1) + fibonacci(num - 2);
		}

		return n;

	}
}
