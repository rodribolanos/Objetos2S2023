package unq.tp7.actividadSemanal;

public class ActividadSemanal implements Comparable<ActividadSemanal>{
	public ActividadSemanal(DiaDeLaSemana dia, int horario, Deporte deporte, int duracion) {
		super();
		this.dia = dia;
		this.horario = horario;
		this.deporte = deporte;
		this.duracion = duracion;
	}

	private DiaDeLaSemana dia;
	private int horario;
	private Deporte deporte;
	private int duracion;
	
	public int getCosto() {
		return this.valorPorDia() + this.valorPorComplejidad();
	}

	private int valorPorComplejidad() {
		return deporte.complejidad() * 200;
	}

	private int valorPorDia() {
		if (dia.esDiaConcurrente()) {
			return 500;
		} else {
			return 0;
		}
	}
	
	public boolean esDeComplejidad(int c) {
		return deporte.complejidad() == c;
	}
	
	public int getDuracion() {
		return duracion;
	}

	@Override
	public int compareTo(ActividadSemanal act) {
		return this.getCosto() - act.getCosto();
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
	@Override 
	public String toString() {
		return "Deporte: " + deporte.name() +  
				". Dia: " + dia.name() + " a las " + horario + 
				". Duracion: " + duracion + " hora/s.";
	}

	public boolean esActividadDe(Deporte act) {
		return deporte == act;
	}
	
}
