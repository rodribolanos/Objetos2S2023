package unq.tp7.actividadSemanal;

public class ActividadSemanal implements Comparable<ActividadSemanal>{
	public ActividadSemanal(DiaDeLaSemana dia, int horario, Actividad actividad, int duracion) {
		super();
		this.dia = dia;
		this.horario = horario;
		this.actividad = actividad;
		this.duracion = duracion;
	}

	private DiaDeLaSemana dia;
	private int horario;
	private Actividad actividad;
	private int duracion;
	
	public int costo() {
		return this.valorPorDia() + this.valorPorComplejidad();
	}

	private int valorPorComplejidad() {
		return actividad.complejidad() * 200;
	}

	private int valorPorDia() {
		if (dia.esDiaConcurrente()) {
			return 500;
		} else {
			return 0;
		}
	}

	public boolean esDeFutbol() {
		return actividad == Actividad.FUTBOL;
	}
	
	public boolean esDeComplejidad(int c) {
		return actividad.complejidad() == c;
	}
	
	public int duracion() {
		return duracion;
	}

	@Override
	public int compareTo(ActividadSemanal act) {
		return this.costo() - act.costo();
	}

	public Actividad actividad() {
		return actividad;
	}
	
	@Override 
	public String toString() {
		return "Deporte:" + actividad + 
				"Dia:" + dia + "a las" + horario + 
				"Duracion:" + duracion + "hora/s";
	}
	
}
