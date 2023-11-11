package modeloParcial.ej1;

public class Cliente implements ObserverAirport {
	
	public void suscribirseEventos(AirportStatus observado) {
		observado.addObsEvents(this);
	}
	
	public void suscribirseAVuelo(AirportStatus observado, String vuelo) {
		observado.addObsFlight(vuelo, this);
	}
	@Override
	public void updateObsEvents() {
		
	}

	@Override
	public void updateObsFlight(String vuelo) {
		
	}

	@Override
	public void updateObsAirport() {
		
	}

}
