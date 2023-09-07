package unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public int cantidadDePares() {
		return (int) (numeros.stream().filter(n -> this.esPar(n)).count());
	}
	
	private boolean esPar(int n) {
		return (n % 2) == 0;
	}
	
	public int cantidadDeImpares() {
		return (int) (numeros.stream().filter(n -> !this.esPar(n)).count());
	}
	
	public int cantidadDeMultiplos(int divisor) {
		return (int) (numeros.stream().filter(n -> this.esMultiplo(n, divisor)).count());
	}
	
	private boolean esMultiplo(int dividendo, int divisor) {
		return (dividendo % divisor) == 0;
	}
	
	public void addNumber(int n) {
		numeros.add(n);
	}
}
