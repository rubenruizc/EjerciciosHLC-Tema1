package ejercicio5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio5Test {

	@Test
	void testEsCapicua1() {
		boolean resultado = Ejercicio5.esCapicua(1);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua2() {
		boolean resultado = Ejercicio5.esCapicua(2);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua3() {
		boolean resultado = Ejercicio5.esCapicua(3);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua11() {
		boolean resultado = Ejercicio5.esCapicua(11);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua22() {
		boolean resultado = Ejercicio5.esCapicua(22);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua33() {
		boolean resultado = Ejercicio5.esCapicua(33);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua101() {
		boolean resultado = Ejercicio5.esCapicua(101);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua202() {
		boolean resultado = Ejercicio5.esCapicua(202);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua203() {
		boolean resultado = Ejercicio5.esCapicua(203);
		assertFalse(resultado);
	}

	@Test
	void testEsCapicua1001() {
		boolean resultado = Ejercicio5.esCapicua(1001);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua1221() {
		boolean resultado = Ejercicio5.esCapicua(1221);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua2112() {
		boolean resultado = Ejercicio5.esCapicua(2112);
		assertTrue(resultado);
	}

	@Test
	void testEsCapicua2121() {
		boolean resultado = Ejercicio5.esCapicua(2121);
		assertFalse(resultado);
	}

	@Test
	void testEsCapicua21512() {
		boolean resultado = Ejercicio5.esCapicua(21512);
		assertTrue(resultado);
	}

}
