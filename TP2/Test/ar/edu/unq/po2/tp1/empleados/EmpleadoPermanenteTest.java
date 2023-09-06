package ar.edu.unq.po2.tp1.empleados;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp1.empresa.Empresa;

class EmpleadoTest {
	Empleado leanP; 
	Empleado nachitoT; 
	Empleado rodriC;
	Empresa apple;
	
	@BeforeEach
	void setUp() throws Exception {
		leanP = new EmpleadoPermanente("Leandro", "Evergreen Avenue", "Soltero", LocalDate.of(1930, 8, 16), 20000, 4, 3);
		nachitoT = new EmpleadoTemporal("Nacho", "Fake Street", "Casado", LocalDate.of(1950, 6, 23), 10000, LocalDate.of(2023, 12, 31),  10);
		rodriC = new EmpleadoContratado("Rodri", "Quilmes Road", "Viudo", LocalDate.of(2001, 7, 30), 20000, 4000, "Efectivo");
		apple = new Empresa("Apple", 2028);
		apple.contratarTrabajador(leanP);
		apple.contratarTrabajador(nachitoT);
		apple.contratarTrabajador(rodriC);

	}

	@Test
	void valoresDelTemporario() {
		assertEquals(10400, nachitoT.sueldoBruto());
		assertEquals(2155, nachitoT.retenciones());
		assertEquals(8245, nachitoT.sueldoNeto());
	}
	
	@Test
	void valoresDelPermanente() {
		assertEquals(20750, leanP.sueldoBruto());
		assertEquals(5267, leanP.retenciones());
		assertEquals(15483, leanP.sueldoNeto());
	}
	
	@Test
	void valoresDelContratado() {
		assertEquals(20000, rodriC.sueldoBruto());
		assertEquals(50, rodriC.retenciones());
		assertEquals(19950, rodriC.sueldoNeto());
		assertEquals(rodriC.desgloceDeSueldos(), "Sueldo neto: $19950" + "\nSueldo bruto: $20000" + "\nDetalle:" + "\nSueldo basico: $20000" + "\nRetenciones: $50"+ "\nGastos Administrativos: $50");
	}
}