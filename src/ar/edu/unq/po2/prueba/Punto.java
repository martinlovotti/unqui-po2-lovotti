package ar.edu.unq.po2.prueba;

public class Punto {
	private float x;
	private float y;
	private String color;
	
	public Punto(float x, float y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
		this.color = "negro";
	}

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return color;
	}
	
}
