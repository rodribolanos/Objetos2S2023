package unq.poo2.tp3;

public class Point {
	private int x = 0;
	private int y = 0;
	// Constructor 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {}

	public void moverPunto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarseCon(Point punto) {
		return new Point (this.nuevoValorX(punto), this.nuevoValorY(punto));
	}
	
	private int nuevoValorX(Point punto) {
		return this.getX() + punto.getX();
	}
	
	private int nuevoValorY(Point punto) {
		return this.getY() + punto.getY();
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
