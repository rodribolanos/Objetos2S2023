package modeloParcial;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modeloParcial.ej1.Aeropuerto;
import modeloParcial.ej1.Cliente;

class AeropuertoTest {
	Aeropuerto aeropuerto;
	Cliente cliente1;
	LocalDateTime fecha;
	@BeforeEach
	void setUp() throws Exception {
		aeropuerto = new Aeropuerto();
		cliente1   = mock(Cliente.class);
		fecha = mock(LocalDateTime.class);
	}

	@Test
	void test() {		
		aeropuerto.registrarVuelo("Objetos 3");
		aeropuerto.addObsFlight("Objetos 3", cliente1);
		aeropuerto.departFlight("Objetos 3", fecha);
		verify(cliente1, times(1)).updateObsFlight("Objetos 3"); 
	}

}
