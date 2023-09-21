package unq.tp6.Banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {
	private final int montoMinimo = 15000;
	
	public SolicitudDeCreditoPersonal(Cliente cliente, int monto, int meses) {
		super(cliente, monto, meses);
		porcentajeMinimo = 0.5;
	}

	@Override
	public int montoMensual() {
		return monto / meses;
	}

	@Override
	public boolean aprobada() {
		return (cliente.getIngresosAnuales() >= montoMinimo) && this.superaMontoPorcentual();
	}
	
}
