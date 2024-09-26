package ejercicio6;

public class Ejercicio6 {

	public static double calculadora (double num1,double num2, int oper) {
		double res = 0;
		
		switch(oper) {
		case 1 : 
			res = num1 + num2;
			break;
		case 2:
			res = num1 - num2;
			break;
		case 3:
			res = num1 * num2;
			break;
		case 4:
			if(num2 == 0) {
				throw new ArithmeticException("Vete a primaria, no se puede dividir entre 0");
			}else {
				res = num1 / num2;
			}
			break;
		}
		
		return res;
	}
}
