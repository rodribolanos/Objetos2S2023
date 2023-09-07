package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FormasTest {
	Rectangulo rectangulo;
	Cuadrado cuadrado;
	Point puntoCuadrado;
	Point puntoRectangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		puntoRectangulo = new Point(10,20);
		puntoCuadrado = new Point(10,20);
		rectangulo = new Rectangulo(puntoRectangulo, 4, 5);
		cuadrado = new Cuadrado(puntoCuadrado, 10);
	}

	@Test
	void rectangulo() {
		assertEquals(rectangulo.perimetro(), 18);
		assertEquals(rectangulo.area(), 20);
	}
	
	@Test
	void cuadrado() {
		assertEquals(cuadrado.perimetro(), 40);
		assertEquals(cuadrado.area(), 100);
	}
}
