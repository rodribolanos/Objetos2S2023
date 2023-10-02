package unq.tp7.colores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorTest {

	Color rojo;
	Color amarillo;
	Color gris;
	@BeforeEach
	void setUp() throws Exception {
		rojo = Color.ROJO;
		amarillo = Color.AMARILLO;
		gris = Color.GRIS;
	}

	@Test
	void elProximoDeGrisEsRojo() {
		assertEquals(rojo.proximoColor(), gris);
	}
	
	@Test 
	void enumRotativo() {
		assertEquals(Color.MIEL.proximoColor(), rojo);
	}

}
