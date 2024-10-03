package ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio7Test {

	@ParameterizedTest
	@MethodSource("fecha")
	void testFechas(int dia, int mes, int anio, boolean esperado) {
		boolean resultado = Ejercicio7.fecha(dia, mes, anio);

		assertEquals(esperado, resultado);
	}

	private static Stream<Arguments> fecha() {
		return Stream.of(Arguments.of(01, 01, 2001, true), 
				Arguments.of(31, 03, 2001, true),
				Arguments.of(28, 02, 2001, true), 
				Arguments.of(29, 02, 2024, true), 
				Arguments.of(31, 04, 2024, false),
				Arguments.of(29, 02, 2023, false), 
				Arguments.of(32, 01, 2023, false),
				Arguments.of(12, -04, 2023, false), 
				Arguments.of(-13, 04, 2023, false),
				Arguments.of(15, 04, -2023, false));
	}
	
	@ParameterizedTest
	@MethodSource("fechaBisiesto")
	void testFechaBisiesto(int dia, int mes, int anio, boolean esperado) {
		boolean resultado = Ejercicio7.fecha(dia, mes, anio);

		assertEquals(esperado, resultado);
	}

	// Bisiestos
	private static Stream<Arguments> fechaBisiesto() {
		return Stream.of(Arguments.of(29, 02, 1980, true), 
				Arguments.of(29, 02, 1984, true),
				Arguments.of(29, 02, 1988, true), 
				Arguments.of(29, 02, 1992, true), 
				Arguments.of(29, 02, 1996, true),
				Arguments.of(29, 02, 2000, true), 
				Arguments.of(29, 02, 2004, true), 
				Arguments.of(29, 02, 2008, true),
				Arguments.of(29, 02, 2012, true), 
				Arguments.of(29, 02, 2016, true));
	}

//	@Test
//	void testFechaMeses() {
//		boolean res = Ejercicio7.fecha(01, 01, 2001);
//		assertTrue(res);
//
//	}
//
//	@Test
//	void testFechaMeses2() {
//		boolean res = Ejercicio7.fecha(01, 12, 2001);
//		assertTrue(res);
//
//	}
//
//	@Test
//	void testFechaMeses3() {
//		boolean res = Ejercicio7.fecha(01, 13, 2001);
//		assertFalse(res);
//
//	}
//	
//	@Test
//	void testFechaMeses4() {
//		boolean res = Ejercicio7.fecha(01, 00, 2001);
//		assertFalse(res);
//
//	}
//
//	@Test
//	void testFechaDias() {
//		boolean res = Ejercicio7.fecha(1, 12, 2001);
//		assertTrue(res);
//	}
//
//	@Test
//	void testFechaDias2() {
//		boolean res = Ejercicio7.fecha(31, 12, 2001);
//		assertTrue(res);
//	}
//
//	@Test
//	void testFechaDias3() {
//		boolean res = Ejercicio7.fecha(32, 12, 2001);
//		assertFalse(res);
//	}
//	
//	@Test
//	void testFechaDias4() {
//		boolean res = Ejercicio7.fecha(32, 00, 2001);
//		assertFalse(res);
//	}
//	
//	@Test
//	void testFechaAnios() {
//		boolean res = Ejercicio7.fecha(21, 2, 2001);
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaAnios2() {
//		boolean res = Ejercicio7.fecha(32, 00, 0000);
//		assertFalse(res);
//	}
//	
//	@Test
//	void testFechaAnios3() {
//		boolean res = Ejercicio7.fecha(29, 02, 2024);
//		assertTrue(res);
//	}
}
