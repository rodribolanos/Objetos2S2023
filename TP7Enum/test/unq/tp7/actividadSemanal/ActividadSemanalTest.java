package unq.tp7.actividadSemanal;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {
	ActividadSemanal futbol5hs;
	ActividadSemanal basket6hs;
	DiaDeLaSemana miercoles;
	DiaDeLaSemana jueves;
	@BeforeEach
	void setUp() throws Exception {
	miercoles = DiaDeLaSemana.MIERCOLES;
	jueves = DiaDeLaSemana.JUEVES;
	futbol5hs = new ActividadSemanal(miercoles,5,Actividad.FUTBOL, 1);// Actividad disenada para testear un dia no concurrente
	basket6hs = new ActividadSemanal(jueves, 6, Actividad.BASKET, 1);
	}
	
	@Test 
	void complejidad() {
	assertTrue(futbol5hs.esDeComplejidad(2));
	assertFalse(basket6hs.esDeComplejidad(4));
	}
	
	@Test
	void costos() {
	assertEquals(400, futbol5hs.costo());
	assertEquals(900, basket6hs.costo());
	}

}
