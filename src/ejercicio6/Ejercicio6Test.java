package ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {

	@ParameterizedTest
	@MethodSource("calculadora")
	void testCalculadora(double num1, double num2, int op, double esperado) {
		double resultado = Ejercicio6.calculadora(num1,num2,op);
		
		assertEquals(esperado,resultado);
	}
	
	private static Stream<Arguments> calculadora (){
		return Stream.of(
				Arguments.of(1,1,1,2),
				Arguments.of(2,1,2,1),
				Arguments.of(1,2,2,-1),
				Arguments.of(1,2,3,2),
				Arguments.of(5,1,4,5)
				);
	}
	
//	
//	@Test
//	void testCalculadoraSuma() {
//		double res = Ejercicio6.calculadora(1, 1, 1);
//		assertEquals(2, res);
//	}
//	
//	@Test
//	void testCalculadoraResta() {
//		double res = Ejercicio6.calculadora(2, 1, 2);
//		assertEquals(1, res);
//	}
//	
//	@Test
//	void testCalculadoraResta2() {
//		double res = Ejercicio6.calculadora(1, 2, 2);
//		assertEquals((-1), res);
//	}
//	
//	@Test
//	void testCalculadoraMulti() {
//		double res = Ejercicio6.calculadora(1, 2, 3);
//		assertEquals(2, res);
//	}
//
//	@Test
//	void testCalculadoraDiv() {
//		double res = Ejercicio6.calculadora(5, 1, 4);
//		assertEquals(5, res);
//	}

	
	@Test
	void testCalculadoraDiv2() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
        Ejercicio6.calculadora(1, 0, 4));

        assertEquals("Vete a primaria, no se puede dividir entre 0", exception.getMessage());
	}
	
	

}
