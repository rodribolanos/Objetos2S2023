package unq.poo2.tp3;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	public String getNombre() {
		return nombre;
	}
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public int edad() {
		LocalDate diaHoy = LocalDate.now();
		return diaHoy.getYear() - fechaDeNacimiento.getYear();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
}	
