package unq.poo2.tp3;

public class MultiploAlto {
	public int elMultiploMasAlto (int x, int y) {
		// Devuelve el multiplo mas grande entre x e y, entre 1 y 1000
		for (int numero = 1000; numero >0; numero--) {
			if (this.esDivisiblePor(numero, x) && this.esDivisiblePor(numero, y)) {
				return numero;
			}
		}
		 return -1; //Si termina el bucle sin devovler la variable numero es porque no existe numero divisible por x e y entre 0 y 1000

	}
	
	private boolean esDivisiblePor(int x, int y) {
		return (x % y) == 0;
	}
}
