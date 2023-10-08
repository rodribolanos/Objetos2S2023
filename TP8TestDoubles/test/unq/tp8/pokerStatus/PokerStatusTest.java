package unq.tp8.pokerStatus;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class PokerStatusTest {
	private PokerStatus pokerS;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
	this.pokerS = new PokerStatus();
	// Set up dummys 
	carta1 = mock(Carta.class);
	carta2 = mock(Carta.class);
	carta3 = mock(Carta.class);
	carta4 = mock(Carta.class);
	carta5 = mock(Carta.class);
	}

	@Test
	void testInOrder() {
		InOrder order = inOrder(carta1);
		this.pokerS.verificar(carta1,carta2,carta3,carta4,carta5);
		order.verify(carta1).getPalo();
		order.verify(carta1).getNumero();
	}
	
}
