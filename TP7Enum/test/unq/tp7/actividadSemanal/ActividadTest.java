package unq.tp7.actividadSemanal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadTest {
	Deporte futbol;
	Deporte running;
	Deporte basket;
	@BeforeEach
	void setUp() throws Exception {
	futbol = Deporte.FUTBOL;
	running = Deporte.RUNNING;
	basket = Deporte.BASKET;
	}

	@Test
	void complejidadTest() {
		assertEquals(2, futbol.complejidad());
		assertEquals(2, basket.complejidad());
		assertEquals(1, running.complejidad());
		
	}

}
