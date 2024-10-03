package ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio10Test {

	@ParameterizedTest
	@MethodSource("palindromo")
	void testPalindromo(String texto, boolean esperado) {
		
		boolean resultado = Ejercicio10.palindromo(texto);
		
		assertEquals(esperado, resultado);
	}

	private static Stream<Arguments> palindromo() {
		return Stream.of(
				Arguments.of("MOOM",true),
				Arguments.of("Amara",false),
				Arguments.of("Solos",true),
				Arguments.of("auri",false),
				Arguments.of("La ruta natural",true),
				Arguments.of("amarillo",false),
				Arguments.of("Yo hago yoga hoy",true),
				Arguments.of("Sos",true)
				
				);
	}


}
