package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	Persona rodri;
	Persona nacho;
	Persona thiago;
	Persona lean;
	Persona leo; 
	EquipoDeTrabajo wolollok;

	@BeforeEach
	void setUp() throws Exception {
	 rodri = new Persona("Rodrigo", LocalDate.of(2004, 1, 29));
	 nacho = new Persona("Rodrigo", LocalDate.of(2000, 1, 29));
	 thiago = new Persona("Rodrigo", LocalDate.of(2003, 1, 29));
	 lean = new Persona("Rodrigo", LocalDate.of(2002, 1, 29));
	 leo = new Persona("Rodrigo", LocalDate.of(2001, 1, 29));
	 wolollok = new EquipoDeTrabajo("wolollok");
	 wolollok.contratar(rodri);
	 wolollok.contratar(lean);
	 wolollok.contratar(nacho);
	 wolollok.contratar(leo);
	 wolollok.contratar(thiago);
	}

	@Test
	void personasDicenSuEdad() {
		assertEquals(19, rodri.edad());
		assertEquals(21, lean.edad());
		assertEquals(20, thiago.edad());
	}

	@Test
	void promedioDeEdades() {
		assertEquals(21, wolollok.promedioDeEdad());
	}
}
