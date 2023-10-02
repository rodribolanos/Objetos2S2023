package unq.tp7.actividadSemanal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadTest {
	Actividad futbol;
	Actividad running;
	Actividad basket;
	@BeforeEach
	void setUp() throws Exception {
	futbol = Actividad.FUTBOL;
	running = Actividad.RUNNING;
	basket = Actividad.BASKET;
	}

	@Test
	void complejidadTest() {
		assertEquals(2, futbol.complejidad());
		assertEquals(2, basket.complejidad());
		assertEquals(1, running.complejidad());
		
	}

}
