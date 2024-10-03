package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		binario(1);
	}
	
	public static String binario(int num) {
		String binario = "";

		int resto;

		// Cociente = 2
		int cociente = num;

		if (cociente == 0) {
			binario = "0";
		} else {
			// Mientras cociente sea mayor que 0
			while (cociente > 0) {
				// resto = 2 % 2 -> 0
				// resto = 1 % 2 -> 1
				resto = cociente % 2;
				System.out.println(resto);
				// cociente = 2 / 2 -> 1
				// cociente = 1 / 2 -> 0
				cociente =cociente / 2;

				// bin = 0
				// bin = '10'
				binario = resto + binario;
			}
		}

		return binario;
	}
}
