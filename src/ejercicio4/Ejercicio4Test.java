package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void testEsPrimo2() {
		boolean resultado = Ejercicio4.esPrimo(2);
		assertTrue(resultado);
	}
	
	@Test
	void testEsPrimo3() {
		boolean resultado = Ejercicio4.esPrimo(3);
		assertTrue(resultado);
	}
	
	@Test
	void testEsPrimo4() {
		boolean resultado = Ejercicio4.esPrimo(4);
		assertFalse(resultado);
	}
	
	@Test
	void testEsPrimo5() {
		boolean resultado = Ejercicio4.esPrimo(5);
		assertTrue(resultado);
	}
	
	@Test
	void testEsPrimo7() {
		boolean resultado = Ejercicio4.esPrimo(7);
		assertTrue(resultado);
	}

	@Test
	void testEsPrimo9() {
		boolean resultado = Ejercicio4.esPrimo(9);
		assertFalse(resultado);
	}

	@Test
	void testEsPrimo1() {
		boolean resultado = Ejercicio4.esPrimo(1);
		assertFalse(resultado);
	}
	
	@Test
	void testEsPrimo0() {
		boolean resultado = Ejercicio4.esPrimo(0);
		assertFalse(resultado);
	}
}
