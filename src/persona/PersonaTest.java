package persona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona claudia = new Persona("claudia", "Medina", "claudiaCurp", 27);
	
	@Test
	@DisplayName("Test nombre persona")
	void personaNombreTest() {
		assertEquals("claudia", claudia.getNombre());
	}
	@Test
	@DisplayName("Test de Curp de persona")
	void personaCurpTest() {
		assertEquals("ClaudiaCurp", claudia.getCurp());
	}
	@Test
	@DisplayName("Test de curp erronea de persona")
	void personaNoCurpTest() {
		assertEquals("arturoCurp", claudia.getCurp());
	}
}
