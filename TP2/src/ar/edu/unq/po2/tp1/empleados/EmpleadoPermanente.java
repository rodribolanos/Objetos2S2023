package ar.edu.unq.po2.tp1.empleados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp1.empresa.Concepto;

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
	
	public List<Concepto> desgloceDeSueldos() {
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.add(new Concepto("Sueldo basico", this.getSueldoBasico() ));
		conceptos.add(new Concepto("Salario familiar", this.salarioFamiliar() ));
		conceptos.add(new Concepto("Gastos obra social", this.gastosObraSocial() ));
		conceptos.add(new Concepto("Aportes jubilatorios", this.aportesJubilatorios() ));
		conceptos.add(new Concepto("Gastos administrativos", 0 ));
		
		return conceptos;

	}	 	   
}
