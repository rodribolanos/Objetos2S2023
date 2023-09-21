package unq.tp5.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

import unq.tp5.pagables.Factura;

public class AgenciaRecaudadora implements Agencia{
	private String nombre;
	private List<Factura> facturasRegistradas = new ArrayList<Factura>();
	
	@Override
	public void registrarPago(Factura factura) {
		getFacturasRegistradas().add(factura);
	}

	public List<Factura> getFacturasRegistradas() {
		return facturasRegistradas;
	}
}
