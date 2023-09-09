package unq.tp4.trabajador;

import java.text.DateFormatSymbols;

public class Ingreso {
	private int mes;
	private String Concepto;
	private int monto;

	public Ingreso(int mes, String concepto, int monto) {
		this.mes = mes;
		Concepto = concepto;
		this.monto = monto;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getMonto() {
		return monto;
	}
	
	public int getMontoImponible() {
		return monto;
	}
}	
