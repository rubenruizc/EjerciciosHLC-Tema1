package ejercicio1;

public class Ejercicio1 {

	public static boolean esVocal(char caracter) {
		boolean vocal = false;
		
		switch (Character.toLowerCase(caracter)) {
		case 'a','e','i','o','u' :
			vocal = true;
		break;
		}
		
		return vocal;
	}
}
