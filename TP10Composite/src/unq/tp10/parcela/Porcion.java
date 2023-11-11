package unq.tp10.parcela;

import java.util.ArrayList;
import java.util.List;

public class Porcion implements Cultivo {
	private List<Cultivo> cultivos = new ArrayList<Cultivo>();

	@Override
	public int getPrecio() {
		return cultivos.stream()
				.mapToInt(cultivo -> cultivo.getPrecio())
				.sum();
	}
	
	public void agregarCultivo(Cultivo cultivo) {
		if (cultivos.size() < 4) {
			cultivos.add(cultivo);
		}
	}

}
