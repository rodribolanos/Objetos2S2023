package unq.tp6.Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	Propiedad deptoEnTigre;
	Propiedad deptoEnQuilmes;
	Cliente rodri;
	Cliente nachito;
	Banco banco;
	
	
	@BeforeEach
	void setUp() throws Exception {
		deptoEnTigre = new Propiedad("Casa comoda y cara", "Carpincho Feliz 2047", 120000d);
		deptoEnQuilmes = new Propiedad("Humilde pero tiene rejas", "Cervecero 146", 12000d);
		banco = new Banco();
		banco.registrarCliente(nachito);
		banco.registrarCliente(rodri);
		rodri = new Cliente("Rodri", "Bolanios", "Cerca de Quilmes", 19, 100000d);
		nachito = new Cliente("Nachito", "Moreiratoja", "El dorado", 62, 100000d);
	}

	@Test
	void rodriPideUnCreditoQuePuedePagar() {
		rodri.solicitarCreditoPersonal(20000, 6);
		assertTrue(banco.getSolicitudesCreadas().get(0).aprobada());
		rodri.solicitarCreditoHipotecario(200000, 3, deptoEnTigre);
		assertTrue(banco.getSolicitudesCreadas().get(1).aprobada());
	}
	
	@Test
	void nachoNoPuedePedirCreditosADemasiadosMeses() {
		nachito.solicitarCreditoHipotecario(10000, 36, deptoEnQuilmes);
		assertFalse(banco.getSolicitudesCreadas().get(0).aprobada());
	}
	
	@Test
	void elBancoTieneQueDesembolsar() {
		rodri.solicitarCreditoPersonal(20000, 6);
		rodri.solicitarCreditoHipotecario(200000, 3, deptoEnTigre);
		nachito.solicitarCreditoHipotecario(10000, 36, deptoEnQuilmes);
		assertEquals(220000, banco.montoADesembolsarMensual());
	}

}
