package unq.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.tp5.pagables.ProductoCooperativa;
import unq.tp5.pagables.ProductoEmpresa;

import static org.junit.Assert.assertEquals;

public class ProductoTest {
	ProductoEmpresa leche;
	ProductoCooperativa galletitas;
	ProductoEmpresa nesquik;
	
	@BeforeEach
	void setUp() {
		leche = new ProductoEmpresa(100);
		galletitas = new ProductoCooperativa(200);
		nesquik = new ProductoEmpresa(300);
	}
	
	@Test
	public void testPrecios() {
		assertEquals(100, leche.getPrecio());
		assertEquals(300, nesquik.getPrecio());
		assertEquals(180, galletitas.getPrecio());
	}
}
