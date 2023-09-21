package unq.tp6.Banco;

public class Cliente {
	private int edad;
	private String nombre;
	private String direccion;
	private String apellido;
	private double ingresosAnuales;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, int edad,  double ingresosAnuales) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.ingresosAnuales = ingresosAnuales;
	}
	
	public double ingresosMensuales() {
		return ingresosAnuales / 12;
	}

	public int getEdad() {
		return edad;
	}

	public double getIngresosAnuales() {
		return ingresosAnuales;
	}
	
	public void solicitarCreditoHipotecario(int monto, int meses, Propiedad propiedad) {
		banco.crearSolicitud(this, monto, meses, propiedad);
	}
	
	public void solicitarCreditoPersonal(int monto, int meses) {
		banco.crearSolicitud(this, monto, meses);
	}
	
	public void serRegistrado(Banco banco) {
		this.banco = banco;
	}
}
