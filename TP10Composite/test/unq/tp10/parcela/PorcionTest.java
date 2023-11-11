package unq.tp10.parcela;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PorcionTest {
	Trigo trigo;
	Soja soja;
	Trigo trigo1;
	Porcion porcion;
	@BeforeEach
	void setUp() throws Exception {
		trigo = mock(Trigo.class);
		trigo1 = mock(Trigo.class);
		soja = mock(Soja.class);
		porcion = new Porcion();
	}

	@Test
	void test() {
		when(trigo.getPrecio()).thenReturn(300);
		when(trigo1.getPrecio()).thenReturn(300);
		when(soja.getPrecio()).thenReturn(500);
		porcion.agregarCultivo(trigo1);
		porcion.agregarCultivo(trigo);
		porcion.agregarCultivo(soja);
		assertEquals(porcion.getPrecio(), 1100);
	}

}
