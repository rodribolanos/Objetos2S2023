package unq.tp6.Banco;

public abstract class SolicitudDeCredito {
	protected Cliente cliente;
	protected int monto;
	protected int meses;
	protected double porcentajeMinimo;
	
	public SolicitudDeCredito(Cliente cliente, int monto, int meses) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.meses = meses;
	}

	public abstract int montoMensual();
	public abstract boolean aprobada();
	
	protected boolean superaMontoPorcentual() {
		return this.montoMensual() < (cliente.ingresosMensuales() * porcentajeMinimo);
	}
}
