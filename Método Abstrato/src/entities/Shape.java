package entities;

import entities.enums.Color;

public abstract class Shape { //� uma classe abstrata, pq tem um m�todo abstrato.
	
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}
