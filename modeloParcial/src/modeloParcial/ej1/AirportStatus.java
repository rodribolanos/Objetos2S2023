package modeloParcial.ej1;

import java.time.LocalDateTime;

public interface AirportStatus {
	public void airportStatusOK();
	
	public void airportClosedWeather(WeatherEvent event);
	
	public void airportClosed(String reason);
	
	public void departFlight(String vuelo, LocalDateTime fecha);
	
	public void arriveFlight(String vuelo, LocalDateTime fecha);
	
	public void addObsEvents(ObserverAirport obs);
	
	public void addObsFlight(String vuelo, ObserverAirport obs);

	public void addObsAirport(ObserverAirport obs);
	
	public void unsuscribeObsEvents(ObserverAirport obs);
	
	public void unsuscribeObsFlight(String vuelo, ObserverAirport obs);

	public void unsuscribeObsAirport(ObserverAirport obs);
}
