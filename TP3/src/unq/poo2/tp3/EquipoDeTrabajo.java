package unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String string) {
		this.nombre = string;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int promedioDeEdad() {
		return integrantes.stream().mapToInt(persona -> persona.edad()).sum() / integrantes.size();
	}
	
	public void contratar(Persona p) {
		integrantes.add(p);
	}
}
