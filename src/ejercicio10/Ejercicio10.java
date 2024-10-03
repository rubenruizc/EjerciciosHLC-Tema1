package ejercicio10;

public class Ejercicio10 {

	public static boolean palindromo(String texto) {
		// Convertimos el texto a minúsculas para evitar distinciones entre mayúsculas y
		// minúsculas
		String text = texto.replace(" ", "").toLowerCase();
		// Usamos dos índices: uno al principio y otro al final
		int inicio = 0;
		int fin = text.length() - 1;
		boolean esPalindromo = true;

		while (fin >= 0 && esPalindromo) {
			if (text.charAt(inicio) != text.charAt(fin)) {
				esPalindromo = false;
			}

			inicio++;
			fin--;
		}

		// Si hemos terminado el bucle sin encontrar diferencias, es un palíndromo
		return esPalindromo;
	}
}
