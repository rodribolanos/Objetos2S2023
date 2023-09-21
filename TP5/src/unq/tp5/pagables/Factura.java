package unq.tp5.pagables;

import unq.tp5.mercadoCentral.Agencia;

public abstract class Factura implements Pagable{
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}

	private Agencia agencia;
	
	public abstract int getPrecio();
	
	public void serPagado() {
		agencia.registrarPago(this);
	}
}
