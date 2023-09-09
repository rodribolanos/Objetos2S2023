package unq.tp4.supermercado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {
		public Supermercado superm;
		private Producto arroz;
		private Producto detergente;
		
		
		@BeforeEach
		public void setUp() {
			arroz = new Producto("Arroz", 18.9d, true);
			detergente = new Producto("Detergente", 75d);
			superm = new Supermercado("Lo de Tito", "Av Zubeldia 801");
			
		}
		
		@Test
		public void testCantidadDeProductos() {
//			assertEquals(0, supermercado.getCantidadDeProductos());
			superm.agregarProducto(arroz);
			superm.agregarProducto(detergente);
			assertEquals(2, superm.getCantidadDeProductos());
		}
		
		@Test
		public void testPrecioTotal() {
			superm.agregarProducto(arroz);
			superm.agregarProducto(detergente);
			assertEquals(93,9, superm.getPrecioTotal());
		}
}

