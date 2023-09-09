package unq.tp4.trabajador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TrabajadorTest {
	Trabajador rodri;
	Ingreso ventaML;
	Ingreso trabajoHorasExtra;
	
	
	@BeforeEach
	public void setUp() {
		rodri = new Trabajador();
		ventaML = new Ingreso(1, "Venta por ML", 10000);
		trabajoHorasExtra = new IngresoHorasExtra(1, "Albanileria", 20000, 40);		
		rodri.generarIngreso(ventaML);
		rodri.generarIngreso(trabajoHorasExtra);
	}
	
	@Test
	public void testDeMontoTotalPercibido() {
		assertEquals(30000, rodri.getTotalPercibido());
	}
	
	@Test
	public void testDeMontoTotalImponible() {
		assertEquals(10000, rodri.getMontoImponible());
	}
	
	@Test
	public void testDeMontoTotalAPagar() {
		assertEquals(10000,0, rodri.getImpuestoAPagar());
	}
}
