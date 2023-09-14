package unq.tp5.pagables;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(int precio, int stock) {
		super(precio, stock);
	}

	@Override 
	public int getPrecio() {
		return (int) (super.getPrecio() * 0.90);
	}
}
