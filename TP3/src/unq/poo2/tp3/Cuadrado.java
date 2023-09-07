package unq.poo2.tp3;

public class Cuadrado {
	private Point esquinaSuperiorDerecha;
	private Point esquinaSuperiorIzquierda;
	private Point esquinaInferiorDerecha;
	private Point esquinaInferiorIzquierda;
	
	public Cuadrado(Point esquinaSuperiorIzquierda, int medidaLado) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		// Seteado el primer punto del rectangulo. El ancho implicara mover este punto a la derecha la distancia dada
		// La altura implicara bajar el Y el largo dado 
		this.esquinaSuperiorDerecha   = new Point(esquinaSuperiorIzquierda.getX() + medidaLado, esquinaSuperiorIzquierda.getY());
		this.esquinaInferiorIzquierda   = new Point(esquinaSuperiorIzquierda.getX(), esquinaSuperiorIzquierda.getY() - medidaLado);
		this.esquinaInferiorDerecha   = new Point(esquinaInferiorIzquierda.getX() + medidaLado, esquinaInferiorIzquierda.getY());
	}
	
	private int lado() {
		return esquinaSuperiorDerecha.getX() - esquinaSuperiorIzquierda.getX(); 
	}
		
	public int area() {
		return this.lado() * this.lado(); 
	}
	
	public int perimetro() {
		return this.lado() * 4;
	}

}
