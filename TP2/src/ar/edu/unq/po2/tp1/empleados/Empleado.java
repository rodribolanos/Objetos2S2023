package ar.edu.unq.po2.tp1.empleados;
import java.time.LocalDate;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected LocalDate fechaDeNacimiento;
	protected int sueldoBasico;
	//Constructor 
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	//GETTERS
	protected int getSueldoBasico() {
		return sueldoBasico;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public int edad() {
		LocalDate diaHoy = LocalDate.now();
		return diaHoy.getYear() - fechaDeNacimiento.getYear();
	}	
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public abstract int sueldoBruto();
	
	public int retenciones() {
		return this.gastosObraSocial() + this.aportesJubilatorios() + this.gastosAdministrativos();
	}
	
	protected int gastosAdministrativos() {
		return 0;
	}

	protected abstract int gastosObraSocial();
	
	protected abstract int aportesJubilatorios();
	
	
	public abstract String desgloceDeSueldos(); 
}
