package unq.tp5.pagables;

public class FacturaServicios extends Factura {
	private int unidades;
	private int unidadesPeriodo;
	
	@Override
	public int getPrecio() {
		return unidades * unidadesPeriodo;
	}

}
