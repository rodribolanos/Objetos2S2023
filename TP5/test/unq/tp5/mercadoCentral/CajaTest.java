package unq.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.tp5.pagables.ProductoCooperativa;
import unq.tp5.pagables.ProductoEmpresa;

class CajaTest {
	Caja caja;
	ProductoEmpresa leche;
	ProductoCooperativa galletitas;
	ProductoEmpresa nesquik;
	
	@BeforeEach
	void setUp() {
		caja = new Caja();
		leche = new ProductoEmpresa(100);
		galletitas = new ProductoCooperativa(200);
		nesquik = new ProductoEmpresa(300);
	}

	@Test
	void test() {
		caja.registrarProducto(galletitas);
		caja.registrarProducto(leche);
		caja.registrarProducto(nesquik);
		assertEquals(580, caja.getMontoTotal());
	}

}
