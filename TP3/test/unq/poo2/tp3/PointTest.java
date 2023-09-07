package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	Point punto1;
	Point punto2;
	Point punto3;  
	@BeforeEach
	void setUp() throws Exception {
		punto1 = new Point(2,3);
		punto2 = new Point(); // Creacion de punto con x e y 0 y 0
		punto3 = new Point(4,5);
	}

	@Test
	void CreacionDePuntos() {
		assertEquals(punto1.getX(), 2);
		assertEquals(punto2.getX(), 0);
		assertEquals(punto2.getY(), 0);
	}
	
	@Test
	void sumaDePuntos() {
		assertEquals(punto1.sumarseCon(punto2).getX(), 2);
		assertEquals(punto1.sumarseCon(punto3).getX(), 6);
		assertEquals(punto1.sumarseCon(punto3).getY(), 8);
	}

}
