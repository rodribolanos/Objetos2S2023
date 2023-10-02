package unq.tp7.actividadSemanal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecretariaDeDeportes {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public List<ActividadSemanal> lasActividadesDeFutbol() {
		return actividades.stream()
				.filter(actividad -> actividad.esDeFutbol())
				.toList();
 	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return actividades.stream()
				.filter(actividad -> actividad.esDeComplejidad(complejidad))
				.toList();
	}
	
	public int duracionDeActividades() {
		return actividades.stream()
				.mapToInt(act -> act.duracion())
				.sum();
	}
	
	public Map<Actividad, ActividadSemanal> actividadPorMenorValor() {
		Map<Actividad, ActividadSemanal> mapDeAct = new HashMap<Actividad, ActividadSemanal>();
		actividades.stream()
			.filter(actS -> this.esLaMasBarata(actS, actividades))
			.forEach(actividadS -> mapDeAct.put(actividadS.actividad(),actividadS));
		
		return mapDeAct; 
	}

	private boolean esLaMasBarata(ActividadSemanal actS, List<ActividadSemanal> actividades2) {
		return actS == actividades2.stream()
				.filter(act -> actS.actividad() == act.actividad())
				.min(Comparator.naturalOrder()).get();
	}
	
	public void agregarActividad(ActividadSemanal actS) {
		actividades.add(actS);
	}
	
	public void imprimirTodas() {
		actividades.stream().forEach(act -> System.out.println(act.toString()));
	}
}
