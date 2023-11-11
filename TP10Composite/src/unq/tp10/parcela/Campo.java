package unq.tp10.parcela;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	List<Cultivo> parcelas = new ArrayList<Cultivo>();
	
	public int getPrecio() {
		return parcelas.stream()
				.mapToInt(cul -> cul.getPrecio())
				.sum();
	}
	
	public void agregarCultivo(Cultivo cult) {
		parcelas.add(cult);
	}
}
