package unq.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.tp5.pagables.Factura;
import unq.tp5.pagables.FacturaServicios;
import unq.tp5.pagables.ProductoCooperativa;
import unq.tp5.pagables.ProductoEmpresa;

class CajaTest {
	Caja caja;
	ProductoEmpresa leche;
	ProductoCooperativa galletitas;
	ProductoEmpresa nesquik;
	Agencia arba;
	Factura facturaDeLuz;

	
	@BeforeEach
	void setUp() {
		caja = new Caja();
		leche = new ProductoEmpresa(100, 10);
		galletitas = new ProductoCooperativa(200,8);
		nesquik = new ProductoEmpresa(300, 20);
		arba = new AgenciaRecaudadora();
		facturaDeLuz = new FacturaServicios(arba, 20, 10000);
	}

	@Test
	void testProductos() {
		caja.registrarPago(galletitas);
		caja.registrarPago(leche);
		caja.registrarPago(nesquik);
		assertEquals(580, caja.getMontoTotal());
	}
	
	@Test 
	void testFacturas() {
		caja.registrarPago(facturaDeLuz);
		assertEquals(1, arba.getFacturasRegistradas().size());
	}

}
