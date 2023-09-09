package unq.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	List<Producto> catalogo = new ArrayList<Producto>();
	
	Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public void quitarProducto(Producto producto) {
		catalogo.remove(producto);
	}
	
	public int getCantidadDeProductos() {
		return catalogo.size();
	}
	
	public double getPrecioTotal() {
		return catalogo.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
}
