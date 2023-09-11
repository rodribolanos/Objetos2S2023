package unq.tp4.trabajador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TrabajadorTesteo {
	Ingreso ventaML;
	Ingreso trabajoHorasExtra;
	Trabajador rodri;
	
	// No me anda la anotacion @BeforeEach
	@Test
	public void testDeMontoTotalPercibido() {
		rodri = new Trabajador();
		ventaML = new Ingreso(1, "Venta por ML", 10000);
		trabajoHorasExtra = new IngresoHorasExtra(1, "Albanileria", 20000, 40);		
		rodri.generarIngreso(ventaML);
		rodri.generarIngreso(trabajoHorasExtra);
		assertEquals(10000, ventaML.getMonto());
		assertEquals(30000, rodri.getTotalPercibido());
	}
	
	@Test
	public void testDeMontoTotalImponible() {
		rodri = new Trabajador();
		ventaML = new Ingreso(1, "Venta por ML", 10000);
		trabajoHorasExtra = new IngresoHorasExtra(1, "Albanileria", 20000, 40);		
		rodri.generarIngreso(ventaML);
		rodri.generarIngreso(trabajoHorasExtra);
		assertEquals(10000, rodri.getMontoImponible());
	}
	
	@Test
	public void testDeMontoTotalAPagar() {
		rodri = new Trabajador();
		ventaML = new Ingreso(1, "Venta por ML", 10000);
		trabajoHorasExtra = new IngresoHorasExtra(1, "Albanileria", 20000, 40);		
		rodri.generarIngreso(ventaML);
		rodri.generarIngreso(trabajoHorasExtra);
		assertEquals(200,0, rodri.getImpuestoAPagar());
	}
}
