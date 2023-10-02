package unq.tp7.actividadSemanal;

public enum Actividad {
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3), JABALINA(4);
	
	private int complejidad;
	
	Actividad(int complejidad) {
		this.complejidad = complejidad;
	}
	public int complejidad() {
		return complejidad;
	}
}
