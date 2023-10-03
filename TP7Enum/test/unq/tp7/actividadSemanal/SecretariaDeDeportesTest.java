package unq.tp7.actividadSemanal;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {
	SecretariaDeDeportes secretaria;
	ActividadSemanal futbol5hs;
	ActividadSemanal futbolDomingo;
	ActividadSemanal basket6hs;
	DiaDeLaSemana miercoles;
	DiaDeLaSemana jueves;
	
	@BeforeEach
	void setUp() throws Exception {
	miercoles = DiaDeLaSemana.MIERCOLES;
	jueves = DiaDeLaSemana.JUEVES;
	futbol5hs = new ActividadSemanal(miercoles,5,Deporte.FUTBOL, 1);// Actividad disenada para testear un dia no concurrente
	futbolDomingo = new ActividadSemanal(DiaDeLaSemana.DOMINGO, 6, Deporte.FUTBOL, 1); // Actividad mas cara que futbol5hs
	basket6hs = new ActividadSemanal(jueves, 6, Deporte.BASKET, 1);	
	secretaria = new SecretariaDeDeportes();
	secretaria.agregarActividad(basket6hs);
	secretaria.agregarActividad(futbol5hs);
	secretaria.agregarActividad(futbolDomingo);
	}

	@Test
	void actividadesDeFutbol() {
		assertTrue(secretaria.lasActividadesDeFutbol().contains(futbol5hs));
		assertTrue(secretaria.lasActividadesDeFutbol().contains(futbolDomingo));
		assertEquals(2, secretaria.lasActividadesDeFutbol().size());
	}
	
	@Test
	void actividadesDeComplejidad() {
		assertEquals(3, secretaria.actividadesDeComplejidad(2).size());
	}

	@Test
	void duracionDeActividades() {
		assertEquals(3, secretaria.duracionDeActividades());
	}
	
	
	@Test 
	void laMasBarataDadoUnDeporte() {
		assertEquals(secretaria.laDeMenorCosteDe(Deporte.FUTBOL), futbol5hs);
		assertEquals(secretaria.laDeMenorCosteDe(Deporte.BASKET), basket6hs);
	}
	@Test 
	void mapeoDeActividades() {
		assertEquals(2, secretaria.actividadPorMenorValor().size());
		assertTrue(secretaria.actividadPorMenorValor().containsValue(futbol5hs));
		assertFalse(secretaria.actividadPorMenorValor().containsValue(futbolDomingo));
	}
}
