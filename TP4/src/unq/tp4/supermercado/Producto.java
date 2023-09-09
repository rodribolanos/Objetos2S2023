package unq.tp4.supermercado;

public class Producto {
	private String nombre;
	private double precio;
	private boolean preciosCuidados = false;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = precioCuidado;
	} 
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return preciosCuidados;
	}
	
	public void aumentarPrecio(double cantidad) throws Exception {
		if (cantidad <= precio) {
			this.precio = precio - cantidad;
		} else {
			throw new Exception("No se puede disminuir el precio tanto. Lo vas a regalar!");
		}
	}
}
