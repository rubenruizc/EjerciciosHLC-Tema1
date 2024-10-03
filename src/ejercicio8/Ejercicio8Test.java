package ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {

	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFechas(long numero, long esperado) throws Exception {
		long resultado = Ejercicio8.fibonacci(numero);

		assertEquals(esperado, resultado);
	}

	private static Stream<Arguments> fibonacci() {
		return Stream.of(
				Arguments.of(1,1), 
				Arguments.of(2,1),
				Arguments.of(3,2), 
				Arguments.of(4,3),
				Arguments.of(5,5), 
				Arguments.of(15,610) );
	}

}
