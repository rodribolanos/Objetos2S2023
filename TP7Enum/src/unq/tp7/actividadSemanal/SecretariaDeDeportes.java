package unq.tp7.actividadSemanal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecretariaDeDeportes {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public List<ActividadSemanal> lasActividadesDeFutbol() {
		return actividades.stream()
				.filter(actividad -> actividad.esActividadDe(Deporte.FUTBOL))
				.toList();
 	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return actividades.stream()
				.filter(actividad -> actividad.esDeComplejidad(complejidad))
				.toList();
	}
	
	public int duracionDeActividades() {
		return actividades.stream()
				.mapToInt(act -> act.getDuracion())
				.sum();
	}
	
	public ActividadSemanal laDeMenorCosteDe(Deporte dep) {
		return actividades.stream()
				.filter(actividad -> actividad.esActividadDe(dep))
				.min(Comparator.naturalOrder()).get();
	}
	
	public Map<Deporte, ActividadSemanal> actividadPorMenorValor() {
		Map<Deporte, ActividadSemanal> mapDeAct = actividades.stream()
				.collect(Collectors.groupingByConcurrent(ActividadSemanal::getDeporte ,Collectors.minBy(Comparator.comparing(ActividadSemanal::getCosto))))
	            .entrySet()
	            .stream()
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    entry -> entry.getValue().orElse(null)));
		
		return mapDeAct; 
	}

	
	public void agregarActividad(ActividadSemanal actS) {
		actividades.add(actS);
	}
	
	public void imprimirTodas() {
		actividades.stream().forEach(act -> System.out.println(act.toString()));
	}
}
