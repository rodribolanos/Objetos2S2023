package unq.tp8.pokerStatus;

public class PokerStatus {
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		if (this.esColor(c1,c2,c3,c4,c5)) { 
			return "Color";
		} else if (this.esPoker(c1,c2,c3,c4,c5)) {
			return "Poker";
		} else if (this.esTrio(c1,c2,c3,c4,c5)) {
			return "Trio";
		} else { 
			return "";
		}
	}

	private boolean esColor(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		return (c1.getPalo() == c2.getPalo()) && c2.getPalo() == c3.getPalo() && c3.getPalo() == c4.getPalo() && c4.getPalo() == c5.getPalo();
	}
	private boolean esTrio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		return (c1.getNumero() == c2.getNumero()) && c1.getNumero() == c3.getNumero() ||
				(c1.getNumero() == c2.getNumero()) && c1.getNumero() == c4.getNumero() ||
				(c1.getNumero() == c2.getNumero()) && c1.getNumero() == c5.getNumero() ||
				(c1.getNumero() == c3.getNumero()) && c1.getNumero() == c4.getNumero() ||
				(c1.getNumero() == c3.getNumero()) && c1.getNumero() == c5.getNumero() ||
				(c1.getNumero() == c4.getNumero()) && c1.getNumero() == c5.getNumero() ||		
				(c2.getNumero() == c3.getNumero()) && c2.getNumero() == c4.getNumero() ||
				(c2.getNumero() == c3.getNumero()) && c2.getNumero() == c5.getNumero() ||
				(c2.getNumero() == c4.getNumero()) && c2.getNumero() == c5.getNumero() ||
				(c3.getNumero() == c4.getNumero()) && c3.getNumero() == c5.getNumero();
	}

	private boolean esPoker(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		return (c1.getNumero() == c2.getNumero() && c1.getNumero() == c3.getNumero() && c1.getNumero() == c4.getNumero()) ||
				(c1.getNumero() == c2.getNumero() && c1.getNumero() == c3.getNumero() && c1.getNumero() == c5.getNumero()) || 
				(c1.getNumero() == c3.getNumero() && c1.getNumero() == c4.getNumero() && c1.getNumero() == c5.getNumero()) ||
				(c1.getNumero() == c2.getNumero() && c1.getNumero() == c4.getNumero() && c1.getNumero() == c5.getNumero()) ||
				(c2.getNumero() == c3.getNumero() && c2.getNumero() == c4.getNumero() && c2.getNumero() == c5.getNumero()); 
	}
}
