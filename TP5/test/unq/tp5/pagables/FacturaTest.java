package unq.tp5.pagables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.tp5.mercadoCentral.Agencia;

class FacturaTest {
	Agencia arba;
	Agencia afip;
	Factura facturaDeLuz;
	Factura impuestoIVA;
	Factura impuestoGanancias;
	
	@BeforeEach
	void setUp() throws Exception {
		facturaDeLuz = new FacturaServicios(arba, 20, 10000);
		impuestoIVA = new FacturaImpuestos(afip, 50000);
		impuestoGanancias = new FacturaImpuestos(afip, 150000);
	}

	@Test
	void testPrecios() {
		assertEquals(200000, facturaDeLuz.getPrecio());
		assertEquals(50000, impuestoIVA.getPrecio());
		assertEquals(150000, impuestoGanancias.getPrecio());
	}

}
