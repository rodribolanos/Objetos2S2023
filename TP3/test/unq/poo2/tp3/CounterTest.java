package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {

	Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}
	
	@Test 
	public void testNumerosImpares() {
		int cantidad = counter.cantidadDeImpares();
		
		assertEquals(cantidad, 9);
	}
	@Test
	public void cantidadDePares() {
int cantidad = counter.cantidadDePares();
		
		assertEquals(cantidad, 1);
	}
	
	

}
