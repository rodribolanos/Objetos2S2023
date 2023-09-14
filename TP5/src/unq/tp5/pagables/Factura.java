package unq.tp5.pagables;

import unq.tp5.mercadoCentral.Agencia;

public abstract class Factura {
	
	private Agencia agencia;
	
	public abstract int getPrecio();
	
	public void serPagado() {
		agencia.registrarPago(this);
	}
}
