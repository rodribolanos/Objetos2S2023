package unq.tp6.Banco;

public class Propiedad {
	private String direccion;
	private String descripcion;
	private double valorFiscal;
	
	public Propiedad(String direccion, String descripcion, double valorFiscal) {
		super();
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
	}
	
	public double getValorFiscal() {
		return valorFiscal;
	}
}
