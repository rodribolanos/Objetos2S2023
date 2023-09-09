package unq.tp4.supermercado;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad galletitas;
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.10);
		galletitas = new ProductoPrimeraNecesidad("Galletitas", 100d , true, (0.20));
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7,2, leche.getPrecio());
	}
	
	@Test
	public void testCalcularNuevoDescuento() {	
		assertEquals(80,0 , galletitas.getPrecio());
	}
	
}
