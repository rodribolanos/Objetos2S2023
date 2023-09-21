package unq.tp5.pagables;

public abstract class Producto implements Pagable{
	private int stock;
	private int precio;
	// CONSTRUCTOR 
	public Producto(int precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void serPagado() { //Resta 1 a su stock 
		if (this.puedeSerVendido()) {
		stock = getStock() - 1;
		}
	}

	public int getStock() {
		return stock;
	}
	
	public boolean puedeSerVendido() {
		return stock > 0;
	}
}
