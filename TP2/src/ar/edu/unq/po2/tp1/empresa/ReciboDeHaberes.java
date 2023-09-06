package ar.edu.unq.po2.tp1.empresa;
import java.time.LocalDate;

public class ReciboDeHaberes {
	public String nombreEmpleado;
	public String direccion;
	public LocalDate fechaDeEmision;
	public int sueldoNeto;
	public int sueldoBruto;
	public String desgloceDeSueldos;
	
	public ReciboDeHaberes (String nombre, String direc, LocalDate fechaEmision, int sueldoN, int sueldoB, String desgloceDeSueldos) {
		this.nombreEmpleado = nombre;
		this.direccion = direc;
		this.fechaDeEmision = fechaEmision;
		this.sueldoNeto = sueldoN;
		this.sueldoBruto = sueldoB;
		this.desgloceDeSueldos = desgloceDeSueldos;
	}
}
