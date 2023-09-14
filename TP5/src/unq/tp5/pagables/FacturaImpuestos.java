package unq.tp5.pagables;

public class FacturaImpuestos extends Factura {
	private int tasaDeServicio;
	
	@Override
	public int getPrecio() {
		return tasaDeServicio;
	}
}
