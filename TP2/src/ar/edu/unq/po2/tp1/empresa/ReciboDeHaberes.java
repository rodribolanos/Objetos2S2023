package ar.edu.unq.po2.tp1.empresa;
import java.time.LocalDate;
import java.util.List;

public class ReciboDeHaberes {
	public String nombreEmpleado;
	public String direccion;
	public LocalDate fechaDeEmision;
	public int sueldoNeto;
	public int sueldoBruto;
	public List<Concepto> desgloceDeSueldos;
	
	public ReciboDeHaberes (String nombre, String direc, LocalDate fechaEmision, int sueldoN, int sueldoB, List<Concepto> desgloceDeSueldos) {
		this.nombreEmpleado = nombre;
		this.direccion = direc;
		this.fechaDeEmision = fechaEmision;
		this.sueldoNeto = sueldoN;
		this.sueldoBruto = sueldoB;
		this.desgloceDeSueldos = desgloceDeSueldos;
	}
}
