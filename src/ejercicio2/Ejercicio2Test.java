package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio2Test {

	@Test
	void testEsPar2() {
		boolean resultado = Ejercicio2.esPar(2);
		
		assertTrue(resultado);
	}
	
	@Test
	void testEsPar4() {
		boolean resultado = Ejercicio2.esPar(4);
		
		assertTrue(resultado);
	}

	@Test
	void testEsPar3() {
		boolean resultado = Ejercicio2.esPar(3);
		
		assertFalse(resultado);
	}

	@ParameterizedTest
	@MethodSource("par")
	void testEsPar(int num, boolean expected) {
		boolean resultado = Ejercicio2.esPar(num);
		
		assertEquals(expected,resultado);
	}
	
	private static Stream<Arguments> par (){
		return Stream.of(
				Arguments.of(2,true),
				Arguments.of(4,true),
				Arguments.of(6,true),
				Arguments.of(8,true),
				Arguments.of(10,true),
				Arguments.of(3,false)
				);
	}
}
