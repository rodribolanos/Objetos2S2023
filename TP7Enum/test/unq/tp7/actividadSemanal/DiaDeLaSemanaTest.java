package unq.tp7.actividadSemanal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiaDeLaSemanaTest {
	DiaDeLaSemana martes;
	DiaDeLaSemana jueves;
	@BeforeEach
	void setUp() throws Exception {
	martes = DiaDeLaSemana.MARTES;
	jueves = DiaDeLaSemana.JUEVES;
	
	}

	@Test
	void diasConcurrentes() {
		assertFalse(martes.esDiaConcurrente());
		assertTrue(jueves.esDiaConcurrente());
	}

}
