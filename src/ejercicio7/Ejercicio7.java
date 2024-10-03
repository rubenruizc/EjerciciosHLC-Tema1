package ejercicio7;

public class Ejercicio7 {

	public static boolean fecha(int dia, int mes, int anio) {
		boolean resultado = false;

		if (anio > 0) {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				resultado = dia > 0 && dia <= 31;
				break;
			case 4, 6, 9, 11:
				resultado = dia > 0 & dia <= 30;
				break;
			case 2:
				int diaMax = 28;
				if((anio % 4 == 0 && anio % 100 !=0) || anio % 400 == 0) {
					diaMax = 29;
				} 
				
				resultado = dia > 0 && dia <= diaMax;
				break;
			}

		}

		return resultado;
	}
}
