package ar.edu.unq.po2.tp1.empleados;
import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{
	private LocalDate fechaDeFinTemporal;
	private int cantidadDeHorasExtra;
	private final int precioPorHoraExtra = 40;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, LocalDate fechaFinTemporal, int cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaDeFinTemporal = fechaFinTemporal;
		this.cantidadDeHorasExtra = cantHorasExtra;
	}
	// Getter 
	private int getCantidadDeHorasExtra() {
		return cantidadDeHorasExtra;
	}
 	public int sueldoBruto() {
		return this.getSueldoBasico() + this.bonoHorasExtra();
	}
	
	public int retenciones() {
		return this.gastosObraSocial() + this.aportesJubilatorios();
	}
	
	private int aportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.10 + 5 * this.getCantidadDeHorasExtra());
	}
	private int gastosObraSocial() {
		return (int) (this.sueldoBruto() * 0.10 + this.extraPorEdad());
	}
	private double extraPorEdad() {
		if (this.edad() > 50) {
			return 25;
		} else {
			return 0;
		}
	}
	private int bonoHorasExtra() {
		return precioPorHoraExtra * this.getCantidadDeHorasExtra();
	}
	
	public String desgloceDeSueldos() {
		return "Sueldo neto:" + this.sueldoNeto() + 
			 	   "Sueldo bruto:" + this.sueldoBruto() +
			 	   "Detalle:"
			 	   + "Horas extra:" + this.bonoHorasExtra() +
			 	   "Sueldo basico:"  + this.getSueldoBasico() +
			 	   "Retenciones:" + this.retenciones() +
				   "Obra social:" + this.gastosObraSocial() +
				   "Aportes jubilatorios:" + this.aportesJubilatorios(); 
		}	 
}
