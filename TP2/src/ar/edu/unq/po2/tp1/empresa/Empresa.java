package ar.edu.unq.po2.tp1.empresa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp1.empleados.Empleado;

public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private List<ReciboDeHaberes> recibosEmitidos = new ArrayList<ReciboDeHaberes>();
	//Constructor 
	public Empresa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public void contratarTrabajador(Empleado empleado) {
		empleados.add(empleado);
	}
	public void realizarLiqDeSueldos() {
		empleados.stream().forEach(empleado -> this.liquidarSueldo(empleado));
	}
	
	private void liquidarSueldo(Empleado e) {
		recibosEmitidos.add(new ReciboDeHaberes(e.getNombre(), e.getDireccion(), LocalDate.now(), e.sueldoNeto(), e.sueldoBruto(), e.desgloceDeSueldos()));		
	}
	
	public int montoNetoSueldos() {
		int sumaSueldosNetos = 0;
		 for(Empleado e : empleados) {
			 sumaSueldosNetos += e.sueldoNeto();
		}
		 return sumaSueldosNetos;
	}
	
	public int montoBrutoSueldos() {
		int sumaSueldosBrutos = 0;
		for (Empleado e : empleados) {
			sumaSueldosBrutos += e.sueldoBruto();
		}
		return sumaSueldosBrutos;
	}
	
	public int montoRetenciones() {
		int sumaRetenciones = 0;
		for (Empleado e : empleados) {
			sumaRetenciones += e.retenciones();
		}
		return sumaRetenciones;
	}
	
	public List<ReciboDeHaberes> getRecibosEmitidos() {
		return recibosEmitidos;
	}
}
