package unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTest {
	Desarmador desarm; 
	List<Integer> arreglo;
	
	@BeforeEach 
	public void setUp() {
		desarm = new Desarmador();
		arreglo = new ArrayList<Integer>();
	}
	@Test
	void DevuelveElMaximoNumeroSegunPares() {
		arreglo.add(12345);
		arreglo.add(245680);
		arreglo.add(12);
		arreglo.add(8888888);
		assertEquals(desarm.elQueMasPares(arreglo), 8888888);
	}

}
