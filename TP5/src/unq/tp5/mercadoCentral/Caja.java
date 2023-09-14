package unq.tp5.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

import unq.tp5.pagables.Pagable;
import unq.tp5.pagables.Producto;

public class Caja {
	private List<Pagable> compra = new ArrayList<Pagable>();
		
	public void registrarPago(Pagable elemento) {
		compra.add(elemento);
		elemento.serPagado();
	}
	
	public int getMontoTotal() {
		return compra.stream().mapToInt(producto -> producto.getPrecio()).sum();
	}
}
