package unq.tp5.mercadoCentral;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(int precio) {
		super(precio);
	}

	@Override 
	public int getPrecio() {
		return (int) (super.getPrecio() * 0.90);
	}
}
