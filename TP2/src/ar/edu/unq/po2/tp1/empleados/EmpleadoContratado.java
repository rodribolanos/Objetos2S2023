package ar.edu.unq.po2.tp1.empleados;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado{

	private int numeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
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
	public String desgloceDeSueldos() {
		return "Sueldo neto: $" + this.sueldoNeto() + "\nSueldo bruto: $" + this.sueldoBruto() + "\nDetalle:"+ "\nSueldo basico: $"  + this.getSueldoBasico() + "\nRetenciones: $" + this.retenciones() + "\nGastos Administrativos: $" + this.gastosAdministrativos();
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
