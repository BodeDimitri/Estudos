package model.enteties;

import model.enums.Color;

public class Circle extends AbstractShape {
	
	private Double Radius;

	public Circle(Color color, Double radius) {
		super(color);
		Radius = radius;
	}

	public Double getRadius() {
		return Radius;
	}

	public void setRadius(Double radius) {
		Radius = radius;
	}
	
	@Override
	public double area() {
		return 0;
	}
	
}
