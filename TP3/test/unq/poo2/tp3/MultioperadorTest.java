package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	
	Multioperador multioperador;
	List<Integer> arreglo = new ArrayList<Integer>();
	
	@BeforeEach
	void setUp() throws Exception {
		multioperador = new Multioperador();
		arreglo.add(2);
		arreglo.add(3);
		arreglo.add(1);
		arreglo.add(4);
	}

	@Test
	void test() {
		assertEquals(10, multioperador.sumarTodos(arreglo));
		assertEquals(24, multioperador.multiplicarTodos(arreglo));
		assertEquals(-6, multioperador.restarTodos(arreglo)); // 2-3-1-4 = -6
	}

}
