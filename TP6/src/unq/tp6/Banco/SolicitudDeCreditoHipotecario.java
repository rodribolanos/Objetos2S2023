package unq.tp6.Banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	
	private Propiedad propiedad; 
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, int monto, int meses, Propiedad propiedad) {
		super(cliente, monto, meses);
		this.propiedad = propiedad;
		porcentajeMinimo = 0.7;
	}
	
	@Override
	public int montoMensual() {
		return monto / meses;
	}

	@Override
	public boolean aprobada() {
		return this.superaMontoPorcentual() && this.superaPorcentajePropiedad() && this.pasaLimiteDeEdad(); 
	}
	
	protected boolean superaPorcentajePropiedad() {
		return (propiedad.getValorFiscal() * 0.7) > this.montoMensual();
	}
	
	protected boolean pasaLimiteDeEdad() {
		return (cliente.getEdad() + meses / 12)< 65;
	}

}
