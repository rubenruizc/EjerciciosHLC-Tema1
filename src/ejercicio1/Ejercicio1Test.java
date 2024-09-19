package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio1Test {

	@Test
	void testEsVocalAMin() {
		boolean resultado = Ejercicio1.esVocal('a');
		
		assertTrue(resultado);
	}
	
	@Test
	void testEsVocalEMin() {
		boolean resultado = Ejercicio1.esVocal('e');
		
		assertTrue(resultado);
	}
	
	@Test
	void testEsVocalRMin() {
		boolean resultado = Ejercicio1.esVocal('r');
		
		assertFalse(resultado);
	}
	
	@ParameterizedTest
	@MethodSource("vocalista")
	void testEsVocal(char caracter, boolean expected) {
		boolean resultado = Ejercicio1.esVocal(caracter);
		
		assertEquals(expected,resultado);
	}
	
	private static Stream<Arguments> vocalista (){
		return Stream.of(
				Arguments.of('a',true),
				Arguments.of('E',true),
				Arguments.of('o',true),
				Arguments.of('I',true),
				Arguments.of('u',true),
				Arguments.of('J',false)
				);
	}
	

}
