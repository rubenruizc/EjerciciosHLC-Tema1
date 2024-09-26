package ejercicio5;

public class Ejercicio5 {

	public static boolean esCapicua(int num) {

		boolean resultado = false;

		// Variable para guardar el número original ya que en el bucle lo modificamos
		int numOriginal = num;
		
		// Variable para guardar el número invertidor y comprobar que es capicúa
		int numInvertido = 0;
		
		// Variable para guardar el último digito del número
		int ultDigito = 0;

		//Ejemplo 202
		while (num > 0) {
			
			// Pillamos el último 2 
			// Pillamos el 0
			// Pillamos el otro 2 
			ultDigito = num % 10;
			
			// numInvertido = 0 * 10 + 1 = 2
			// numInvertido = 1*10 + 0 = 20
			// numInvertido = 10*10 + 2 = 202
			numInvertido = numInvertido * 10 + ultDigito;
			
			// 202 / 10 = 20
			// 20 / 10 = 2
			// 2 / 10 = 0
			num /= 10;
		}

		// Si el número original es igual que el invertido el número si es capicúa
		if (numOriginal == numInvertido) {
			resultado = true;
		}

		// Devolvemos el resultado
		return resultado;
	}
}
