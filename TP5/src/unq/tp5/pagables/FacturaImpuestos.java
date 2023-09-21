package unq.tp5.pagables;

import unq.tp5.mercadoCentral.Agencia;

public class FacturaImpuestos extends Factura {
	private int tasaDeServicio;
	
	public FacturaImpuestos(Agencia agencia, int tasaDeServicio) {
		super(agencia);
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public int getPrecio() {
		return tasaDeServicio;
	}
}
