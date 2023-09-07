package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploAltoTest {
	MultiploAlto calculadora;
	
	@BeforeEach 
	void setUp() {
		calculadora = new MultiploAlto();
	}
	@Test
	void testElMultiploMasAlto() {
		assertEquals(calculadora.elMultiploMasAlto(3, 9), 999);
		assertEquals(calculadora.elMultiploMasAlto(1000, 1001), -1); // No existe numero multiplo entre 1000 y 1001 menor a 1000, por lo que devuelve -1
	}

}
