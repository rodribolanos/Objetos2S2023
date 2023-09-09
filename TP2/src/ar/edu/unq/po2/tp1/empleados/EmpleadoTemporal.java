package ar.edu.unq.po2.tp1.empleados;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp1.empresa.Concepto;

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
	@Override
	protected int aportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.10 + 5 * this.getCantidadDeHorasExtra());
	}
	@Override
	protected int gastosObraSocial() {
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
	
	public List<Concepto> desgloceDeSueldos() {
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.add(new Concepto("Sueldo basico", this.getSueldoBasico() ));
		conceptos.add(new Concepto("Horas extra", this.bonoHorasExtra() ));
		conceptos.add(new Concepto("Gastos obra social", this.gastosObraSocial() ));
		conceptos.add(new Concepto("Aportes jubilatorios", this.aportesJubilatorios() ));
		conceptos.add(new Concepto("Gastos administrativos", 0 ));
		
		return conceptos;	
	}	 
}
