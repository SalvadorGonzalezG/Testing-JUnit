package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraMainTest {
	
	// Vamos a llamar un objeto de tipo calculadora pero modificador privado
	private Calculadora calculadoraTest;
	// Esta anotacion le indica a Junit que este metodo se ejecutara antes que todo lo demas.
	@BeforeEach
	void setUp(){
		calculadoraTest = new Calculadora();
	}
	// No retornan, en el body, llevan datos de entrada, datos de salida y afirmaciones
	@Test
	@DisplayName("Sumar dos enteros")
	void sumarTest() {
		assertEquals(10, calculadoraTest.sumar(5, 5));
	}
	@Test
	@DisplayName("Restar dos enteros")
	void restarTest() {
		assertEquals(5, calculadoraTest.restar(10, 5));
		
	}
	@Test
	@DisplayName("Multiplicar dos numero enteros")
	void multiplicarTest() {
		assertEquals(25, calculadoraTest.multiplicar(5, 5));
	}
	@Test
	@DisplayName("Dividir 2 numero enteros")
	void dividirTest() {
		assertEquals(10, calculadoraTest.dividir(100, 10));
	}
}
