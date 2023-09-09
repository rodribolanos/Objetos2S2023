package unq.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuentoAAplicar = 0.10;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuentoAAplicar) {
		super(nombre, precio);
		this.descuentoAAplicar = descuentoAAplicar;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean preciosCuidados, double descuentoAAplicar) {
		super(nombre, precio, preciosCuidados);
		this.descuentoAAplicar = descuentoAAplicar;
	}

	@Override 
	public double getPrecio() {
		return super.getPrecio() * (1 - descuentoAAplicar);
	}
}
