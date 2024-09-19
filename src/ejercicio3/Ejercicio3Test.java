package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio3Test {

	@Test
	void testDevolverCadena3() {
		String cadena = Ejercicio3.devolverCadena(3);

		assertEquals("fizz", cadena);

	}
	
	@Test
	void testDevolverCadena6() {
		String cadena = Ejercicio3.devolverCadena(6);

		assertEquals("fizz", cadena);

	}
	
	@Test
	void testDevolverCadena5() {
		String cadena = Ejercicio3.devolverCadena(5);

		assertEquals("buzz", cadena);

	}

	@Test
	void testDevolverCadena10() {
		String cadena = Ejercicio3.devolverCadena(10);

		assertEquals("buzz", cadena);

	}
	
	@Test
	void testDevolverCadena15() {
		String cadena = Ejercicio3.devolverCadena(15);

		assertEquals("fizzbuzz", cadena);

	}
	
	@Test
	void testDevolverCadena4() {
		String cadena = Ejercicio3.devolverCadena(4);

		assertEquals("", cadena);

	}
	
	@ParameterizedTest
	@MethodSource("devolverCadena")
	void testDevolverCadena(int num, String expected) {
		String cadena = Ejercicio3.devolverCadena(num);
		
		assertEquals(expected,cadena);
	}
	
	private static Stream<Arguments> devolverCadena (){
		return Stream.of(
				Arguments.of(3,"fizz"),
				Arguments.of(5,"buzz"),
				Arguments.of(6,"fizz"),
				Arguments.of(10,"buzz"),
				Arguments.of(15,"fizzbuzz"),
				Arguments.of(4,"")
				);
	}
}
