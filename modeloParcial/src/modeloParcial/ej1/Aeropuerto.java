package modeloParcial.ej1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aeropuerto implements AirportStatus {
	private List<ObserverAirport> obsGlobales  = new ArrayList<ObserverAirport>();
	private List<ObserverAirport> obsEventos   = new ArrayList<ObserverAirport>();
	private Map<String, List<ObserverAirport>> mapVuelos = new HashMap<String, List<ObserverAirport>>();
	
	public void registrarVuelo(String vuelo) {
			List<ObserverAirport> vacio = new ArrayList<ObserverAirport>();
			mapVuelos.put(vuelo, vacio);		
	}
	
	@Override
	public void airportStatusOK() {
		obsGlobales.stream().forEach(obs -> obs.updateObsAirport());
		obsEventos.stream().forEach(obs -> obs.updateObsEvents());
	}

	@Override
	public void airportClosedWeather(WeatherEvent event) {
		obsGlobales.stream().forEach(obs -> obs.updateObsAirport());
		obsEventos.stream().forEach(obs -> obs.updateObsEvents());
	}

	@Override
	public void airportClosed(String reason) {
		obsGlobales.stream().forEach(obs -> obs.updateObsAirport());
		obsEventos.stream().forEach(obs -> obs.updateObsEvents());
	}

	@Override
	public void departFlight(String vuelo, LocalDateTime fecha) {
		obsGlobales.stream().forEach(obs -> obs.updateObsFlight(vuelo));
		mapVuelos.get(vuelo).stream().forEach(obs -> obs.updateObsFlight(vuelo));
	}

	@Override
	public void arriveFlight(String vuelo, LocalDateTime fecha) {
		obsGlobales.stream().forEach(obs -> obs.updateObsFlight(vuelo));
		mapVuelos.get(vuelo).stream().forEach(obs -> obs.updateObsFlight(vuelo));
	}

	@Override
	public void addObsEvents(ObserverAirport obs) {
		obsEventos.add(obs);
	}

	@Override
	public void addObsFlight(String vuelo, ObserverAirport obs) {
			mapVuelos.get(vuelo).add(obs); 
	}

	@Override
	public void addObsAirport(ObserverAirport obs) {
		obsGlobales.add(obs);
	}

	@Override
	public void unsuscribeObsEvents(ObserverAirport obs) {
		obsEventos.remove(obs);
	}

	@Override
	public void unsuscribeObsFlight(String vuelo, ObserverAirport obs) {
		mapVuelos.get(vuelo).remove(obs);
	}

	@Override
	public void unsuscribeObsAirport(ObserverAirport obs) {
		obsGlobales.remove(obs);
	}		
}