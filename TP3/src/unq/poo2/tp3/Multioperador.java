package unq.poo2.tp3;

import java.util.List;

public class Multioperador {
	
	public int sumarTodos(List<Integer> numeros) {
		return numeros.stream().mapToInt(null).sum();
	}
}
