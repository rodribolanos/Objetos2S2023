package unq.poo2.tp3;

public class Rectangulo {
	private Point esquinaSuperiorDerecha;
	private Point esquinaSuperiorIzquierda;
	private Point esquinaInferiorDerecha;
	private Point esquinaInferiorIzquierda;
	
	public Rectangulo(Point esquinaSuperiorIzquierda, int ancho, int altura) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		// Seteado el primer punto del rectangulo. El ancho implicara mover este punto a la derecha la distancia dada
		// La altura implicara bajar el Y el largo dado 
		this.esquinaSuperiorDerecha   = new Point(esquinaSuperiorIzquierda.getX() + ancho, esquinaSuperiorIzquierda.getY());
		this.esquinaInferiorIzquierda   = new Point(esquinaSuperiorIzquierda.getX(), esquinaSuperiorIzquierda.getY() - altura);
		this.esquinaInferiorDerecha   = new Point(esquinaInferiorIzquierda.getX() + ancho, esquinaInferiorIzquierda.getY());
	}
	
	private int ancho() {
		return esquinaSuperiorDerecha.getX() - esquinaSuperiorIzquierda.getX(); 
	}
		
	public int area() {
		return this.ancho() * this.altura(); 
	}
	
	public int perimetro() {
		return (this.ancho() * 2) + (this.altura() * 2);
	}
	
	private int altura() {
		return esquinaSuperiorDerecha.getY() - esquinaInferiorDerecha.getY();
	}

	
}
