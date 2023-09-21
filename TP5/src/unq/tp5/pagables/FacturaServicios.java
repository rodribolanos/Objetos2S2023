package unq.tp5.pagables;

import unq.tp5.mercadoCentral.Agencia;

public class FacturaServicios extends Factura {
	private int unidades;
	private int unidadesPeriodo;
	
	public FacturaServicios(Agencia agencia, int unidades, int unidadesPeriodo) {
		super(agencia);
		this.unidades = unidades;
		this.unidadesPeriodo = unidadesPeriodo;
	}

	@Override
	public int getPrecio() {
		return unidades * unidadesPeriodo;
	}

}
