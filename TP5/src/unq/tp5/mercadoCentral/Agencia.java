package unq.tp5.mercadoCentral;

import java.util.List;

import unq.tp5.pagables.Factura;

public interface Agencia {
	
	public void registrarPago(Factura factura);
	
	public List<Factura> getFacturasRegistradas();
}
