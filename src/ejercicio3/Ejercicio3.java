package ejercicio3;

public class Ejercicio3 {

	public static String devolverCadena(int num) {
		String cadena = "";

		if (num % 3 == 0 && num % 5 == 0) {
			cadena = "fizzbuzz";
		} else if (num % 5 == 0) {
			cadena = "buzz";
		} else if (num % 3 == 0) {
			cadena = "fizz";
		}
		return cadena;
	}
}
