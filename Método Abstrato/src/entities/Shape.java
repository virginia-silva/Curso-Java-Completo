package entities;

import entities.enums.Color;

public abstract class Shape { //é uma classe abstrata, pq tem um método abstrato.
	
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
