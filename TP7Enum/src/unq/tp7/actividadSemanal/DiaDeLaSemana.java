package unq.tp7.actividadSemanal;

public enum DiaDeLaSemana {
	LUNES(false), MARTES(false), MIERCOLES(false), JUEVES(true), SABADO(true), DOMINGO(true);
	
	private boolean diaConcurrente;
	
	DiaDeLaSemana(boolean diaConcurrente) {
		this.diaConcurrente = diaConcurrente;
	}
	boolean esDiaConcurrente() {
		return diaConcurrente;
	}
}
