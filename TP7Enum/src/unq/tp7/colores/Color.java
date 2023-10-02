package unq.tp7.colores;

public enum Color {
	ROJO("Sangriento", 4), GRIS("Gotea",3), AMARILLO("Esta mejor", 2), MIEL("Curada", 1); 
	
	private String descripcion;
	private int nivelPeligrosidad;
		
	Color(String descripcion, int nivelPeligrosidad ) {
		this.descripcion = descripcion;
		this.nivelPeligrosidad = nivelPeligrosidad;
	}
	
	public Color proximoColor() {
	int numProx = (this.ordinal() + 1)% values().length;
		return Color.values()[numProx];
	}
}
