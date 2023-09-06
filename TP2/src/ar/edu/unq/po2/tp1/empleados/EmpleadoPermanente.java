package ar.edu.unq.po2.tp1.empleados;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	//GETTERS 
	protected int getAntiguedad() {
		return antiguedad;
	}
	private int getCantHijos() {
		return cantidadDeHijos;
	}
	
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar(); 
	}
	
	private int salarioFamiliar() {
		return this.asigPorHijo() + this.asigPorConyuge() + this.sueldoAntiguedad() ;
	}
	private int asigPorHijo() {
		return 150 * cantidadDeHijos;
	}
	
	private int asigPorConyuge() {
	if (estadoCivil == "Casado") {
		 return 100;
	 } else {
		 return 0;
	 }
	}
	
	private int sueldoAntiguedad() {
		return 50 * this.getAntiguedad();
	}
	// Formas de calcular retenciones. 
	@Override
	protected int gastosObraSocial() {
		return (int) (this.sueldoBruto() * 0.10) + (20 * this.getCantHijos()); 
	}
	@Override
	protected int aportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.15);
	}
	
	public String desgloceDeSueldos() {
	return "Sueldo neto $:" + this.sueldoNeto() +  
		 	   "\nSueldo bruto $:" + this.sueldoBruto() +
		 	   "\nDetalle:"
		 	   + "\nSalario familiar: $" + this.salarioFamiliar() +
		 	   "\nSueldo basico: $"  + this.getSueldoBasico() +
		 	   "\n Retenciones: $" + this.retenciones() +
			   "\nObra social: $" + this.gastosObraSocial() +
			   "\nAportes jubilatorios: $" + this.aportesJubilatorios(); 
	}	 	   
}
