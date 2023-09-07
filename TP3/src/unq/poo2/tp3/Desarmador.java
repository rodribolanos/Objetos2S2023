package unq.poo2.tp3;

import java.util.List;

public class Desarmador {
	
	
	public int elQueMasPares(List<Integer> arreglo) {
		int numeroConMasPares =  arreglo.get(0);
		for (Integer num : arreglo) {
			numeroConMasPares = maxPares(numeroConMasPares, num);
		}
		return numeroConMasPares;
	}
	
	private int maxPares(int n, int j) {
		if (this.cantidadDePares(n) > this.cantidadDePares(j)) {
			return n;
		} else {
			return j;
		}
	}
	
	private int cantidadDePares(int n) {
		int paresHastaAhora = 0;
	    while (n > 0) {  
	    	paresHastaAhora = paresHastaAhora + this.unoSiEsPar(n);
	    	
	    	n = n / 10;
	    }
		return paresHastaAhora;
	}
	
	private boolean esPar(int n) {
		return (n % 2) == 0;
	}
	
	private int unoSiEsPar(int n) {
		if (this.esPar(n)) {
			return 1;
		} else {
			return 0;
		}
	}
}
