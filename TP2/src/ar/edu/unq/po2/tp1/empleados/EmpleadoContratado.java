package ar.edu.unq.po2.tp1.empleados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp1.empresa.Concepto;

public class EmpleadoContratado extends Empleado{

	private int numeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico();
	}
	@Override 
	protected int gastosAdministrativos() {
		return 50;
	}
	public List<Concepto> desgloceDeSueldos() {
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.add(new Concepto("Sueldo basico", this.getSueldoBasico() ));
		conceptos.add(new Concepto("Gastos obra social", this.gastosObraSocial() ));
		conceptos.add(new Concepto("Aportes jubilatorios", this.aportesJubilatorios() ));
		conceptos.add(new Concepto("Gastos administrativos", this.gastosAdministrativos() ));
		
		return conceptos;
	}

	@Override
	protected int gastosObraSocial() {
		return 0;
	}

	@Override
	protected int aportesJubilatorios() {
		return 0;
	} 
	
	
}
