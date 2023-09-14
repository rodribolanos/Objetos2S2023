package unq.tp5.pagables;

import unq.tp5.mercadoCentral.Agencia;
import unq.tp5.mercadoCentral.Caja;

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
		stock = stock - 1;
	}
}
