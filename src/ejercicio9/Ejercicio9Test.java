package ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Ejercicio9Test {

	@ParameterizedTest
	@MethodSource("binario")
	void testBinario(int numero, String esperado) {
		
		String resultado = Ejercicio9.binario(numero);
		
		assertEquals(esperado, resultado);
	}

	private static Stream<Arguments> binario() {
		return Stream.of(
				Arguments.of(0,"0"),
				Arguments.of(5,"101"),
				Arguments.of(12,"1100"),
				Arguments.of(23,"10111"),
				Arguments.of(100,"1100100"),
				Arguments.of(255,"11111111"),
				Arguments.of(512,"1000000000"),
				Arguments.of(1024,"10000000000")
				
				);
	}

}
