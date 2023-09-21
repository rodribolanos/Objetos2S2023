package unq.tp5.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

import unq.tp5.pagables.Factura;
import unq.tp5.pagables.Pagable;

public class Caja {
	private List<Pagable> compra = new ArrayList<Pagable>();
		
	public void registrarPago(Pagable pagable) {
		compra.add(pagable);
		pagable.serPagado();
	}
	
	public int getMontoTotal() {
		return compra.stream().mapToInt(producto -> producto.getPrecio()).sum();
	}
}
