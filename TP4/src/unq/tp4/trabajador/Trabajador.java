package unq.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public int getTotalPercibido() {
		return ingresos.stream().mapToInt(ingreso -> ingreso.getMonto()).sum();
	}
	
	public int getMontoImponible() {
		return ingresos.stream().mapToInt(ingreso -> ingreso.getMontoImponible()).sum();
	}
	
	public double getImpuestoAPagar() {
		return (this.getMontoImponible() * 2 / 100); 
	}
	
	public void generarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
}
