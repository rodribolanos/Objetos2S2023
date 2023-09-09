package unq.tp4.trabajador;

public class IngresoHorasExtra extends Ingreso{
	private int cantidadHorasExtra;

	public IngresoHorasExtra(int mes, String concepto, int monto, int cantidadHorasExtra) {
		super(mes, concepto, monto);
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
	
	@Override 
	public int getMontoImponible() {
		return 0;
	}
	
}
