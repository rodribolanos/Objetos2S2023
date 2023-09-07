package unq.poo2.tp3;

import java.util.List;
import java.util.stream.Collectors;

public class Multioperador {
	
	public int sumarTodos(List<Integer> numeros) {
		return numeros.stream().collect(Collectors.summingInt(numero -> numero));
	}
	
	public int multiplicarTodos(List<Integer> numeros) {
		return numeros.stream().reduce(1, (n1,n2) -> n1 * n2);
	}
	
	public int restarTodos(List<Integer> numeros) {
		return numeros.stream().reduce((n1,n2) -> n1 - n2).orElse(0);
	}
}
