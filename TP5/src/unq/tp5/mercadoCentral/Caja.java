package unq.tp5.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> stock = new ArrayList<Producto>();
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void registrarProducto(Producto producto) {
		stock.remove(producto);
		productos.add(producto);
	}
	
	public int getMontoTotal() {
		return productos.stream().mapToInt(producto -> producto.getPrecio()).sum();
	}stock
}
